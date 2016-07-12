
package com.mchz.nbg.talendservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>WSBusinessConcept complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="WSBusinessConcept">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="businessTemplate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="wsDescription" type="{http://www.talend.com/mdm}WSI18NString" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="wsLabel" type="{http://www.talend.com/mdm}WSI18NString" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="wsUniqueKey" type="{http://www.talend.com/mdm}WSKey" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WSBusinessConcept", propOrder = {
    "businessTemplate",
    "name",
    "wsDescription",
    "wsLabel",
    "wsUniqueKey"
})
public class WSBusinessConcept {

    protected String businessTemplate;
    protected String name;
    @XmlElement(nillable = true)
    protected List<WSI18NString> wsDescription;
    @XmlElement(nillable = true)
    protected List<WSI18NString> wsLabel;
    protected WSKey wsUniqueKey;

    /**
     * 获取businessTemplate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessTemplate() {
        return businessTemplate;
    }

    /**
     * 设置businessTemplate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessTemplate(String value) {
        this.businessTemplate = value;
    }

    /**
     * 获取name属性的值。
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
     * 设置name属性的值。
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
     * Gets the value of the wsDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the wsDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWsDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WSI18NString }
     * 
     * 
     */
    public List<WSI18NString> getWsDescription() {
        if (wsDescription == null) {
            wsDescription = new ArrayList<WSI18NString>();
        }
        return this.wsDescription;
    }

    /**
     * Gets the value of the wsLabel property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the wsLabel property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWsLabel().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WSI18NString }
     * 
     * 
     */
    public List<WSI18NString> getWsLabel() {
        if (wsLabel == null) {
            wsLabel = new ArrayList<WSI18NString>();
        }
        return this.wsLabel;
    }

    /**
     * 获取wsUniqueKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link WSKey }
     *     
     */
    public WSKey getWsUniqueKey() {
        return wsUniqueKey;
    }

    /**
     * 设置wsUniqueKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link WSKey }
     *     
     */
    public void setWsUniqueKey(WSKey value) {
        this.wsUniqueKey = value;
    }

}
