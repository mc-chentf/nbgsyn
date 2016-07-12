
package com.mchz.nbg.talendservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>WSExecuteRoutingOrderV2Asynchronously complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="WSExecuteRoutingOrderV2Asynchronously">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="routingOrderV2PK" type="{http://www.talend.com/mdm}WSRoutingOrderV2PK" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WSExecuteRoutingOrderV2Asynchronously", propOrder = {
    "routingOrderV2PK"
})
public class WSExecuteRoutingOrderV2Asynchronously {

    protected WSRoutingOrderV2PK routingOrderV2PK;

    /**
     * 获取routingOrderV2PK属性的值。
     * 
     * @return
     *     possible object is
     *     {@link WSRoutingOrderV2PK }
     *     
     */
    public WSRoutingOrderV2PK getRoutingOrderV2PK() {
        return routingOrderV2PK;
    }

    /**
     * 设置routingOrderV2PK属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link WSRoutingOrderV2PK }
     *     
     */
    public void setRoutingOrderV2PK(WSRoutingOrderV2PK value) {
        this.routingOrderV2PK = value;
    }

}
