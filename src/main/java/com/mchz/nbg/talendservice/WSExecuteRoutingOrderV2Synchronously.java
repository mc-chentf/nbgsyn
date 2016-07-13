
package com.mchz.nbg.talendservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>WSExecuteRoutingOrderV2Synchronously complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="WSExecuteRoutingOrderV2Synchronously">
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
@XmlType(name = "WSExecuteRoutingOrderV2Synchronously", propOrder = {
    "routingOrderV2PK"
})
public class WSExecuteRoutingOrderV2Synchronously {

    protected WSRoutingOrderV2PK routingOrderV2PK;

    /**
     * ��ȡroutingOrderV2PK���Ե�ֵ��
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
     * ����routingOrderV2PK���Ե�ֵ��
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
