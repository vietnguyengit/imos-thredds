//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.08.17 at 10:50:51 PM AEST 
//


package au.org.aodn.thredds.xml.catalog;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;group ref="{http://www.unidata.ucar.edu/namespaces/thredds/InvCatalog/v1.0}threddsMetadataGroup" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;any processContents='lax' namespace='##other' maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/choice&gt;
 *       &lt;attGroup ref="{http://www.unidata.ucar.edu/namespaces/thredds/InvCatalog/v1.0}XLink"/&gt;
 *       &lt;attribute name="inherited" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *       &lt;attribute name="metadataType" type="{http://www.unidata.ucar.edu/namespaces/thredds/InvCatalog/v1.0}metadataTypeEnum" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "threddsMetadataGroup",
    "any"
})
@XmlRootElement(name = "metadata")
public class Metadata {

    @XmlElementRefs({
        @XmlElementRef(name = "documentation", namespace = "http://www.unidata.ucar.edu/namespaces/thredds/InvCatalog/v1.0", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "metadata", namespace = "http://www.unidata.ucar.edu/namespaces/thredds/InvCatalog/v1.0", type = Metadata.class, required = false),
        @XmlElementRef(name = "property", namespace = "http://www.unidata.ucar.edu/namespaces/thredds/InvCatalog/v1.0", type = Property.class, required = false),
        @XmlElementRef(name = "contributor", namespace = "http://www.unidata.ucar.edu/namespaces/thredds/InvCatalog/v1.0", type = Contributor.class, required = false),
        @XmlElementRef(name = "creator", namespace = "http://www.unidata.ucar.edu/namespaces/thredds/InvCatalog/v1.0", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "date", namespace = "http://www.unidata.ucar.edu/namespaces/thredds/InvCatalog/v1.0", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "keyword", namespace = "http://www.unidata.ucar.edu/namespaces/thredds/InvCatalog/v1.0", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "project", namespace = "http://www.unidata.ucar.edu/namespaces/thredds/InvCatalog/v1.0", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "publisher", namespace = "http://www.unidata.ucar.edu/namespaces/thredds/InvCatalog/v1.0", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "geospatialCoverage", namespace = "http://www.unidata.ucar.edu/namespaces/thredds/InvCatalog/v1.0", type = GeospatialCoverage.class, required = false),
        @XmlElementRef(name = "timeCoverage", namespace = "http://www.unidata.ucar.edu/namespaces/thredds/InvCatalog/v1.0", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "variables", namespace = "http://www.unidata.ucar.edu/namespaces/thredds/InvCatalog/v1.0", type = Variables.class, required = false),
        @XmlElementRef(name = "variableMap", namespace = "http://www.unidata.ucar.edu/namespaces/thredds/InvCatalog/v1.0", type = VariableMap.class, required = false),
        @XmlElementRef(name = "dataType", namespace = "http://www.unidata.ucar.edu/namespaces/thredds/InvCatalog/v1.0", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "dataFormat", namespace = "http://www.unidata.ucar.edu/namespaces/thredds/InvCatalog/v1.0", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "serviceName", namespace = "http://www.unidata.ucar.edu/namespaces/thredds/InvCatalog/v1.0", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "authority", namespace = "http://www.unidata.ucar.edu/namespaces/thredds/InvCatalog/v1.0", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "dataSize", namespace = "http://www.unidata.ucar.edu/namespaces/thredds/InvCatalog/v1.0", type = DataSize.class, required = false)
    })
    protected List<Object> threddsMetadataGroup;
    @XmlAnyElement(lax = true)
    protected List<Object> any;
    @XmlAttribute(name = "inherited")
    protected Boolean inherited;
    @XmlAttribute(name = "metadataType")
    protected String metadataType;
    @XmlAttribute(name = "type", namespace = "http://www.w3.org/1999/xlink")
    protected String type;
    @XmlAttribute(name = "href", namespace = "http://www.w3.org/1999/xlink")
    @XmlSchemaType(name = "anyURI")
    protected String href;
    @XmlAttribute(name = "title", namespace = "http://www.w3.org/1999/xlink")
    protected String title;
    @XmlAttribute(name = "show", namespace = "http://www.w3.org/1999/xlink")
    protected String show;

    /**
     * Gets the value of the threddsMetadataGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the threddsMetadataGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getThreddsMetadataGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link DocumentationType }{@code >}
     * {@link Metadata }
     * {@link Property }
     * {@link Contributor }
     * {@link JAXBElement }{@code <}{@link SourceType }{@code >}
     * {@link JAXBElement }{@code <}{@link DateTypeFormatted }{@code >}
     * {@link JAXBElement }{@code <}{@link ControlledVocabulary }{@code >}
     * {@link JAXBElement }{@code <}{@link ControlledVocabulary }{@code >}
     * {@link JAXBElement }{@code <}{@link SourceType }{@code >}
     * {@link GeospatialCoverage }
     * {@link JAXBElement }{@code <}{@link TimeCoverageType }{@code >}
     * {@link Variables }
     * {@link VariableMap }
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link DataSize }
     * 
     * 
     */
    public List<Object> getThreddsMetadataGroup() {
        if (threddsMetadataGroup == null) {
            threddsMetadataGroup = new ArrayList<Object>();
        }
        return this.threddsMetadataGroup;
    }

    /**
     * Gets the value of the any property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the any property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAny().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Element }
     * {@link Object }
     * 
     * 
     */
    public List<Object> getAny() {
        if (any == null) {
            any = new ArrayList<Object>();
        }
        return this.any;
    }

    /**
     * Gets the value of the inherited property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isInherited() {
        if (inherited == null) {
            return false;
        } else {
            return inherited;
        }
    }

    /**
     * Sets the value of the inherited property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInherited(Boolean value) {
        this.inherited = value;
    }

    /**
     * Gets the value of the metadataType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMetadataType() {
        return metadataType;
    }

    /**
     * Sets the value of the metadataType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMetadataType(String value) {
        this.metadataType = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the href property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHref() {
        return href;
    }

    /**
     * Sets the value of the href property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHref(String value) {
        this.href = value;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Gets the value of the show property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShow() {
        return show;
    }

    /**
     * Sets the value of the show property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShow(String value) {
        this.show = value;
    }

}
