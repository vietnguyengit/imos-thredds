//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.08.19 at 12:28:45 AM AEST 
//


package au.org.aodn.thredds.xml.catalog;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="crawlableDatasetLabelerImpl" type="{http://www.unidata.ucar.edu/namespaces/thredds/InvCatalog/v1.0}UserImplType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "crawlableDatasetLabelerImpl"
})
@XmlRootElement(name = "addID")
public class AddID {

    protected UserImplType crawlableDatasetLabelerImpl;

    /**
     * Gets the value of the crawlableDatasetLabelerImpl property.
     * 
     * @return
     *     possible object is
     *     {@link UserImplType }
     *     
     */
    public UserImplType getCrawlableDatasetLabelerImpl() {
        return crawlableDatasetLabelerImpl;
    }

    /**
     * Sets the value of the crawlableDatasetLabelerImpl property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserImplType }
     *     
     */
    public void setCrawlableDatasetLabelerImpl(UserImplType value) {
        this.crawlableDatasetLabelerImpl = value;
    }

}
