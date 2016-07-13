
package com.mchz.nbg.talendservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>WSQuickSearch complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="WSQuickSearch">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="direction" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="matchAllWords" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="maxItems" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="orderBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="searchedValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="skip" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="spellTreshold" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="wsDataClusterPK" type="{http://www.talend.com/mdm}WSDataClusterPK" minOccurs="0"/>
 *         &lt;element name="wsViewPK" type="{http://www.talend.com/mdm}WSViewPK" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WSQuickSearch", propOrder = {
    "direction",
    "matchAllWords",
    "maxItems",
    "orderBy",
    "searchedValue",
    "skip",
    "spellTreshold",
    "wsDataClusterPK",
    "wsViewPK"
})
public class WSQuickSearch {

    protected String direction;
    protected boolean matchAllWords;
    protected int maxItems;
    protected String orderBy;
    protected String searchedValue;
    protected int skip;
    protected int spellTreshold;
    protected WSDataClusterPK wsDataClusterPK;
    protected WSViewPK wsViewPK;

    /**
     * ��ȡdirection���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDirection() {
        return direction;
    }

    /**
     * ����direction���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDirection(String value) {
        this.direction = value;
    }

    /**
     * ��ȡmatchAllWords���Ե�ֵ��
     * 
     */
    public boolean isMatchAllWords() {
        return matchAllWords;
    }

    /**
     * ����matchAllWords���Ե�ֵ��
     * 
     */
    public void setMatchAllWords(boolean value) {
        this.matchAllWords = value;
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
     * ��ȡorderBy���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderBy() {
        return orderBy;
    }

    /**
     * ����orderBy���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderBy(String value) {
        this.orderBy = value;
    }

    /**
     * ��ȡsearchedValue���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSearchedValue() {
        return searchedValue;
    }

    /**
     * ����searchedValue���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSearchedValue(String value) {
        this.searchedValue = value;
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
     * ��ȡspellTreshold���Ե�ֵ��
     * 
     */
    public int getSpellTreshold() {
        return spellTreshold;
    }

    /**
     * ����spellTreshold���Ե�ֵ��
     * 
     */
    public void setSpellTreshold(int value) {
        this.spellTreshold = value;
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

    /**
     * ��ȡwsViewPK���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link WSViewPK }
     *     
     */
    public WSViewPK getWsViewPK() {
        return wsViewPK;
    }

    /**
     * ����wsViewPK���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link WSViewPK }
     *     
     */
    public void setWsViewPK(WSViewPK value) {
        this.wsViewPK = value;
    }

}
