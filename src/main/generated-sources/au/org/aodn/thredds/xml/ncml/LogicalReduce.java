//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.08.18 at 12:51:28 AM AEST 
//


package au.org.aodn.thredds.xml.ncml;

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
 *       &lt;attribute name="dimNames" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "logicalReduce")
public class LogicalReduce {

    @XmlAttribute(name = "dimNames", required = true)
    protected String dimNames;

    /**
     * Gets the value of the dimNames property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDimNames() {
        return dimNames;
    }

    /**
     * Sets the value of the dimNames property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDimNames(String value) {
        this.dimNames = value;
    }

}
