//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.04.22 at 04:27:21 PM AEST 
//


package au.org.aodn.thredds.xml.catalog;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlType;
import au.org.aodn.thredds.xml.ncml.Netcdf;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.unidata.ucar.edu/namespaces/thredds/InvCatalog/v1.0}DatasetType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="collection" type="{http://www.unidata.ucar.edu/namespaces/thredds/InvCatalog/v1.0}collectionType"/&gt;
 *         &lt;element name="update" type="{http://www.unidata.ucar.edu/namespaces/thredds/InvCatalog/v1.0}updateType" minOccurs="0"/&gt;
 *         &lt;element name="tdm" type="{http://www.unidata.ucar.edu/namespaces/thredds/InvCatalog/v1.0}updateType" minOccurs="0"/&gt;
 *         &lt;element name="protoDataset" type="{http://www.unidata.ucar.edu/namespaces/thredds/InvCatalog/v1.0}protoDatasetType" minOccurs="0"/&gt;
 *         &lt;element name="fmrcConfig" type="{http://www.unidata.ucar.edu/namespaces/thredds/InvCatalog/v1.0}fmrcConfigType" minOccurs="0"/&gt;
 *         &lt;element name="pointConfig" type="{http://www.unidata.ucar.edu/namespaces/thredds/InvCatalog/v1.0}pointConfigType" minOccurs="0"/&gt;
 *         &lt;element name="gribConfig" type="{http://www.unidata.ucar.edu/namespaces/thredds/InvCatalog/v1.0}gribConfigType" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.unidata.ucar.edu/namespaces/netcdf/ncml-2.2}netcdf" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="featureType" use="required" type="{http://www.unidata.ucar.edu/namespaces/thredds/InvCatalog/v1.0}featureTypeChoice" /&gt;
 *       &lt;attribute name="path" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "rest"
})
public class FeatureCollection
    extends DatasetType
{

    @XmlElementRefs({
        @XmlElementRef(name = "collection", namespace = "http://www.unidata.ucar.edu/namespaces/thredds/InvCatalog/v1.0", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "update", namespace = "http://www.unidata.ucar.edu/namespaces/thredds/InvCatalog/v1.0", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "tdm", namespace = "http://www.unidata.ucar.edu/namespaces/thredds/InvCatalog/v1.0", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "protoDataset", namespace = "http://www.unidata.ucar.edu/namespaces/thredds/InvCatalog/v1.0", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "fmrcConfig", namespace = "http://www.unidata.ucar.edu/namespaces/thredds/InvCatalog/v1.0", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "pointConfig", namespace = "http://www.unidata.ucar.edu/namespaces/thredds/InvCatalog/v1.0", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "gribConfig", namespace = "http://www.unidata.ucar.edu/namespaces/thredds/InvCatalog/v1.0", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "netcdf", namespace = "http://www.unidata.ucar.edu/namespaces/netcdf/ncml-2.2", type = Netcdf.class, required = false)
    })
    protected List<Object> rest;
    @XmlAttribute(name = "featureType", required = true)
    protected String featureType;
    @XmlAttribute(name = "path", required = true)
    protected String path;

    /**
     * Gets the rest of the content model. 
     * 
     * <p>
     * You are getting this "catch-all" property because of the following reason: 
     * The field name "Netcdf" is used by two different parts of a schema. See: 
     * line 327 of file:/home/raymond/IdeaProjects/imos-thredds/src/main/xsd/InvCatalog.1.0.6.xsd
     * line 108 of file:/home/raymond/IdeaProjects/imos-thredds/src/main/xsd/InvCatalog.1.0.6.xsd
     * <p>
     * To get rid of this property, apply a property customization to one 
     * of both of the following declarations to change their names: 
     * Gets the value of the rest property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rest property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRest().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link CollectionType }{@code >}
     * {@link JAXBElement }{@code <}{@link UpdateType }{@code >}
     * {@link JAXBElement }{@code <}{@link UpdateType }{@code >}
     * {@link JAXBElement }{@code <}{@link ProtoDatasetType }{@code >}
     * {@link JAXBElement }{@code <}{@link FmrcConfigType }{@code >}
     * {@link JAXBElement }{@code <}{@link PointConfigType }{@code >}
     * {@link JAXBElement }{@code <}{@link GribConfigType }{@code >}
     * {@link Netcdf }
     * 
     * 
     */
    public List<Object> getRest() {
        if (rest == null) {
            rest = new ArrayList<Object>();
        }
        return this.rest;
    }

    /**
     * Gets the value of the featureType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFeatureType() {
        return featureType;
    }

    /**
     * Sets the value of the featureType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFeatureType(String value) {
        this.featureType = value;
    }

    /**
     * Gets the value of the path property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPath() {
        return path;
    }

    /**
     * Sets the value of the path property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPath(String value) {
        this.path = value;
    }

}