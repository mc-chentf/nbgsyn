
package com.mchz.nbg.talendservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>WSPutRole complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
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
     * 获取wsRole属性的值。
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
     * 设置wsRole属性的值。
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
