
package com.mchz.nbg.talendservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>WSRoutingEngineV2Action complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="WSRoutingEngineV2Action">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="wsAction" type="{http://www.talend.com/mdm}WSRoutingEngineV2ActionCode" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WSRoutingEngineV2Action", propOrder = {
    "wsAction"
})
public class WSRoutingEngineV2Action {

    @XmlSchemaType(name = "string")
    protected WSRoutingEngineV2ActionCode wsAction;

    /**
     * 获取wsAction属性的值。
     * 
     * @return
     *     possible object is
     *     {@link WSRoutingEngineV2ActionCode }
     *     
     */
    public WSRoutingEngineV2ActionCode getWsAction() {
        return wsAction;
    }

    /**
     * 设置wsAction属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link WSRoutingEngineV2ActionCode }
     *     
     */
    public void setWsAction(WSRoutingEngineV2ActionCode value) {
        this.wsAction = value;
    }

}
