
package com.mchz.nbg.talendservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>getTransformerV2PKsResponse complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="getTransformerV2PKsResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://www.talend.com/mdm}WSTransformerV2PKArray" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getTransformerV2PKsResponse", propOrder = {
    "_return"
})
public class GetTransformerV2PKsResponse {

    @XmlElement(name = "return")
    protected WSTransformerV2PKArray _return;

    /**
     * 获取return属性的值。
     * 
     * @return
     *     possible object is
     *     {@link WSTransformerV2PKArray }
     *     
     */
    public WSTransformerV2PKArray getReturn() {
        return _return;
    }

    /**
     * 设置return属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link WSTransformerV2PKArray }
     *     
     */
    public void setReturn(WSTransformerV2PKArray value) {
        this._return = value;
    }

}
