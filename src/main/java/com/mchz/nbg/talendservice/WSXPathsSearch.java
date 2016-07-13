
package com.mchz.nbg.talendservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>WSXPathsSearch complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="WSXPathsSearch">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="direction" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="maxItems" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="orderBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pivotPath" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="returnCount" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="skip" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="spellTreshold" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="viewablePaths" type="{http://www.talend.com/mdm}WSStringArray" minOccurs="0"/>
 *         &lt;element name="whereItem" type="{http://www.talend.com/mdm}WSWhereItem" minOccurs="0"/>
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
@XmlType(name = "WSXPathsSearch", propOrder = {
    "direction",
    "maxItems",
    "orderBy",
    "pivotPath",
    "returnCount",
    "skip",
    "spellTreshold",
    "viewablePaths",
    "whereItem",
    "wsDataClusterPK"
})
public class WSXPathsSearch {

    protected String direction;
    protected int maxItems;
    protected String orderBy;
    protected String pivotPath;
    protected Boolean returnCount;
    protected int skip;
    protected int spellTreshold;
    protected WSStringArray viewablePaths;
    protected WSWhereItem whereItem;
    protected WSDataClusterPK wsDataClusterPK;

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
     * ��ȡpivotPath���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPivotPath() {
        return pivotPath;
    }

    /**
     * ����pivotPath���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPivotPath(String value) {
        this.pivotPath = value;
    }

    /**
     * ��ȡreturnCount���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReturnCount() {
        return returnCount;
    }

    /**
     * ����returnCount���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReturnCount(Boolean value) {
        this.returnCount = value;
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
     * ��ȡviewablePaths���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link WSStringArray }
     *     
     */
    public WSStringArray getViewablePaths() {
        return viewablePaths;
    }

    /**
     * ����viewablePaths���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link WSStringArray }
     *     
     */
    public void setViewablePaths(WSStringArray value) {
        this.viewablePaths = value;
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

}
