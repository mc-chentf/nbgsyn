
package com.mchz.nbg.talendservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>WSRoutingEngineV2Action complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡwsAction���Ե�ֵ��
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
     * ����wsAction���Ե�ֵ��
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
