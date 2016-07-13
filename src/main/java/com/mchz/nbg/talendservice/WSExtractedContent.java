
package com.mchz.nbg.talendservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>WSExtractedContent complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="WSExtractedContent">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="contentType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="wsByteArray" type="{http://www.talend.com/mdm}WSByteArray" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WSExtractedContent", propOrder = {
    "contentType",
    "wsByteArray"
})
public class WSExtractedContent {

    protected String contentType;
    protected WSByteArray wsByteArray;

    /**
     * ��ȡcontentType���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContentType() {
        return contentType;
    }

    /**
     * ����contentType���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContentType(String value) {
        this.contentType = value;
    }

    /**
     * ��ȡwsByteArray���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link WSByteArray }
     *     
     */
    public WSByteArray getWsByteArray() {
        return wsByteArray;
    }

    /**
     * ����wsByteArray���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link WSByteArray }
     *     
     */
    public void setWsByteArray(WSByteArray value) {
        this.wsByteArray = value;
    }

}
