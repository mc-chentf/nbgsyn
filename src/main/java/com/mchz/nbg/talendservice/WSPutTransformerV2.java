
package com.mchz.nbg.talendservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>WSPutTransformerV2 complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="WSPutTransformerV2">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="wsTransformerV2" type="{http://www.talend.com/mdm}WSTransformerV2" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WSPutTransformerV2", propOrder = {
    "wsTransformerV2"
})
public class WSPutTransformerV2 {

    protected WSTransformerV2 wsTransformerV2;

    /**
     * ��ȡwsTransformerV2���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link WSTransformerV2 }
     *     
     */
    public WSTransformerV2 getWsTransformerV2() {
        return wsTransformerV2;
    }

    /**
     * ����wsTransformerV2���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link WSTransformerV2 }
     *     
     */
    public void setWsTransformerV2(WSTransformerV2 value) {
        this.wsTransformerV2 = value;
    }

}
