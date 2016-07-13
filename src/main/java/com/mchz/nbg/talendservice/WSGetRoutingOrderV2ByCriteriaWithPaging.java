
package com.mchz.nbg.talendservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>WSGetRoutingOrderV2ByCriteriaWithPaging complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="WSGetRoutingOrderV2ByCriteriaWithPaging">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="wsSearchCriteriaWithPaging" type="{http://www.talend.com/mdm}WSRoutingOrderV2SearchCriteriaWithPaging" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WSGetRoutingOrderV2ByCriteriaWithPaging", propOrder = {
    "wsSearchCriteriaWithPaging"
})
public class WSGetRoutingOrderV2ByCriteriaWithPaging {

    protected WSRoutingOrderV2SearchCriteriaWithPaging wsSearchCriteriaWithPaging;

    /**
     * ��ȡwsSearchCriteriaWithPaging���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link WSRoutingOrderV2SearchCriteriaWithPaging }
     *     
     */
    public WSRoutingOrderV2SearchCriteriaWithPaging getWsSearchCriteriaWithPaging() {
        return wsSearchCriteriaWithPaging;
    }

    /**
     * ����wsSearchCriteriaWithPaging���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link WSRoutingOrderV2SearchCriteriaWithPaging }
     *     
     */
    public void setWsSearchCriteriaWithPaging(WSRoutingOrderV2SearchCriteriaWithPaging value) {
        this.wsSearchCriteriaWithPaging = value;
    }

}
