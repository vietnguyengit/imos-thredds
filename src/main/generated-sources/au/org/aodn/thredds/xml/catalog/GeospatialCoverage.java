//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.08.19 at 12:28:45 AM AEST 
//


package au.org.aodn.thredds.xml.catalog;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="northsouth" type="{http://www.unidata.ucar.edu/namespaces/thredds/InvCatalog/v1.0}spatialRange" minOccurs="0"/&gt;
 *         &lt;element name="eastwest" type="{http://www.unidata.ucar.edu/namespaces/thredds/InvCatalog/v1.0}spatialRange" minOccurs="0"/&gt;
 *         &lt;element name="updown" type="{http://www.unidata.ucar.edu/namespaces/thredds/InvCatalog/v1.0}spatialRange" minOccurs="0"/&gt;
 *         &lt;element name="name" type="{http://www.unidata.ucar.edu/namespaces/thredds/InvCatalog/v1.0}controlledVocabulary" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="zpositive" type="{http://www.unidata.ucar.edu/namespaces/thredds/InvCatalog/v1.0}upOrDown" default="up" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "northsouth",
    "eastwest",
    "updown",
    "name"
})
@XmlRootElement(name = "geospatialCoverage")
public class GeospatialCoverage {

    protected SpatialRange northsouth;
    protected SpatialRange eastwest;
    protected SpatialRange updown;
    protected List<ControlledVocabulary> name;
    @XmlAttribute(name = "zpositive")
    protected UpOrDown zpositive;

    /**
     * Gets the value of the northsouth property.
     * 
     * @return
     *     possible object is
     *     {@link SpatialRange }
     *     
     */
    public SpatialRange getNorthsouth() {
        return northsouth;
    }

    /**
     * Sets the value of the northsouth property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpatialRange }
     *     
     */
    public void setNorthsouth(SpatialRange value) {
        this.northsouth = value;
    }

    /**
     * Gets the value of the eastwest property.
     * 
     * @return
     *     possible object is
     *     {@link SpatialRange }
     *     
     */
    public SpatialRange getEastwest() {
        return eastwest;
    }

    /**
     * Sets the value of the eastwest property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpatialRange }
     *     
     */
    public void setEastwest(SpatialRange value) {
        this.eastwest = value;
    }

    /**
     * Gets the value of the updown property.
     * 
     * @return
     *     possible object is
     *     {@link SpatialRange }
     *     
     */
    public SpatialRange getUpdown() {
        return updown;
    }

    /**
     * Sets the value of the updown property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpatialRange }
     *     
     */
    public void setUpdown(SpatialRange value) {
        this.updown = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the name property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ControlledVocabulary }
     * 
     * 
     */
    public List<ControlledVocabulary> getName() {
        if (name == null) {
            name = new ArrayList<ControlledVocabulary>();
        }
        return this.name;
    }

    /**
     * Gets the value of the zpositive property.
     * 
     * @return
     *     possible object is
     *     {@link UpOrDown }
     *     
     */
    public UpOrDown getZpositive() {
        if (zpositive == null) {
            return UpOrDown.UP;
        } else {
            return zpositive;
        }
    }

    /**
     * Sets the value of the zpositive property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpOrDown }
     *     
     */
    public void setZpositive(UpOrDown value) {
        this.zpositive = value;
    }

}
