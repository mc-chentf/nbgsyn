
package com.mchz.nbg.talendservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>WSGetRoutingOrderV2PKsByCriteria complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="WSGetRoutingOrderV2PKsByCriteria">
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
@XmlType(name = "WSGetRoutingOrderV2PKsByCriteria", propOrder = {
    "wsSearchCriteria"
})
public class WSGetRoutingOrderV2PKsByCriteria {

    protected WSRoutingOrderV2SearchCriteria wsSearchCriteria;

    /**
     * ��ȡwsSearchCriteria���Ե�ֵ��
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
     * ����wsSearchCriteria���Ե�ֵ��
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
