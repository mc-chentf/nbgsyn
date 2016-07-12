
package com.mchz.nbg.talendservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>WSDigest complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
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
     * 获取digestValue属性的值。
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
     * 设置digestValue属性的值。
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
     * 获取timeStamp属性的值。
     * 
     */
    public long getTimeStamp() {
        return timeStamp;
    }

    /**
     * 设置timeStamp属性的值。
     * 
     */
    public void setTimeStamp(long value) {
        this.timeStamp = value;
    }

    /**
     * 获取wsDigestKey属性的值。
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
     * 设置wsDigestKey属性的值。
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
