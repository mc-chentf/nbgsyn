
package com.mchz.nbg.talendservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>WSPutTransformer complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="WSPutTransformer">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="wsTransformer" type="{http://www.talend.com/mdm}WSTransformer" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WSPutTransformer", propOrder = {
    "wsTransformer"
})
public class WSPutTransformer {

    protected WSTransformer wsTransformer;

    /**
     * ��ȡwsTransformer���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link WSTransformer }
     *     
     */
    public WSTransformer getWsTransformer() {
        return wsTransformer;
    }

    /**
     * ����wsTransformer���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link WSTransformer }
     *     
     */
    public void setWsTransformer(WSTransformer value) {
        this.wsTransformer = value;
    }

}
