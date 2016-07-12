
package com.mchz.nbg.talendservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>WSPutRoutingRule complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="WSPutRoutingRule">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="wsRoutingRule" type="{http://www.talend.com/mdm}WSRoutingRule" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WSPutRoutingRule", propOrder = {
    "wsRoutingRule"
})
public class WSPutRoutingRule {

    protected WSRoutingRule wsRoutingRule;

    /**
     * 获取wsRoutingRule属性的值。
     * 
     * @return
     *     possible object is
     *     {@link WSRoutingRule }
     *     
     */
    public WSRoutingRule getWsRoutingRule() {
        return wsRoutingRule;
    }

    /**
     * 设置wsRoutingRule属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link WSRoutingRule }
     *     
     */
    public void setWsRoutingRule(WSRoutingRule value) {
        this.wsRoutingRule = value;
    }

}
