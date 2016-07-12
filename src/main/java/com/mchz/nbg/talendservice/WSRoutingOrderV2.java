
package com.mchz.nbg.talendservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>WSRoutingOrderV2 complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="WSRoutingOrderV2">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="bindingUniverseName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bindingUserToken" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="message" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="serviceJNDI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="serviceParameters" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="status" type="{http://www.talend.com/mdm}WSRoutingOrderV2Status" minOccurs="0"/>
 *         &lt;element name="timeCreated" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="timeLastRunCompleted" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="timeLastRunStarted" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="timeScheduled" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="wsItemPK" type="{http://www.talend.com/mdm}WSItemPK" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WSRoutingOrderV2", propOrder = {
    "bindingUniverseName",
    "bindingUserToken",
    "message",
    "name",
    "serviceJNDI",
    "serviceParameters",
    "status",
    "timeCreated",
    "timeLastRunCompleted",
    "timeLastRunStarted",
    "timeScheduled",
    "wsItemPK"
})
public class WSRoutingOrderV2 {

    protected String bindingUniverseName;
    protected String bindingUserToken;
    protected String message;
    protected String name;
    protected String serviceJNDI;
    protected String serviceParameters;
    @XmlSchemaType(name = "string")
    protected WSRoutingOrderV2Status status;
    protected long timeCreated;
    protected long timeLastRunCompleted;
    protected long timeLastRunStarted;
    protected long timeScheduled;
    protected WSItemPK wsItemPK;

    /**
     * 获取bindingUniverseName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBindingUniverseName() {
        return bindingUniverseName;
    }

    /**
     * 设置bindingUniverseName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBindingUniverseName(String value) {
        this.bindingUniverseName = value;
    }

    /**
     * 获取bindingUserToken属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBindingUserToken() {
        return bindingUserToken;
    }

    /**
     * 设置bindingUserToken属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBindingUserToken(String value) {
        this.bindingUserToken = value;
    }

    /**
     * 获取message属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessage() {
        return message;
    }

    /**
     * 设置message属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessage(String value) {
        this.message = value;
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
     * 获取serviceJNDI属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceJNDI() {
        return serviceJNDI;
    }

    /**
     * 设置serviceJNDI属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceJNDI(String value) {
        this.serviceJNDI = value;
    }

    /**
     * 获取serviceParameters属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceParameters() {
        return serviceParameters;
    }

    /**
     * 设置serviceParameters属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceParameters(String value) {
        this.serviceParameters = value;
    }

    /**
     * 获取status属性的值。
     * 
     * @return
     *     possible object is
     *     {@link WSRoutingOrderV2Status }
     *     
     */
    public WSRoutingOrderV2Status getStatus() {
        return status;
    }

    /**
     * 设置status属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link WSRoutingOrderV2Status }
     *     
     */
    public void setStatus(WSRoutingOrderV2Status value) {
        this.status = value;
    }

    /**
     * 获取timeCreated属性的值。
     * 
     */
    public long getTimeCreated() {
        return timeCreated;
    }

    /**
     * 设置timeCreated属性的值。
     * 
     */
    public void setTimeCreated(long value) {
        this.timeCreated = value;
    }

    /**
     * 获取timeLastRunCompleted属性的值。
     * 
     */
    public long getTimeLastRunCompleted() {
        return timeLastRunCompleted;
    }

    /**
     * 设置timeLastRunCompleted属性的值。
     * 
     */
    public void setTimeLastRunCompleted(long value) {
        this.timeLastRunCompleted = value;
    }

    /**
     * 获取timeLastRunStarted属性的值。
     * 
     */
    public long getTimeLastRunStarted() {
        return timeLastRunStarted;
    }

    /**
     * 设置timeLastRunStarted属性的值。
     * 
     */
    public void setTimeLastRunStarted(long value) {
        this.timeLastRunStarted = value;
    }

    /**
     * 获取timeScheduled属性的值。
     * 
     */
    public long getTimeScheduled() {
        return timeScheduled;
    }

    /**
     * 设置timeScheduled属性的值。
     * 
     */
    public void setTimeScheduled(long value) {
        this.timeScheduled = value;
    }

    /**
     * 获取wsItemPK属性的值。
     * 
     * @return
     *     possible object is
     *     {@link WSItemPK }
     *     
     */
    public WSItemPK getWsItemPK() {
        return wsItemPK;
    }

    /**
     * 设置wsItemPK属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link WSItemPK }
     *     
     */
    public void setWsItemPK(WSItemPK value) {
        this.wsItemPK = value;
    }

}
