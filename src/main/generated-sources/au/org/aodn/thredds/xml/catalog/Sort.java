//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.08.19 at 12:28:45 AM AEST 
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
 *       &lt;choice&gt;
 *         &lt;element name="lexigraphicByName"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="increasing" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="crawlableDatasetSorterImpl" type="{http://www.unidata.ucar.edu/namespaces/thredds/InvCatalog/v1.0}UserImplType" minOccurs="0"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "lexigraphicByName",
    "crawlableDatasetSorterImpl"
})
@XmlRootElement(name = "sort")
public class Sort {

    protected Sort.LexigraphicByName lexigraphicByName;
    protected UserImplType crawlableDatasetSorterImpl;

    /**
     * Gets the value of the lexigraphicByName property.
     * 
     * @return
     *     possible object is
     *     {@link Sort.LexigraphicByName }
     *     
     */
    public Sort.LexigraphicByName getLexigraphicByName() {
        return lexigraphicByName;
    }

    /**
     * Sets the value of the lexigraphicByName property.
     * 
     * @param value
     *     allowed object is
     *     {@link Sort.LexigraphicByName }
     *     
     */
    public void setLexigraphicByName(Sort.LexigraphicByName value) {
        this.lexigraphicByName = value;
    }

    /**
     * Gets the value of the crawlableDatasetSorterImpl property.
     * 
     * @return
     *     possible object is
     *     {@link UserImplType }
     *     
     */
    public UserImplType getCrawlableDatasetSorterImpl() {
        return crawlableDatasetSorterImpl;
    }

    /**
     * Sets the value of the crawlableDatasetSorterImpl property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserImplType }
     *     
     */
    public void setCrawlableDatasetSorterImpl(UserImplType value) {
        this.crawlableDatasetSorterImpl = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;attribute name="increasing" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class LexigraphicByName {

        @XmlAttribute(name = "increasing")
        protected Boolean increasing;

        /**
         * Gets the value of the increasing property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isIncreasing() {
            return increasing;
        }

        /**
         * Sets the value of the increasing property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setIncreasing(Boolean value) {
            this.increasing = value;
        }

    }

}
