
package com.mchz.nbg.talendservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>WSWhereItem complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡwhereAnd���Ե�ֵ��
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
     * ����whereAnd���Ե�ֵ��
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
     * ��ȡwhereCondition���Ե�ֵ��
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
     * ����whereCondition���Ե�ֵ��
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
     * ��ȡwhereOr���Ե�ֵ��
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
     * ����whereOr���Ե�ֵ��
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
