
package com.mchz.nbg.talendservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>WSGetRoutingOrderV2SByCriteria complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="WSGetRoutingOrderV2SByCriteria">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="wsSearchCriteria" type="{http://www.talend.com/mdm}WSRoutingOrderV2SearchCriteria" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WSGetRoutingOrderV2SByCriteria", propOrder = {
    "wsSearchCriteria"
})
public class WSGetRoutingOrderV2SByCriteria {

    protected WSRoutingOrderV2SearchCriteria wsSearchCriteria;

    /**
     * 获取wsSearchCriteria属性的值。
     * 
     * @return
     *     possible object is
     *     {@link WSRoutingOrderV2SearchCriteria }
     *     
     */
    public WSRoutingOrderV2SearchCriteria getWsSearchCriteria() {
        return wsSearchCriteria;
    }

    /**
     * 设置wsSearchCriteria属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link WSRoutingOrderV2SearchCriteria }
     *     
     */
    public void setWsSearchCriteria(WSRoutingOrderV2SearchCriteria value) {
        this.wsSearchCriteria = value;
    }

}
