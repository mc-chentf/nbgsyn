
package com.mchz.nbg.talendservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>WSPutStoredProcedure complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="WSPutStoredProcedure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="wsStoredProcedure" type="{http://www.talend.com/mdm}WSStoredProcedure" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WSPutStoredProcedure", propOrder = {
    "wsStoredProcedure"
})
public class WSPutStoredProcedure {

    protected WSStoredProcedure wsStoredProcedure;

    /**
     * ��ȡwsStoredProcedure���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link WSStoredProcedure }
     *     
     */
    public WSStoredProcedure getWsStoredProcedure() {
        return wsStoredProcedure;
    }

    /**
     * ����wsStoredProcedure���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link WSStoredProcedure }
     *     
     */
    public void setWsStoredProcedure(WSStoredProcedure value) {
        this.wsStoredProcedure = value;
    }

}
