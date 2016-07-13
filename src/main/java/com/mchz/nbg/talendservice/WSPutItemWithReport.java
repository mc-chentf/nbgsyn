
package com.mchz.nbg.talendservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>WSPutItemWithReport complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="WSPutItemWithReport">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="invokeBeforeSaving" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="source" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="wsPutItem" type="{http://www.talend.com/mdm}WSPutItem" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WSPutItemWithReport", propOrder = {
    "invokeBeforeSaving",
    "source",
    "wsPutItem"
})
public class WSPutItemWithReport {

    protected Boolean invokeBeforeSaving;
    protected String source;
    protected WSPutItem wsPutItem;

    /**
     * ��ȡinvokeBeforeSaving���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInvokeBeforeSaving() {
        return invokeBeforeSaving;
    }

    /**
     * ����invokeBeforeSaving���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInvokeBeforeSaving(Boolean value) {
        this.invokeBeforeSaving = value;
    }

    /**
     * ��ȡsource���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSource() {
        return source;
    }

    /**
     * ����source���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSource(String value) {
        this.source = value;
    }

    /**
     * ��ȡwsPutItem���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link WSPutItem }
     *     
     */
    public WSPutItem getWsPutItem() {
        return wsPutItem;
    }

    /**
     * ����wsPutItem���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link WSPutItem }
     *     
     */
    public void setWsPutItem(WSPutItem value) {
        this.wsPutItem = value;
    }

}
