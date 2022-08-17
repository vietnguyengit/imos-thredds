//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.08.18 at 12:51:28 AM AEST 
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
 *       &lt;choice maxOccurs="unbounded" minOccurs="0"&gt;
 *         &lt;element ref="{http://www.unidata.ucar.edu/namespaces/netcdf/ncml-2.2}enumTypedef"/&gt;
 *         &lt;element ref="{http://www.unidata.ucar.edu/namespaces/netcdf/ncml-2.2}dimension"/&gt;
 *         &lt;element ref="{http://www.unidata.ucar.edu/namespaces/netcdf/ncml-2.2}variable"/&gt;
 *         &lt;element ref="{http://www.unidata.ucar.edu/namespaces/netcdf/ncml-2.2}attribute"/&gt;
 *         &lt;element ref="{http://www.unidata.ucar.edu/namespaces/netcdf/ncml-2.2}group"/&gt;
 *         &lt;element ref="{http://www.unidata.ucar.edu/namespaces/netcdf/ncml-2.2}remove"/&gt;
 *       &lt;/choice&gt;
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="orgName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "enumTypedefOrDimensionOrVariable"
})
@XmlRootElement(name = "group")
public class Group {

    @XmlElements({
        @XmlElement(name = "enumTypedef", type = EnumTypedef.class),
        @XmlElement(name = "dimension", type = Dimension.class),
        @XmlElement(name = "variable", type = Variable.class),
        @XmlElement(name = "attribute", type = Attribute.class),
        @XmlElement(name = "group", type = Group.class),
        @XmlElement(name = "remove", type = Remove.class)
    })
    protected List<Object> enumTypedefOrDimensionOrVariable;
    @XmlAttribute(name = "name", required = true)
    protected String name;
    @XmlAttribute(name = "orgName")
    protected String orgName;

    /**
     * Gets the value of the enumTypedefOrDimensionOrVariable property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the enumTypedefOrDimensionOrVariable property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEnumTypedefOrDimensionOrVariable().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EnumTypedef }
     * {@link Dimension }
     * {@link Variable }
     * {@link Attribute }
     * {@link Group }
     * {@link Remove }
     * 
     * 
     */
    public List<Object> getEnumTypedefOrDimensionOrVariable() {
        if (enumTypedefOrDimensionOrVariable == null) {
            enumTypedefOrDimensionOrVariable = new ArrayList<Object>();
        }
        return this.enumTypedefOrDimensionOrVariable;
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
     * Gets the value of the orgName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgName() {
        return orgName;
    }

    /**
     * Sets the value of the orgName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgName(String value) {
        this.orgName = value;
    }

}
