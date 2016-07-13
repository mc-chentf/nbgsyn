
package com.mchz.nbg.talendservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>WSDeleteRoutingOrderV2 complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="WSDeleteRoutingOrderV2">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="wsRoutingOrderPK" type="{http://www.talend.com/mdm}WSRoutingOrderV2PK" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WSDeleteRoutingOrderV2", propOrder = {
    "wsRoutingOrderPK"
})
public class WSDeleteRoutingOrderV2 {

    protected WSRoutingOrderV2PK wsRoutingOrderPK;

    /**
     * ��ȡwsRoutingOrderPK���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link WSRoutingOrderV2PK }
     *     
     */
    public WSRoutingOrderV2PK getWsRoutingOrderPK() {
        return wsRoutingOrderPK;
    }

    /**
     * ����wsRoutingOrderPK���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link WSRoutingOrderV2PK }
     *     
     */
    public void setWsRoutingOrderPK(WSRoutingOrderV2PK value) {
        this.wsRoutingOrderPK = value;
    }

}
