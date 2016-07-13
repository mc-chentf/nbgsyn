
package com.mchz.nbg.talendservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>WSWhereCondition complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="WSWhereCondition">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="leftPath" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="operator" type="{http://www.talend.com/mdm}WSWhereOperator" minOccurs="0"/>
 *         &lt;element name="rightValueOrPath" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="spellCheck" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="stringPredicate" type="{http://www.talend.com/mdm}WSStringPredicate" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WSWhereCondition", propOrder = {
    "leftPath",
    "operator",
    "rightValueOrPath",
    "spellCheck",
    "stringPredicate"
})
public class WSWhereCondition {

    protected String leftPath;
    @XmlSchemaType(name = "string")
    protected WSWhereOperator operator;
    protected String rightValueOrPath;
    protected boolean spellCheck;
    @XmlSchemaType(name = "string")
    protected WSStringPredicate stringPredicate;

    /**
     * ��ȡleftPath���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLeftPath() {
        return leftPath;
    }

    /**
     * ����leftPath���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLeftPath(String value) {
        this.leftPath = value;
    }

    /**
     * ��ȡoperator���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link WSWhereOperator }
     *     
     */
    public WSWhereOperator getOperator() {
        return operator;
    }

    /**
     * ����operator���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link WSWhereOperator }
     *     
     */
    public void setOperator(WSWhereOperator value) {
        this.operator = value;
    }

    /**
     * ��ȡrightValueOrPath���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRightValueOrPath() {
        return rightValueOrPath;
    }

    /**
     * ����rightValueOrPath���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRightValueOrPath(String value) {
        this.rightValueOrPath = value;
    }

    /**
     * ��ȡspellCheck���Ե�ֵ��
     * 
     */
    public boolean isSpellCheck() {
        return spellCheck;
    }

    /**
     * ����spellCheck���Ե�ֵ��
     * 
     */
    public void setSpellCheck(boolean value) {
        this.spellCheck = value;
    }

    /**
     * ��ȡstringPredicate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link WSStringPredicate }
     *     
     */
    public WSStringPredicate getStringPredicate() {
        return stringPredicate;
    }

    /**
     * ����stringPredicate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link WSStringPredicate }
     *     
     */
    public void setStringPredicate(WSStringPredicate value) {
        this.stringPredicate = value;
    }

}
