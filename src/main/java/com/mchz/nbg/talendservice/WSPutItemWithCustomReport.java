
package com.mchz.nbg.talendservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>WSPutItemWithCustomReport complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="WSPutItemWithCustomReport">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="user" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="wsPutItemWithReport" type="{http://www.talend.com/mdm}WSPutItemWithReport" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WSPutItemWithCustomReport", propOrder = {
    "user",
    "wsPutItemWithReport"
})
public class WSPutItemWithCustomReport {

    protected String user;
    protected WSPutItemWithReport wsPutItemWithReport;

    /**
     * 获取user属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUser() {
        return user;
    }

    /**
     * 设置user属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUser(String value) {
        this.user = value;
    }

    /**
     * 获取wsPutItemWithReport属性的值。
     * 
     * @return
     *     possible object is
     *     {@link WSPutItemWithReport }
     *     
     */
    public WSPutItemWithReport getWsPutItemWithReport() {
        return wsPutItemWithReport;
    }

    /**
     * 设置wsPutItemWithReport属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link WSPutItemWithReport }
     *     
     */
    public void setWsPutItemWithReport(WSPutItemWithReport value) {
        this.wsPutItemWithReport = value;
    }

}
