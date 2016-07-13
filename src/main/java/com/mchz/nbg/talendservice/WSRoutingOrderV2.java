
package com.mchz.nbg.talendservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>WSRoutingOrderV2 complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡbindingUniverseName���Ե�ֵ��
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
     * ����bindingUniverseName���Ե�ֵ��
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
     * ��ȡbindingUserToken���Ե�ֵ��
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
     * ����bindingUserToken���Ե�ֵ��
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
     * ��ȡmessage���Ե�ֵ��
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
     * ����message���Ե�ֵ��
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
     * ��ȡname���Ե�ֵ��
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
     * ����name���Ե�ֵ��
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
     * ��ȡserviceJNDI���Ե�ֵ��
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
     * ����serviceJNDI���Ե�ֵ��
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
     * ��ȡserviceParameters���Ե�ֵ��
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
     * ����serviceParameters���Ե�ֵ��
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
     * ��ȡstatus���Ե�ֵ��
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
     * ����status���Ե�ֵ��
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
     * ��ȡtimeCreated���Ե�ֵ��
     * 
     */
    public long getTimeCreated() {
        return timeCreated;
    }

    /**
     * ����timeCreated���Ե�ֵ��
     * 
     */
    public void setTimeCreated(long value) {
        this.timeCreated = value;
    }

    /**
     * ��ȡtimeLastRunCompleted���Ե�ֵ��
     * 
     */
    public long getTimeLastRunCompleted() {
        return timeLastRunCompleted;
    }

    /**
     * ����timeLastRunCompleted���Ե�ֵ��
     * 
     */
    public void setTimeLastRunCompleted(long value) {
        this.timeLastRunCompleted = value;
    }

    /**
     * ��ȡtimeLastRunStarted���Ե�ֵ��
     * 
     */
    public long getTimeLastRunStarted() {
        return timeLastRunStarted;
    }

    /**
     * ����timeLastRunStarted���Ե�ֵ��
     * 
     */
    public void setTimeLastRunStarted(long value) {
        this.timeLastRunStarted = value;
    }

    /**
     * ��ȡtimeScheduled���Ե�ֵ��
     * 
     */
    public long getTimeScheduled() {
        return timeScheduled;
    }

    /**
     * ����timeScheduled���Ե�ֵ��
     * 
     */
    public void setTimeScheduled(long value) {
        this.timeScheduled = value;
    }

    /**
     * ��ȡwsItemPK���Ե�ֵ��
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
     * ����wsItemPK���Ե�ֵ��
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
