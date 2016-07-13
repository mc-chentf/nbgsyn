
package com.mchz.nbg.talendservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>WSExistsRole complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="WSExistsRole">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="wsRolePK" type="{http://www.talend.com/mdm}WSRolePK" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WSExistsRole", propOrder = {
    "wsRolePK"
})
public class WSExistsRole {

    protected WSRolePK wsRolePK;

    /**
     * ��ȡwsRolePK���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link WSRolePK }
     *     
     */
    public WSRolePK getWsRolePK() {
        return wsRolePK;
    }

    /**
     * ����wsRolePK���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link WSRolePK }
     *     
     */
    public void setWsRolePK(WSRolePK value) {
        this.wsRolePK = value;
    }

}
