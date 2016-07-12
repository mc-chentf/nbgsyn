
package com.mchz.nbg.talendservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>WSPutBusinessConcept complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="WSPutBusinessConcept">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="businessConcept" type="{http://www.talend.com/mdm}WSBusinessConcept" minOccurs="0"/>
 *         &lt;element name="wsDataModelPK" type="{http://www.talend.com/mdm}WSDataModelPK" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WSPutBusinessConcept", propOrder = {
    "businessConcept",
    "wsDataModelPK"
})
public class WSPutBusinessConcept {

    protected WSBusinessConcept businessConcept;
    protected WSDataModelPK wsDataModelPK;

    /**
     * 获取businessConcept属性的值。
     * 
     * @return
     *     possible object is
     *     {@link WSBusinessConcept }
     *     
     */
    public WSBusinessConcept getBusinessConcept() {
        return businessConcept;
    }

    /**
     * 设置businessConcept属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link WSBusinessConcept }
     *     
     */
    public void setBusinessConcept(WSBusinessConcept value) {
        this.businessConcept = value;
    }

    /**
     * 获取wsDataModelPK属性的值。
     * 
     * @return
     *     possible object is
     *     {@link WSDataModelPK }
     *     
     */
    public WSDataModelPK getWsDataModelPK() {
        return wsDataModelPK;
    }

    /**
     * 设置wsDataModelPK属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link WSDataModelPK }
     *     
     */
    public void setWsDataModelPK(WSDataModelPK value) {
        this.wsDataModelPK = value;
    }

}
