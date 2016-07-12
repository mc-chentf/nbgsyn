
package com.mchz.nbg.talendservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>WSIsItemModifiedByOther complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="WSIsItemModifiedByOther">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="wsItem" type="{http://www.talend.com/mdm}WSItem" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WSIsItemModifiedByOther", propOrder = {
    "wsItem"
})
public class WSIsItemModifiedByOther {

    protected WSItem wsItem;

    /**
     * 获取wsItem属性的值。
     * 
     * @return
     *     possible object is
     *     {@link WSItem }
     *     
     */
    public WSItem getWsItem() {
        return wsItem;
    }

    /**
     * 设置wsItem属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link WSItem }
     *     
     */
    public void setWsItem(WSItem value) {
        this.wsItem = value;
    }

}
