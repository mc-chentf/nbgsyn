
package com.mchz.nbg.talendservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>WSPutTransformerV2 complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="WSPutTransformerV2">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="wsTransformerV2" type="{http://www.talend.com/mdm}WSTransformerV2" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WSPutTransformerV2", propOrder = {
    "wsTransformerV2"
})
public class WSPutTransformerV2 {

    protected WSTransformerV2 wsTransformerV2;

    /**
     * 获取wsTransformerV2属性的值。
     * 
     * @return
     *     possible object is
     *     {@link WSTransformerV2 }
     *     
     */
    public WSTransformerV2 getWsTransformerV2() {
        return wsTransformerV2;
    }

    /**
     * 设置wsTransformerV2属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link WSTransformerV2 }
     *     
     */
    public void setWsTransformerV2(WSTransformerV2 value) {
        this.wsTransformerV2 = value;
    }

}
