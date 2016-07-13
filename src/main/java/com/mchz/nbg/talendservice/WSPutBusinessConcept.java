
package com.mchz.nbg.talendservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>WSPutBusinessConcept complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡbusinessConcept���Ե�ֵ��
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
     * ����businessConcept���Ե�ֵ��
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
     * ��ȡwsDataModelPK���Ե�ֵ��
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
     * ����wsDataModelPK���Ե�ֵ��
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
