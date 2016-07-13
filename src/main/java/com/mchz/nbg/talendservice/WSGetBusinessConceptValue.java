
package com.mchz.nbg.talendservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>WSGetBusinessConceptValue complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="WSGetBusinessConceptValue">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="wsBusinessConceptPK" type="{http://www.talend.com/mdm}WSBusinessConceptPK" minOccurs="0"/>
 *         &lt;element name="wsDataClusterPK" type="{http://www.talend.com/mdm}WSDataClusterPK" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WSGetBusinessConceptValue", propOrder = {
    "wsBusinessConceptPK",
    "wsDataClusterPK"
})
public class WSGetBusinessConceptValue {

    protected WSBusinessConceptPK wsBusinessConceptPK;
    protected WSDataClusterPK wsDataClusterPK;

    /**
     * ��ȡwsBusinessConceptPK���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link WSBusinessConceptPK }
     *     
     */
    public WSBusinessConceptPK getWsBusinessConceptPK() {
        return wsBusinessConceptPK;
    }

    /**
     * ����wsBusinessConceptPK���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link WSBusinessConceptPK }
     *     
     */
    public void setWsBusinessConceptPK(WSBusinessConceptPK value) {
        this.wsBusinessConceptPK = value;
    }

    /**
     * ��ȡwsDataClusterPK���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link WSDataClusterPK }
     *     
     */
    public WSDataClusterPK getWsDataClusterPK() {
        return wsDataClusterPK;
    }

    /**
     * ����wsDataClusterPK���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link WSDataClusterPK }
     *     
     */
    public void setWsDataClusterPK(WSDataClusterPK value) {
        this.wsDataClusterPK = value;
    }

}
