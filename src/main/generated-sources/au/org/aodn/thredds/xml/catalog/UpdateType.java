//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.08.17 at 09:06:49 PM AEST 
//


package au.org.aodn.thredds.xml.catalog;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for updateType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="updateType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.unidata.ucar.edu/namespaces/thredds/InvCatalog/v1.0}manage" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="startup" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="rewrite" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="recheckAfter" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="rescan" type="{http://www.w3.org/2001/XMLSchema}token" /&gt;
 *       &lt;attribute name="trigger" type="{http://www.w3.org/2001/XMLSchema}token" /&gt;
 *       &lt;attribute name="deleteAfter" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "updateType", propOrder = {
    "manage"
})
public class UpdateType {

    protected Manage manage;
    @XmlAttribute(name = "startup")
    protected String startup;
    @XmlAttribute(name = "rewrite")
    protected String rewrite;
    @XmlAttribute(name = "recheckAfter")
    protected String recheckAfter;
    @XmlAttribute(name = "rescan")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String rescan;
    @XmlAttribute(name = "trigger")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String trigger;
    @XmlAttribute(name = "deleteAfter")
    protected String deleteAfter;

    /**
     * Gets the value of the manage property.
     * 
     * @return
     *     possible object is
     *     {@link Manage }
     *     
     */
    public Manage getManage() {
        return manage;
    }

    /**
     * Sets the value of the manage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Manage }
     *     
     */
    public void setManage(Manage value) {
        this.manage = value;
    }

    /**
     * Gets the value of the startup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartup() {
        return startup;
    }

    /**
     * Sets the value of the startup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartup(String value) {
        this.startup = value;
    }

    /**
     * Gets the value of the rewrite property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRewrite() {
        return rewrite;
    }

    /**
     * Sets the value of the rewrite property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRewrite(String value) {
        this.rewrite = value;
    }

    /**
     * Gets the value of the recheckAfter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecheckAfter() {
        return recheckAfter;
    }

    /**
     * Sets the value of the recheckAfter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecheckAfter(String value) {
        this.recheckAfter = value;
    }

    /**
     * Gets the value of the rescan property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRescan() {
        return rescan;
    }

    /**
     * Sets the value of the rescan property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRescan(String value) {
        this.rescan = value;
    }

    /**
     * Gets the value of the trigger property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrigger() {
        return trigger;
    }

    /**
     * Sets the value of the trigger property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrigger(String value) {
        this.trigger = value;
    }

    /**
     * Gets the value of the deleteAfter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeleteAfter() {
        return deleteAfter;
    }

    /**
     * Sets the value of the deleteAfter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeleteAfter(String value) {
        this.deleteAfter = value;
    }

}
