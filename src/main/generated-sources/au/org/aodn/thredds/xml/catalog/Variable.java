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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="vocabulary_name" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="vocabulary_id" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="units" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "content"
})
@XmlRootElement(name = "variable")
public class Variable {

    @XmlValue
    protected String content;
    @XmlAttribute(name = "name", required = true)
    protected String name;
    @XmlAttribute(name = "vocabulary_name")
    protected String vocabularyName;
    @XmlAttribute(name = "vocabulary_id")
    protected String vocabularyId;
    @XmlAttribute(name = "units")
    protected String units;

    /**
     * Gets the value of the content property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContent() {
        return content;
    }

    /**
     * Sets the value of the content property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContent(String value) {
        this.content = value;
    }

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
     * Gets the value of the vocabularyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVocabularyName() {
        return vocabularyName;
    }

    /**
     * Sets the value of the vocabularyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVocabularyName(String value) {
        this.vocabularyName = value;
    }

    /**
     * Gets the value of the vocabularyId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVocabularyId() {
        return vocabularyId;
    }

    /**
     * Sets the value of the vocabularyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVocabularyId(String value) {
        this.vocabularyId = value;
    }

    /**
     * Gets the value of the units property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnits() {
        return units;
    }

    /**
     * Sets the value of the units property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnits(String value) {
        this.units = value;
    }

}
