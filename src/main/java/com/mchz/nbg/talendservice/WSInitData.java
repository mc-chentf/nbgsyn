
package com.mchz.nbg.talendservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>WSInitData complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
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
     * 获取xmlSchema属性的值。
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
     * 设置xmlSchema属性的值。
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
     * 获取zap属性的值。
     * 
     */
    public boolean isZap() {
        return zap;
    }

    /**
     * 设置zap属性的值。
     * 
     */
    public void setZap(boolean value) {
        this.zap = value;
    }

}
