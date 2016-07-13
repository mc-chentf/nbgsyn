
package com.mchz.nbg.talendservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>WSExistsView complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="WSExistsView">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="wsViewPK" type="{http://www.talend.com/mdm}WSViewPK" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WSExistsView", propOrder = {
    "wsViewPK"
})
public class WSExistsView {

    protected WSViewPK wsViewPK;

    /**
     * ��ȡwsViewPK���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link WSViewPK }
     *     
     */
    public WSViewPK getWsViewPK() {
        return wsViewPK;
    }

    /**
     * ����wsViewPK���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link WSViewPK }
     *     
     */
    public void setWsViewPK(WSViewPK value) {
        this.wsViewPK = value;
    }

}
