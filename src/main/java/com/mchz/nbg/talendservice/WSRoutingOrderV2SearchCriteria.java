
package com.mchz.nbg.talendservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>WSRoutingOrderV2SearchCriteria complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="WSRoutingOrderV2SearchCriteria">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="anyFieldContains" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="itemPKConceptContains" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="itemPKIDFieldsContain" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="messageContain" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nameContains" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="serviceJNDIContains" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="serviceParametersContain" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="status" type="{http://www.talend.com/mdm}WSRoutingOrderV2Status" minOccurs="0"/>
 *         &lt;element name="timeCreatedMax" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="timeCreatedMin" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="timeLastRunCompletedMax" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="timeLastRunCompletedMin" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="timeLastRunStartedMax" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="timeLastRunStartedMin" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="timeScheduledMax" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="timeScheduledMin" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WSRoutingOrderV2SearchCriteria", propOrder = {
    "anyFieldContains",
    "itemPKConceptContains",
    "itemPKIDFieldsContain",
    "messageContain",
    "nameContains",
    "serviceJNDIContains",
    "serviceParametersContain",
    "status",
    "timeCreatedMax",
    "timeCreatedMin",
    "timeLastRunCompletedMax",
    "timeLastRunCompletedMin",
    "timeLastRunStartedMax",
    "timeLastRunStartedMin",
    "timeScheduledMax",
    "timeScheduledMin"
})
public class WSRoutingOrderV2SearchCriteria {

    protected String anyFieldContains;
    protected String itemPKConceptContains;
    protected String itemPKIDFieldsContain;
    protected String messageContain;
    protected String nameContains;
    protected String serviceJNDIContains;
    protected String serviceParametersContain;
    @XmlSchemaType(name = "string")
    protected WSRoutingOrderV2Status status;
    protected long timeCreatedMax;
    protected long timeCreatedMin;
    protected long timeLastRunCompletedMax;
    protected long timeLastRunCompletedMin;
    protected long timeLastRunStartedMax;
    protected long timeLastRunStartedMin;
    protected long timeScheduledMax;
    protected long timeScheduledMin;

    /**
     * 获取anyFieldContains属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnyFieldContains() {
        return anyFieldContains;
    }

    /**
     * 设置anyFieldContains属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnyFieldContains(String value) {
        this.anyFieldContains = value;
    }

    /**
     * 获取itemPKConceptContains属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemPKConceptContains() {
        return itemPKConceptContains;
    }

    /**
     * 设置itemPKConceptContains属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemPKConceptContains(String value) {
        this.itemPKConceptContains = value;
    }

    /**
     * 获取itemPKIDFieldsContain属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemPKIDFieldsContain() {
        return itemPKIDFieldsContain;
    }

    /**
     * 设置itemPKIDFieldsContain属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemPKIDFieldsContain(String value) {
        this.itemPKIDFieldsContain = value;
    }

    /**
     * 获取messageContain属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageContain() {
        return messageContain;
    }

    /**
     * 设置messageContain属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageContain(String value) {
        this.messageContain = value;
    }

    /**
     * 获取nameContains属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameContains() {
        return nameContains;
    }

    /**
     * 设置nameContains属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameContains(String value) {
        this.nameContains = value;
    }

    /**
     * 获取serviceJNDIContains属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceJNDIContains() {
        return serviceJNDIContains;
    }

    /**
     * 设置serviceJNDIContains属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceJNDIContains(String value) {
        this.serviceJNDIContains = value;
    }

    /**
     * 获取serviceParametersContain属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceParametersContain() {
        return serviceParametersContain;
    }

    /**
     * 设置serviceParametersContain属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceParametersContain(String value) {
        this.serviceParametersContain = value;
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
     * 获取timeCreatedMax属性的值。
     * 
     */
    public long getTimeCreatedMax() {
        return timeCreatedMax;
    }

    /**
     * 设置timeCreatedMax属性的值。
     * 
     */
    public void setTimeCreatedMax(long value) {
        this.timeCreatedMax = value;
    }

    /**
     * 获取timeCreatedMin属性的值。
     * 
     */
    public long getTimeCreatedMin() {
        return timeCreatedMin;
    }

    /**
     * 设置timeCreatedMin属性的值。
     * 
     */
    public void setTimeCreatedMin(long value) {
        this.timeCreatedMin = value;
    }

    /**
     * 获取timeLastRunCompletedMax属性的值。
     * 
     */
    public long getTimeLastRunCompletedMax() {
        return timeLastRunCompletedMax;
    }

    /**
     * 设置timeLastRunCompletedMax属性的值。
     * 
     */
    public void setTimeLastRunCompletedMax(long value) {
        this.timeLastRunCompletedMax = value;
    }

    /**
     * 获取timeLastRunCompletedMin属性的值。
     * 
     */
    public long getTimeLastRunCompletedMin() {
        return timeLastRunCompletedMin;
    }

    /**
     * 设置timeLastRunCompletedMin属性的值。
     * 
     */
    public void setTimeLastRunCompletedMin(long value) {
        this.timeLastRunCompletedMin = value;
    }

    /**
     * 获取timeLastRunStartedMax属性的值。
     * 
     */
    public long getTimeLastRunStartedMax() {
        return timeLastRunStartedMax;
    }

    /**
     * 设置timeLastRunStartedMax属性的值。
     * 
     */
    public void setTimeLastRunStartedMax(long value) {
        this.timeLastRunStartedMax = value;
    }

    /**
     * 获取timeLastRunStartedMin属性的值。
     * 
     */
    public long getTimeLastRunStartedMin() {
        return timeLastRunStartedMin;
    }

    /**
     * 设置timeLastRunStartedMin属性的值。
     * 
     */
    public void setTimeLastRunStartedMin(long value) {
        this.timeLastRunStartedMin = value;
    }

    /**
     * 获取timeScheduledMax属性的值。
     * 
     */
    public long getTimeScheduledMax() {
        return timeScheduledMax;
    }

    /**
     * 设置timeScheduledMax属性的值。
     * 
     */
    public void setTimeScheduledMax(long value) {
        this.timeScheduledMax = value;
    }

    /**
     * 获取timeScheduledMin属性的值。
     * 
     */
    public long getTimeScheduledMin() {
        return timeScheduledMin;
    }

    /**
     * 设置timeScheduledMin属性的值。
     * 
     */
    public void setTimeScheduledMin(long value) {
        this.timeScheduledMin = value;
    }

}
