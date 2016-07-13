
package com.mchz.nbg.talendservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>WSPutDataModel complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="WSPutDataModel">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="wsDataModel" type="{http://www.talend.com/mdm}WSDataModel" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WSPutDataModel", propOrder = {
    "wsDataModel"
})
public class WSPutDataModel {

    protected WSDataModel wsDataModel;

    /**
     * ��ȡwsDataModel���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link WSDataModel }
     *     
     */
    public WSDataModel getWsDataModel() {
        return wsDataModel;
    }

    /**
     * ����wsDataModel���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link WSDataModel }
     *     
     */
    public void setWsDataModel(WSDataModel value) {
        this.wsDataModel = value;
    }

}
