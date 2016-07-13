
package com.mchz.nbg.talendservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>WSGetItemPKsByCriteria complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="WSGetItemPKsByCriteria">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="conceptName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="contentKeywords" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fromDate" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="keys" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="keysKeywords" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="maxItems" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="skip" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="toDate" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="wsDataClusterPK" type="{http://www.talend.com/mdm}WSDataClusterPK" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WSGetItemPKsByCriteria", propOrder = {
    "conceptName",
    "contentKeywords",
    "fromDate",
    "keys",
    "keysKeywords",
    "maxItems",
    "skip",
    "toDate",
    "wsDataClusterPK"
})
public class WSGetItemPKsByCriteria {

    protected String conceptName;
    protected String contentKeywords;
    protected Long fromDate;
    protected String keys;
    protected String keysKeywords;
    protected int maxItems;
    protected int skip;
    protected Long toDate;
    protected WSDataClusterPK wsDataClusterPK;

    /**
     * ��ȡconceptName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConceptName() {
        return conceptName;
    }

    /**
     * ����conceptName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConceptName(String value) {
        this.conceptName = value;
    }

    /**
     * ��ȡcontentKeywords���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContentKeywords() {
        return contentKeywords;
    }

    /**
     * ����contentKeywords���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContentKeywords(String value) {
        this.contentKeywords = value;
    }

    /**
     * ��ȡfromDate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getFromDate() {
        return fromDate;
    }

    /**
     * ����fromDate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setFromDate(Long value) {
        this.fromDate = value;
    }

    /**
     * ��ȡkeys���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKeys() {
        return keys;
    }

    /**
     * ����keys���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKeys(String value) {
        this.keys = value;
    }

    /**
     * ��ȡkeysKeywords���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKeysKeywords() {
        return keysKeywords;
    }

    /**
     * ����keysKeywords���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKeysKeywords(String value) {
        this.keysKeywords = value;
    }

    /**
     * ��ȡmaxItems���Ե�ֵ��
     * 
     */
    public int getMaxItems() {
        return maxItems;
    }

    /**
     * ����maxItems���Ե�ֵ��
     * 
     */
    public void setMaxItems(int value) {
        this.maxItems = value;
    }

    /**
     * ��ȡskip���Ե�ֵ��
     * 
     */
    public int getSkip() {
        return skip;
    }

    /**
     * ����skip���Ե�ֵ��
     * 
     */
    public void setSkip(int value) {
        this.skip = value;
    }

    /**
     * ��ȡtoDate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getToDate() {
        return toDate;
    }

    /**
     * ����toDate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setToDate(Long value) {
        this.toDate = value;
    }

    /**
     * ��ȡwsDataClusterPK���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link WSDataClusterPK }
     *     
     */
    public WSDataClusterPK getWsDataClusterPK() {
        return wsDataClusterPK;
    }

    /**
     * ����wsDataClusterPK���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link WSDataClusterPK }
     *     
     */
    public void setWsDataClusterPK(WSDataClusterPK value) {
        this.wsDataClusterPK = value;
    }

}
