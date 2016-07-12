
package com.mchz.nbg.talendservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>WSPutStoredProcedure complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
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
     * 获取wsStoredProcedure属性的值。
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
     * 设置wsStoredProcedure属性的值。
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
