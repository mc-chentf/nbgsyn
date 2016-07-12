
package com.mchz.nbg.talendservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>WSTransformerPluginV2VariableDescriptor complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="WSTransformerPluginV2VariableDescriptor">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="contentTypesRegex" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mandatory" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="possibleValuesRegex" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="variableName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WSTransformerPluginV2VariableDescriptor", propOrder = {
    "contentTypesRegex",
    "description",
    "mandatory",
    "possibleValuesRegex",
    "variableName"
})
public class WSTransformerPluginV2VariableDescriptor {

    @XmlElement(nillable = true)
    protected List<String> contentTypesRegex;
    protected String description;
    protected boolean mandatory;
    @XmlElement(nillable = true)
    protected List<String> possibleValuesRegex;
    protected String variableName;

    /**
     * Gets the value of the contentTypesRegex property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contentTypesRegex property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContentTypesRegex().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getContentTypesRegex() {
        if (contentTypesRegex == null) {
            contentTypesRegex = new ArrayList<String>();
        }
        return this.contentTypesRegex;
    }

    /**
     * 获取description属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * 设置description属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * 获取mandatory属性的值。
     * 
     */
    public boolean isMandatory() {
        return mandatory;
    }

    /**
     * 设置mandatory属性的值。
     * 
     */
    public void setMandatory(boolean value) {
        this.mandatory = value;
    }

    /**
     * Gets the value of the possibleValuesRegex property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the possibleValuesRegex property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPossibleValuesRegex().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getPossibleValuesRegex() {
        if (possibleValuesRegex == null) {
            possibleValuesRegex = new ArrayList<String>();
        }
        return this.possibleValuesRegex;
    }

    /**
     * 获取variableName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVariableName() {
        return variableName;
    }

    /**
     * 设置variableName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVariableName(String value) {
        this.variableName = value;
    }

}
