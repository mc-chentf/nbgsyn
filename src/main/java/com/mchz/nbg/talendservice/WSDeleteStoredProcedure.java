
package com.mchz.nbg.talendservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>WSDeleteStoredProcedure complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="WSDeleteStoredProcedure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="wsStoredProcedurePK" type="{http://www.talend.com/mdm}WSStoredProcedurePK" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WSDeleteStoredProcedure", propOrder = {
    "wsStoredProcedurePK"
})
public class WSDeleteStoredProcedure {

    protected WSStoredProcedurePK wsStoredProcedurePK;

    /**
     * ��ȡwsStoredProcedurePK���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link WSStoredProcedurePK }
     *     
     */
    public WSStoredProcedurePK getWsStoredProcedurePK() {
        return wsStoredProcedurePK;
    }

    /**
     * ����wsStoredProcedurePK���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link WSStoredProcedurePK }
     *     
     */
    public void setWsStoredProcedurePK(WSStoredProcedurePK value) {
        this.wsStoredProcedurePK = value;
    }

}
