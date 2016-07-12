
package com.mchz.nbg.talendservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>WSWhereCondition complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
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
     * 获取leftPath属性的值。
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
     * 设置leftPath属性的值。
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
     * 获取operator属性的值。
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
     * 设置operator属性的值。
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
     * 获取rightValueOrPath属性的值。
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
     * 设置rightValueOrPath属性的值。
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
     * 获取spellCheck属性的值。
     * 
     */
    public boolean isSpellCheck() {
        return spellCheck;
    }

    /**
     * 设置spellCheck属性的值。
     * 
     */
    public void setSpellCheck(boolean value) {
        this.spellCheck = value;
    }

    /**
     * 获取stringPredicate属性的值。
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
     * 设置stringPredicate属性的值。
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
