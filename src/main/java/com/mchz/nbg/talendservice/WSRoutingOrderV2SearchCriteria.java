
package com.mchz.nbg.talendservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>WSRoutingOrderV2SearchCriteria complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡanyFieldContains���Ե�ֵ��
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
     * ����anyFieldContains���Ե�ֵ��
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
     * ��ȡitemPKConceptContains���Ե�ֵ��
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
     * ����itemPKConceptContains���Ե�ֵ��
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
     * ��ȡitemPKIDFieldsContain���Ե�ֵ��
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
     * ����itemPKIDFieldsContain���Ե�ֵ��
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
     * ��ȡmessageContain���Ե�ֵ��
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
     * ����messageContain���Ե�ֵ��
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
     * ��ȡnameContains���Ե�ֵ��
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
     * ����nameContains���Ե�ֵ��
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
     * ��ȡserviceJNDIContains���Ե�ֵ��
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
     * ����serviceJNDIContains���Ե�ֵ��
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
     * ��ȡserviceParametersContain���Ե�ֵ��
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
     * ����serviceParametersContain���Ե�ֵ��
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
     * ��ȡtimeCreatedMax���Ե�ֵ��
     * 
     */
    public long getTimeCreatedMax() {
        return timeCreatedMax;
    }

    /**
     * ����timeCreatedMax���Ե�ֵ��
     * 
     */
    public void setTimeCreatedMax(long value) {
        this.timeCreatedMax = value;
    }

    /**
     * ��ȡtimeCreatedMin���Ե�ֵ��
     * 
     */
    public long getTimeCreatedMin() {
        return timeCreatedMin;
    }

    /**
     * ����timeCreatedMin���Ե�ֵ��
     * 
     */
    public void setTimeCreatedMin(long value) {
        this.timeCreatedMin = value;
    }

    /**
     * ��ȡtimeLastRunCompletedMax���Ե�ֵ��
     * 
     */
    public long getTimeLastRunCompletedMax() {
        return timeLastRunCompletedMax;
    }

    /**
     * ����timeLastRunCompletedMax���Ե�ֵ��
     * 
     */
    public void setTimeLastRunCompletedMax(long value) {
        this.timeLastRunCompletedMax = value;
    }

    /**
     * ��ȡtimeLastRunCompletedMin���Ե�ֵ��
     * 
     */
    public long getTimeLastRunCompletedMin() {
        return timeLastRunCompletedMin;
    }

    /**
     * ����timeLastRunCompletedMin���Ե�ֵ��
     * 
     */
    public void setTimeLastRunCompletedMin(long value) {
        this.timeLastRunCompletedMin = value;
    }

    /**
     * ��ȡtimeLastRunStartedMax���Ե�ֵ��
     * 
     */
    public long getTimeLastRunStartedMax() {
        return timeLastRunStartedMax;
    }

    /**
     * ����timeLastRunStartedMax���Ե�ֵ��
     * 
     */
    public void setTimeLastRunStartedMax(long value) {
        this.timeLastRunStartedMax = value;
    }

    /**
     * ��ȡtimeLastRunStartedMin���Ե�ֵ��
     * 
     */
    public long getTimeLastRunStartedMin() {
        return timeLastRunStartedMin;
    }

    /**
     * ����timeLastRunStartedMin���Ե�ֵ��
     * 
     */
    public void setTimeLastRunStartedMin(long value) {
        this.timeLastRunStartedMin = value;
    }

    /**
     * ��ȡtimeScheduledMax���Ե�ֵ��
     * 
     */
    public long getTimeScheduledMax() {
        return timeScheduledMax;
    }

    /**
     * ����timeScheduledMax���Ե�ֵ��
     * 
     */
    public void setTimeScheduledMax(long value) {
        this.timeScheduledMax = value;
    }

    /**
     * ��ȡtimeScheduledMin���Ե�ֵ��
     * 
     */
    public long getTimeScheduledMin() {
        return timeScheduledMin;
    }

    /**
     * ����timeScheduledMin���Ե�ֵ��
     * 
     */
    public void setTimeScheduledMin(long value) {
        this.timeScheduledMin = value;
    }

}
