
package com.mchz.nbg.talendservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>WSExistsRoutingRule complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="WSExistsRoutingRule">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="wsRoutingRulePK" type="{http://www.talend.com/mdm}WSRoutingRulePK" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WSExistsRoutingRule", propOrder = {
    "wsRoutingRulePK"
})
public class WSExistsRoutingRule {

    protected WSRoutingRulePK wsRoutingRulePK;

    /**
     * ��ȡwsRoutingRulePK���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link WSRoutingRulePK }
     *     
     */
    public WSRoutingRulePK getWsRoutingRulePK() {
        return wsRoutingRulePK;
    }

    /**
     * ����wsRoutingRulePK���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link WSRoutingRulePK }
     *     
     */
    public void setWsRoutingRulePK(WSRoutingRulePK value) {
        this.wsRoutingRulePK = value;
    }

}
