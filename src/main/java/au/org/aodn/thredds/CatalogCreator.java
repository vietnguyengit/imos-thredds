package au.org.aodn.thredds;

import au.org.aodn.thredds.xml.catalog.*;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Value;
import software.amazon.awssdk.services.s3.model.*;
import ucar.unidata.io.s3.CdmS3Client;

import javax.annotation.PostConstruct;
import javax.xml.bind.*;

import software.amazon.awssdk.services.s3.S3Client;

import java.io.File;
import java.io.IOException;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.stream.Collectors;

/**
 * This class is used to connect to s3 bucket and scan the directory so that it can generate the catalog.xml on start
 */
public class CatalogCreator {

    private S3Client s3;

    // @Value("${aodn.s3.impersonate:nonproduction-developer}")
    // private String impersonate;

    @Value("${aodn.s3.host:s3.ap-southeast-2.amazonaws.com}")
    private String host;

    @Value("${aodn.s3.bucket:imos-data-wsd}")
    private String bucket;

    @Value("${aodn.zoneId:UTC}")
    private String zoneId;

    @Value("${aodn.timeFormat:yyyy-MM-dd'T'HH:mm:ss'Z'}")
    private String timeFormat;

    @Value("${tds.content.root.path}")
    private String rootPath;

    private ObjectFactory catalogObjectFactory = new ObjectFactory();

    private DateTimeFormatter dateTimeFormatter;

    private Marshaller marshaller;

    private static Comparator<CommonPrefix> SORT_COMMON_PREFIX = Comparator.comparing(CommonPrefix::prefix);

    private static Comparator<S3Object> SORT_S3OBJECT = Comparator.comparing(S3Object::key);

    @PostConstruct
    public void init() throws IOException, JAXBException {
        JAXBContext jaxbContext = JAXBContext.newInstance(Catalog.class);
        marshaller = jaxbContext.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

        /*
        * using a dedicated IAM role with a limited S3 access
        * AWS least privileges concept
        * */
        // s3 = CdmS3Client.acquire(String.format("cdms3://%s@%s/%s", impersonate, host, bucket));
        s3 = CdmS3Client.acquire(String.format("cdms3://%s/%s", host, bucket));

        dateTimeFormatter = DateTimeFormatter.ofPattern(timeFormat).withZone(ZoneId.of(zoneId));

        generateCatalogFromBucket(bucket,null, null);
    }

    public void generateCatalogFromBucket(String bucket, String parentPath, String current) throws JAXBException {

        Catalog root = generateCatalogRoot();

        ListObjectsV2Request.Builder builder = ListObjectsV2Request.builder().bucket(bucket).delimiter("/");
        ListObjectsV2Request req = (parentPath == null) ? builder.build() : builder.prefix(parentPath).build();

        ListObjectsV2Response response = s3.listObjectsV2(req);

        DatasetType ds = addMetadata(generateDatasetType(parentPath, current));
        if(parentPath != null) {
            // You always need to include a dataset at the top for each catalog unless this is the
            // root level catalog.xml
            root.getDataset().add(catalogObjectFactory.createDataset(ds));
        }

        /**
         * For all directory we need to store it in a CatalogRef and provide a link to the catalog file,
         * please refer to the enhanceCatalog.xml section in
         * https://www.unidata.ucar.edu/software/tds/current/tutorial/BasicConfigCatalogs.html
         */
        if(response.hasCommonPrefixes()) {
            // Folder section
            List<CommonPrefix> l = response.commonPrefixes()
                    .stream().sorted(SORT_COMMON_PREFIX).collect(Collectors.toList());

            for(CommonPrefix o : l) {
                String p = o.prefix().substring(0, o.prefix().length() -1);

                if(parentPath != null) {
                    // The path return from S3 is a full path, we need to trim the leading part to get the end
                    // this case not hold if we are at the root folder
                    p = p.replace(parentPath, "");
                }

                if(parentPath == null) {
                    DatasetType ref = addMetadata(generateCatalogRef(null, p));
                    root.getDataset().add(catalogObjectFactory.createCatalogRef((CatalogRef) ref));
                }
                else {
                    CatalogRef ref = generateCatalogRef(parentPath, p);
                    ds.getDataset().add(catalogObjectFactory.createCatalogRef(ref));
                }
                generateCatalogFromBucket(bucket, (parentPath == null ? p + "/" : parentPath + p + "/"), p);
            }
        }
        /**
         * Item in the current folder
         */
        if(response.hasContents()) {
            List<S3Object> cs = response.contents()
                    .stream()
                    .filter(p -> Arrays.stream(new String[] {".nc",".nc.gz", ".ncml"}).anyMatch(entry -> p.key().endsWith(entry)))
                    .sorted(SORT_S3OBJECT)
                    .collect(Collectors.toList());

            for(S3Object c : cs) {
                DatasetType ds1 = addMetadata(generateDatasetType(parentPath, c));
                JAXBElement<DatasetType> dst = catalogObjectFactory.createDataset(ds1);
                ds.getDataset().add(dst);
            }
        }
        marshaller.marshal(root, new File(String.format("%s/thredds/%s.xml", rootPath, current == null ? "catalog" : current)));
    }

    protected CatalogRef generateCatalogRef(String parent, String folderName) {
        CatalogRef ref = catalogObjectFactory.createCatalogRef();
        ref.setHref(folderName + ".xml");
        ref.setTitle(folderName);
        ref.setName("");        // No use just to satisfy the schema
        ref.setID(parent == null ? folderName : (parent.endsWith("/") ? parent.substring(0, parent.length() - 1) : parent));
        return ref;
    }

    /**
     * Use to create a folder not on the first page.
     * @param parent
     * @return
     */
    protected DatasetType generateDatasetType(String parent, String current) {
        DatasetType ref = catalogObjectFactory.createDatasetType();
        ref.setName(current);
        ref.setID(parent == null ? current : parent + current);
        return ref;
    }
    /**
     * Use to create clickable item, that is the leave node.
     * @param parentPath
     * @param item
     * @return
     */
    protected DatasetType generateDatasetType(String parentPath, S3Object item) {
        DatasetType ref = catalogObjectFactory.createDatasetType();
        ref.setName(item.key().replace(parentPath, ""));
        ref.setID(item.key());
        ref.setUrlPath("s3/" + item.key());

        DataSize dataSize = catalogObjectFactory.createDataSize();
        dataSize.setUnits("bytes");
        dataSize.setValue(String.valueOf(item.size()));
        ref.getThreddsMetadataGroup().add(dataSize);

        DateTypeFormatted formatted = catalogObjectFactory.createDateTypeFormatted();
        formatted.setType("modified");
        formatted.setValue(dateTimeFormatter.format(item.lastModified()));
        ref.getThreddsMetadataGroup().add(catalogObjectFactory.createDatasetTypeDate(formatted));
        return ref;
    }

    protected DatasetType addMetadata(DatasetType dataset) {
        // Metadata
        JAXBElement<String> sn = catalogObjectFactory.createMetadataServiceName("regGriddedServices");
        JAXBElement<String> gr = catalogObjectFactory.createMetadataDataType("Grid");

        Metadata metadata = catalogObjectFactory.createMetadata();
        metadata.setInherited(true);
        metadata.getThreddsMetadataGroup().add(sn);
        metadata.getThreddsMetadataGroup().add(gr);
        dataset.getThreddsMetadataGroup().add(metadata);

        return dataset;
    }

    protected Catalog generateCatalogRoot() {
        // Some common root level setting goes here
        Service regGriddedServices = catalogObjectFactory.createService();
        regGriddedServices.setName("regGriddedServices");
        regGriddedServices.setBase("");
        regGriddedServices.setServiceType("compound");

        // Register service section here, it include the serice that is going
        // to expose to user for the nc files.
        Service odap = catalogObjectFactory.createService();
        odap.setName("odap");
        odap.setServiceType("OpenDAP");
        odap.setBase("/thredds/dodsC/");
        regGriddedServices.getService().add(odap);

        Service http = catalogObjectFactory.createService();
        http.setName("http");
        http.setServiceType("HTTPServer");
        http.setBase("/thredds/fileServer/");
        regGriddedServices.getService().add(http);

        Service wms =  catalogObjectFactory.createService();
        wms.setName("wms");
        wms.setServiceType("WMS");
        wms.setBase("/thredds/wms/");
        regGriddedServices.getService().add(wms);

        // Setup the s3 bucket root folder so that all path that starts with "s3" will
        // be called remotely instead of scanning local file folder
        DatasetRoot datasetRoot = catalogObjectFactory.createDatasetRoot();
        datasetRoot.setPath("s3");
        /*
         * using a dedicated IAM role with a limited S3 access
         * AWS least privileges concept
         * */
        // datasetRoot.setLocation(String.format("cdms3://%s@%s/%s", impersonate, host, bucket));
        datasetRoot.setLocation(String.format("cdms3://%s/%s", host, bucket));

        // Here goes the root <catalog>
        Catalog root = catalogObjectFactory.createCatalog();
        root.getService().add(regGriddedServices);
        root.getDatasetRoot().add(datasetRoot);

        return root;
    }
}
