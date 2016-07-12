
package com.mchz.nbg.talendservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>getRoutingOrderV2ByCriteriaWithPaging complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="getRoutingOrderV2ByCriteriaWithPaging">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="arg0" type="{http://www.talend.com/mdm}WSGetRoutingOrderV2ByCriteriaWithPaging" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getRoutingOrderV2ByCriteriaWithPaging", propOrder = {
    "arg0"
})
public class GetRoutingOrderV2ByCriteriaWithPaging {

    protected WSGetRoutingOrderV2ByCriteriaWithPaging arg0;

    /**
     * 获取arg0属性的值。
     * 
     * @return
     *     possible object is
     *     {@link WSGetRoutingOrderV2ByCriteriaWithPaging }
     *     
     */
    public WSGetRoutingOrderV2ByCriteriaWithPaging getArg0() {
        return arg0;
    }

    /**
     * 设置arg0属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link WSGetRoutingOrderV2ByCriteriaWithPaging }
     *     
     */
    public void setArg0(WSGetRoutingOrderV2ByCriteriaWithPaging value) {
        this.arg0 = value;
    }

}
