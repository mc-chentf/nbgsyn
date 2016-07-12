
package com.mchz.nbg.talendservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>WSWhereItem complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="WSWhereItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="whereAnd" type="{http://www.talend.com/mdm}WSWhereAnd" minOccurs="0"/>
 *         &lt;element name="whereCondition" type="{http://www.talend.com/mdm}WSWhereCondition" minOccurs="0"/>
 *         &lt;element name="whereOr" type="{http://www.talend.com/mdm}WSWhereOr" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WSWhereItem", propOrder = {
    "whereAnd",
    "whereCondition",
    "whereOr"
})
public class WSWhereItem {

    protected WSWhereAnd whereAnd;
    protected WSWhereCondition whereCondition;
    protected WSWhereOr whereOr;

    /**
     * 获取whereAnd属性的值。
     * 
     * @return
     *     possible object is
     *     {@link WSWhereAnd }
     *     
     */
    public WSWhereAnd getWhereAnd() {
        return whereAnd;
    }

    /**
     * 设置whereAnd属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link WSWhereAnd }
     *     
     */
    public void setWhereAnd(WSWhereAnd value) {
        this.whereAnd = value;
    }

    /**
     * 获取whereCondition属性的值。
     * 
     * @return
     *     possible object is
     *     {@link WSWhereCondition }
     *     
     */
    public WSWhereCondition getWhereCondition() {
        return whereCondition;
    }

    /**
     * 设置whereCondition属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link WSWhereCondition }
     *     
     */
    public void setWhereCondition(WSWhereCondition value) {
        this.whereCondition = value;
    }

    /**
     * 获取whereOr属性的值。
     * 
     * @return
     *     possible object is
     *     {@link WSWhereOr }
     *     
     */
    public WSWhereOr getWhereOr() {
        return whereOr;
    }

    /**
     * 设置whereOr属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link WSWhereOr }
     *     
     */
    public void setWhereOr(WSWhereOr value) {
        this.whereOr = value;
    }

}
