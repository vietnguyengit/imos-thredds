//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.08.17 at 10:50:51 PM AEST 
//


package au.org.aodn.thredds.xml.catalog;

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
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="top" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="serviceName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="isResolver" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="lastModifiedLimit" type="{http://www.w3.org/2001/XMLSchema}float" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "latestComplete")
public class LatestComplete {

    @XmlAttribute(name = "name")
    protected String name;
    @XmlAttribute(name = "top")
    protected Boolean top;
    @XmlAttribute(name = "serviceName")
    protected String serviceName;
    @XmlAttribute(name = "isResolver")
    protected Boolean isResolver;
    @XmlAttribute(name = "lastModifiedLimit")
    protected Float lastModifiedLimit;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the top property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTop() {
        return top;
    }

    /**
     * Sets the value of the top property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTop(Boolean value) {
        this.top = value;
    }

    /**
     * Gets the value of the serviceName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceName() {
        return serviceName;
    }

    /**
     * Sets the value of the serviceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceName(String value) {
        this.serviceName = value;
    }

    /**
     * Gets the value of the isResolver property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsResolver() {
        return isResolver;
    }

    /**
     * Sets the value of the isResolver property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsResolver(Boolean value) {
        this.isResolver = value;
    }

    /**
     * Gets the value of the lastModifiedLimit property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getLastModifiedLimit() {
        return lastModifiedLimit;
    }

    /**
     * Sets the value of the lastModifiedLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setLastModifiedLimit(Float value) {
        this.lastModifiedLimit = value;
    }

}
