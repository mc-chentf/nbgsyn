
package com.mchz.nbg.talendservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>WSPutBusinessConceptSchema complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="WSPutBusinessConceptSchema">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="businessConceptSchema" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "WSPutBusinessConceptSchema", propOrder = {
    "businessConceptSchema",
    "wsDataModelPK"
})
public class WSPutBusinessConceptSchema {

    protected String businessConceptSchema;
    protected WSDataModelPK wsDataModelPK;

    /**
     * ��ȡbusinessConceptSchema���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessConceptSchema() {
        return businessConceptSchema;
    }

    /**
     * ����businessConceptSchema���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessConceptSchema(String value) {
        this.businessConceptSchema = value;
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
