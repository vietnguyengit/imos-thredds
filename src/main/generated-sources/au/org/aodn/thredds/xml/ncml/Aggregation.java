//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.04.22 at 04:27:21 PM AEST 
//


package au.org.aodn.thredds.xml.ncml;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


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
 *         &lt;choice maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;element ref="{http://www.unidata.ucar.edu/namespaces/netcdf/ncml-2.2}group"/&gt;
 *           &lt;element ref="{http://www.unidata.ucar.edu/namespaces/netcdf/ncml-2.2}dimension"/&gt;
 *           &lt;element ref="{http://www.unidata.ucar.edu/namespaces/netcdf/ncml-2.2}variable"/&gt;
 *           &lt;element ref="{http://www.unidata.ucar.edu/namespaces/netcdf/ncml-2.2}attribute"/&gt;
 *           &lt;element ref="{http://www.unidata.ucar.edu/namespaces/netcdf/ncml-2.2}remove"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="variableAgg" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element ref="{http://www.unidata.ucar.edu/namespaces/netcdf/ncml-2.2}promoteGlobalAttribute" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.unidata.ucar.edu/namespaces/netcdf/ncml-2.2}cacheVariable" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.unidata.ucar.edu/namespaces/netcdf/ncml-2.2}netcdf" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="scan" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="location" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="regExp" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="suffix" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="subdirs" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" /&gt;
 *                 &lt;attribute name="olderThan" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="dateFormatMark" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="enhance" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="scanFmrc" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="location" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="regExp" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="suffix" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="subdirs" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" /&gt;
 *                 &lt;attribute name="olderThan" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="runDateMatcher" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="forecastDateMatcher" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="forecastOffsetMatcher" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="type" use="required" type="{http://www.unidata.ucar.edu/namespaces/netcdf/ncml-2.2}AggregationType" /&gt;
 *       &lt;attribute name="dimName" type="{http://www.w3.org/2001/XMLSchema}token" /&gt;
 *       &lt;attribute name="recheckEvery" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="timeUnitsChange" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="fmrcDefinition" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "groupOrDimensionOrVariable",
    "variableAgg",
    "promoteGlobalAttribute",
    "cacheVariable",
    "netcdf",
    "scan",
    "scanFmrc"
})
@XmlRootElement(name = "aggregation")
public class Aggregation {

    @XmlElements({
        @XmlElement(name = "group", type = Group.class),
        @XmlElement(name = "dimension", type = Dimension.class),
        @XmlElement(name = "variable", type = Variable.class),
        @XmlElement(name = "attribute", type = Attribute.class),
        @XmlElement(name = "remove", type = Remove.class)
    })
    protected List<Object> groupOrDimensionOrVariable;
    protected List<Aggregation.VariableAgg> variableAgg;
    protected List<PromoteGlobalAttribute> promoteGlobalAttribute;
    protected List<CacheVariable> cacheVariable;
    protected List<Netcdf> netcdf;
    protected List<Aggregation.Scan> scan;
    protected List<Aggregation.ScanFmrc> scanFmrc;
    @XmlAttribute(name = "type", required = true)
    protected AggregationType type;
    @XmlAttribute(name = "dimName")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String dimName;
    @XmlAttribute(name = "recheckEvery")
    protected String recheckEvery;
    @XmlAttribute(name = "timeUnitsChange")
    protected Boolean timeUnitsChange;
    @XmlAttribute(name = "fmrcDefinition")
    protected String fmrcDefinition;

    /**
     * Gets the value of the groupOrDimensionOrVariable property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the groupOrDimensionOrVariable property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGroupOrDimensionOrVariable().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Group }
     * {@link Dimension }
     * {@link Variable }
     * {@link Attribute }
     * {@link Remove }
     * 
     * 
     */
    public List<Object> getGroupOrDimensionOrVariable() {
        if (groupOrDimensionOrVariable == null) {
            groupOrDimensionOrVariable = new ArrayList<Object>();
        }
        return this.groupOrDimensionOrVariable;
    }

    /**
     * Gets the value of the variableAgg property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the variableAgg property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVariableAgg().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Aggregation.VariableAgg }
     * 
     * 
     */
    public List<Aggregation.VariableAgg> getVariableAgg() {
        if (variableAgg == null) {
            variableAgg = new ArrayList<Aggregation.VariableAgg>();
        }
        return this.variableAgg;
    }

    /**
     * Gets the value of the promoteGlobalAttribute property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the promoteGlobalAttribute property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPromoteGlobalAttribute().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PromoteGlobalAttribute }
     * 
     * 
     */
    public List<PromoteGlobalAttribute> getPromoteGlobalAttribute() {
        if (promoteGlobalAttribute == null) {
            promoteGlobalAttribute = new ArrayList<PromoteGlobalAttribute>();
        }
        return this.promoteGlobalAttribute;
    }

    /**
     * Gets the value of the cacheVariable property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cacheVariable property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCacheVariable().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CacheVariable }
     * 
     * 
     */
    public List<CacheVariable> getCacheVariable() {
        if (cacheVariable == null) {
            cacheVariable = new ArrayList<CacheVariable>();
        }
        return this.cacheVariable;
    }

    /**
     * Gets the value of the netcdf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the netcdf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNetcdf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Netcdf }
     * 
     * 
     */
    public List<Netcdf> getNetcdf() {
        if (netcdf == null) {
            netcdf = new ArrayList<Netcdf>();
        }
        return this.netcdf;
    }

    /**
     * Gets the value of the scan property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the scan property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getScan().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Aggregation.Scan }
     * 
     * 
     */
    public List<Aggregation.Scan> getScan() {
        if (scan == null) {
            scan = new ArrayList<Aggregation.Scan>();
        }
        return this.scan;
    }

    /**
     * Gets the value of the scanFmrc property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the scanFmrc property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getScanFmrc().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Aggregation.ScanFmrc }
     * 
     * 
     */
    public List<Aggregation.ScanFmrc> getScanFmrc() {
        if (scanFmrc == null) {
            scanFmrc = new ArrayList<Aggregation.ScanFmrc>();
        }
        return this.scanFmrc;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link AggregationType }
     *     
     */
    public AggregationType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link AggregationType }
     *     
     */
    public void setType(AggregationType value) {
        this.type = value;
    }

    /**
     * Gets the value of the dimName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDimName() {
        return dimName;
    }

    /**
     * Sets the value of the dimName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDimName(String value) {
        this.dimName = value;
    }

    /**
     * Gets the value of the recheckEvery property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecheckEvery() {
        return recheckEvery;
    }

    /**
     * Sets the value of the recheckEvery property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecheckEvery(String value) {
        this.recheckEvery = value;
    }

    /**
     * Gets the value of the timeUnitsChange property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTimeUnitsChange() {
        return timeUnitsChange;
    }

    /**
     * Sets the value of the timeUnitsChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTimeUnitsChange(Boolean value) {
        this.timeUnitsChange = value;
    }

    /**
     * Gets the value of the fmrcDefinition property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFmrcDefinition() {
        return fmrcDefinition;
    }

    /**
     * Sets the value of the fmrcDefinition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFmrcDefinition(String value) {
        this.fmrcDefinition = value;
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
     *       &lt;attribute name="location" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="regExp" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="suffix" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="subdirs" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" /&gt;
     *       &lt;attribute name="olderThan" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="dateFormatMark" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="enhance" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Scan {

        @XmlAttribute(name = "location", required = true)
        protected String location;
        @XmlAttribute(name = "regExp")
        protected String regExp;
        @XmlAttribute(name = "suffix")
        protected String suffix;
        @XmlAttribute(name = "subdirs")
        protected Boolean subdirs;
        @XmlAttribute(name = "olderThan")
        protected String olderThan;
        @XmlAttribute(name = "dateFormatMark")
        protected String dateFormatMark;
        @XmlAttribute(name = "enhance")
        protected Boolean enhance;

        /**
         * Gets the value of the location property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLocation() {
            return location;
        }

        /**
         * Sets the value of the location property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLocation(String value) {
            this.location = value;
        }

        /**
         * Gets the value of the regExp property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRegExp() {
            return regExp;
        }

        /**
         * Sets the value of the regExp property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRegExp(String value) {
            this.regExp = value;
        }

        /**
         * Gets the value of the suffix property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSuffix() {
            return suffix;
        }

        /**
         * Sets the value of the suffix property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSuffix(String value) {
            this.suffix = value;
        }

        /**
         * Gets the value of the subdirs property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public boolean isSubdirs() {
            if (subdirs == null) {
                return true;
            } else {
                return subdirs;
            }
        }

        /**
         * Sets the value of the subdirs property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setSubdirs(Boolean value) {
            this.subdirs = value;
        }

        /**
         * Gets the value of the olderThan property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOlderThan() {
            return olderThan;
        }

        /**
         * Sets the value of the olderThan property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOlderThan(String value) {
            this.olderThan = value;
        }

        /**
         * Gets the value of the dateFormatMark property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDateFormatMark() {
            return dateFormatMark;
        }

        /**
         * Sets the value of the dateFormatMark property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDateFormatMark(String value) {
            this.dateFormatMark = value;
        }

        /**
         * Gets the value of the enhance property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isEnhance() {
            return enhance;
        }

        /**
         * Sets the value of the enhance property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setEnhance(Boolean value) {
            this.enhance = value;
        }

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
     *       &lt;attribute name="location" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="regExp" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="suffix" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="subdirs" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" /&gt;
     *       &lt;attribute name="olderThan" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="runDateMatcher" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="forecastDateMatcher" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="forecastOffsetMatcher" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class ScanFmrc {

        @XmlAttribute(name = "location", required = true)
        protected String location;
        @XmlAttribute(name = "regExp")
        protected String regExp;
        @XmlAttribute(name = "suffix")
        protected String suffix;
        @XmlAttribute(name = "subdirs")
        protected Boolean subdirs;
        @XmlAttribute(name = "olderThan")
        protected String olderThan;
        @XmlAttribute(name = "runDateMatcher")
        protected String runDateMatcher;
        @XmlAttribute(name = "forecastDateMatcher")
        protected String forecastDateMatcher;
        @XmlAttribute(name = "forecastOffsetMatcher")
        protected String forecastOffsetMatcher;

        /**
         * Gets the value of the location property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLocation() {
            return location;
        }

        /**
         * Sets the value of the location property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLocation(String value) {
            this.location = value;
        }

        /**
         * Gets the value of the regExp property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRegExp() {
            return regExp;
        }

        /**
         * Sets the value of the regExp property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRegExp(String value) {
            this.regExp = value;
        }

        /**
         * Gets the value of the suffix property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSuffix() {
            return suffix;
        }

        /**
         * Sets the value of the suffix property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSuffix(String value) {
            this.suffix = value;
        }

        /**
         * Gets the value of the subdirs property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public boolean isSubdirs() {
            if (subdirs == null) {
                return true;
            } else {
                return subdirs;
            }
        }

        /**
         * Sets the value of the subdirs property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setSubdirs(Boolean value) {
            this.subdirs = value;
        }

        /**
         * Gets the value of the olderThan property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOlderThan() {
            return olderThan;
        }

        /**
         * Sets the value of the olderThan property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOlderThan(String value) {
            this.olderThan = value;
        }

        /**
         * Gets the value of the runDateMatcher property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRunDateMatcher() {
            return runDateMatcher;
        }

        /**
         * Sets the value of the runDateMatcher property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRunDateMatcher(String value) {
            this.runDateMatcher = value;
        }

        /**
         * Gets the value of the forecastDateMatcher property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getForecastDateMatcher() {
            return forecastDateMatcher;
        }

        /**
         * Sets the value of the forecastDateMatcher property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setForecastDateMatcher(String value) {
            this.forecastDateMatcher = value;
        }

        /**
         * Gets the value of the forecastOffsetMatcher property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getForecastOffsetMatcher() {
            return forecastOffsetMatcher;
        }

        /**
         * Sets the value of the forecastOffsetMatcher property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setForecastOffsetMatcher(String value) {
            this.forecastOffsetMatcher = value;
        }

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
     *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class VariableAgg {

        @XmlAttribute(name = "name", required = true)
        protected String name;

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

    }

}