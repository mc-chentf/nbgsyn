
package com.mchz.nbg.talendservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>WSDigest complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="WSDigest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="digestValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="timeStamp" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="wsDigestKey" type="{http://www.talend.com/mdm}WSDigestKey" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WSDigest", propOrder = {
    "digestValue",
    "timeStamp",
    "wsDigestKey"
})
public class WSDigest {

    protected String digestValue;
    protected long timeStamp;
    protected WSDigestKey wsDigestKey;

    /**
     * ��ȡdigestValue���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDigestValue() {
        return digestValue;
    }

    /**
     * ����digestValue���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDigestValue(String value) {
        this.digestValue = value;
    }

    /**
     * ��ȡtimeStamp���Ե�ֵ��
     * 
     */
    public long getTimeStamp() {
        return timeStamp;
    }

    /**
     * ����timeStamp���Ե�ֵ��
     * 
     */
    public void setTimeStamp(long value) {
        this.timeStamp = value;
    }

    /**
     * ��ȡwsDigestKey���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link WSDigestKey }
     *     
     */
    public WSDigestKey getWsDigestKey() {
        return wsDigestKey;
    }

    /**
     * ����wsDigestKey���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link WSDigestKey }
     *     
     */
    public void setWsDigestKey(WSDigestKey value) {
        this.wsDigestKey = value;
    }

}
