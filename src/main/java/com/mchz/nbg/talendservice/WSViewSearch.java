
package com.mchz.nbg.talendservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>WSViewSearch complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="WSViewSearch">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="direction" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="maxItems" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="orderBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="skip" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="spellTreshold" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="whereItem" type="{http://www.talend.com/mdm}WSWhereItem" minOccurs="0"/>
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
@XmlType(name = "WSViewSearch", propOrder = {
    "direction",
    "maxItems",
    "orderBy",
    "skip",
    "spellTreshold",
    "whereItem",
    "wsDataClusterPK",
    "wsViewPK"
})
public class WSViewSearch {

    protected String direction;
    protected int maxItems;
    protected String orderBy;
    protected int skip;
    protected int spellTreshold;
    protected WSWhereItem whereItem;
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
     * ��ȡwhereItem���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link WSWhereItem }
     *     
     */
    public WSWhereItem getWhereItem() {
        return whereItem;
    }

    /**
     * ����whereItem���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link WSWhereItem }
     *     
     */
    public void setWhereItem(WSWhereItem value) {
        this.whereItem = value;
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
