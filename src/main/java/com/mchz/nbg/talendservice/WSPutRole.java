
package com.mchz.nbg.talendservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>WSPutRole complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="WSPutRole">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="wsRole" type="{http://www.talend.com/mdm}WSRole" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WSPutRole", propOrder = {
    "wsRole"
})
public class WSPutRole {

    protected WSRole wsRole;

    /**
     * ��ȡwsRole���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link WSRole }
     *     
     */
    public WSRole getWsRole() {
        return wsRole;
    }

    /**
     * ����wsRole���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link WSRole }
     *     
     */
    public void setWsRole(WSRole value) {
        this.wsRole = value;
    }

}
