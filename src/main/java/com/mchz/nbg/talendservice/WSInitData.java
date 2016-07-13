
package com.mchz.nbg.talendservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>WSInitData complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="WSInitData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="xmlSchema" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="zap" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WSInitData", propOrder = {
    "xmlSchema",
    "zap"
})
public class WSInitData {

    protected String xmlSchema;
    protected boolean zap;

    /**
     * ��ȡxmlSchema���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXmlSchema() {
        return xmlSchema;
    }

    /**
     * ����xmlSchema���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXmlSchema(String value) {
        this.xmlSchema = value;
    }

    /**
     * ��ȡzap���Ե�ֵ��
     * 
     */
    public boolean isZap() {
        return zap;
    }

    /**
     * ����zap���Ե�ֵ��
     * 
     */
    public void setZap(boolean value) {
        this.zap = value;
    }

}
