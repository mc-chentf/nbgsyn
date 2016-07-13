
package com.mchz.nbg.talendservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>WSExistsMenu complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="WSExistsMenu">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="wsMenuPK" type="{http://www.talend.com/mdm}WSMenuPK" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WSExistsMenu", propOrder = {
    "wsMenuPK"
})
public class WSExistsMenu {

    protected WSMenuPK wsMenuPK;

    /**
     * ��ȡwsMenuPK���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link WSMenuPK }
     *     
     */
    public WSMenuPK getWsMenuPK() {
        return wsMenuPK;
    }

    /**
     * ����wsMenuPK���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link WSMenuPK }
     *     
     */
    public void setWsMenuPK(WSMenuPK value) {
        this.wsMenuPK = value;
    }

}
