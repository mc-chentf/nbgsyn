
package com.mchz.nbg.talendservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>WSPutMenu complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="WSPutMenu">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="wsMenu" type="{http://www.talend.com/mdm}WSMenu" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WSPutMenu", propOrder = {
    "wsMenu"
})
public class WSPutMenu {

    protected WSMenu wsMenu;

    /**
     * 获取wsMenu属性的值。
     * 
     * @return
     *     possible object is
     *     {@link WSMenu }
     *     
     */
    public WSMenu getWsMenu() {
        return wsMenu;
    }

    /**
     * 设置wsMenu属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link WSMenu }
     *     
     */
    public void setWsMenu(WSMenu value) {
        this.wsMenu = value;
    }

}
