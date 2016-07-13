
package com.mchz.nbg.talendservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>getRoutingOrderV2PKsByCriteriaResponse complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="getRoutingOrderV2PKsByCriteriaResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://www.talend.com/mdm}WSRoutingOrderV2PKArray" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getRoutingOrderV2PKsByCriteriaResponse", propOrder = {
    "_return"
})
public class GetRoutingOrderV2PKsByCriteriaResponse {

    @XmlElement(name = "return")
    protected WSRoutingOrderV2PKArray _return;

    /**
     * ��ȡreturn���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link WSRoutingOrderV2PKArray }
     *     
     */
    public WSRoutingOrderV2PKArray getReturn() {
        return _return;
    }

    /**
     * ����return���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link WSRoutingOrderV2PKArray }
     *     
     */
    public void setReturn(WSRoutingOrderV2PKArray value) {
        this._return = value;
    }

}
