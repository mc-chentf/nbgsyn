
package com.mchz.nbg.talendservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>WSPutRoutingRule complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡwsRoutingRule���Ե�ֵ��
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
     * ����wsRoutingRule���Ե�ֵ��
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
