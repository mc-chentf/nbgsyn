
package com.mchz.nbg.talendservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>executeRoutingOrderV2Synchronously complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="executeRoutingOrderV2Synchronously">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="arg0" type="{http://www.talend.com/mdm}WSExecuteRoutingOrderV2Synchronously" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "executeRoutingOrderV2Synchronously", propOrder = {
    "arg0"
})
public class ExecuteRoutingOrderV2Synchronously {

    protected WSExecuteRoutingOrderV2Synchronously arg0;

    /**
     * ��ȡarg0���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link WSExecuteRoutingOrderV2Synchronously }
     *     
     */
    public WSExecuteRoutingOrderV2Synchronously getArg0() {
        return arg0;
    }

    /**
     * ����arg0���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link WSExecuteRoutingOrderV2Synchronously }
     *     
     */
    public void setArg0(WSExecuteRoutingOrderV2Synchronously value) {
        this.arg0 = value;
    }

}
