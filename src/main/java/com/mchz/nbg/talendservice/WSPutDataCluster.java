
package com.mchz.nbg.talendservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>WSPutDataCluster complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="WSPutDataCluster">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="wsDataCluster" type="{http://www.talend.com/mdm}WSDataCluster" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WSPutDataCluster", propOrder = {
    "wsDataCluster"
})
public class WSPutDataCluster {

    protected WSDataCluster wsDataCluster;

    /**
     * 获取wsDataCluster属性的值。
     * 
     * @return
     *     possible object is
     *     {@link WSDataCluster }
     *     
     */
    public WSDataCluster getWsDataCluster() {
        return wsDataCluster;
    }

    /**
     * 设置wsDataCluster属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link WSDataCluster }
     *     
     */
    public void setWsDataCluster(WSDataCluster value) {
        this.wsDataCluster = value;
    }

}
