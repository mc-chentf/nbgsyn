
package com.mchz.nbg.talendservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>processBytesUsingTransformerAsBackgroundJobResponse complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="processBytesUsingTransformerAsBackgroundJobResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://www.talend.com/mdm}WSBackgroundJobPK" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "processBytesUsingTransformerAsBackgroundJobResponse", propOrder = {
    "_return"
})
public class ProcessBytesUsingTransformerAsBackgroundJobResponse {

    @XmlElement(name = "return")
    protected WSBackgroundJobPK _return;

    /**
     * ��ȡreturn���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link WSBackgroundJobPK }
     *     
     */
    public WSBackgroundJobPK getReturn() {
        return _return;
    }

    /**
     * ����return���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link WSBackgroundJobPK }
     *     
     */
    public void setReturn(WSBackgroundJobPK value) {
        this._return = value;
    }

}
