
package com.mchz.nbg.talendservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>WSPutTransformer complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="WSPutTransformer">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="wsTransformer" type="{http://www.talend.com/mdm}WSTransformer" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WSPutTransformer", propOrder = {
    "wsTransformer"
})
public class WSPutTransformer {

    protected WSTransformer wsTransformer;

    /**
     * 获取wsTransformer属性的值。
     * 
     * @return
     *     possible object is
     *     {@link WSTransformer }
     *     
     */
    public WSTransformer getWsTransformer() {
        return wsTransformer;
    }

    /**
     * 设置wsTransformer属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link WSTransformer }
     *     
     */
    public void setWsTransformer(WSTransformer value) {
        this.wsTransformer = value;
    }

}
