
package com.mchz.nbg.talendservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>WSPutBackgroundJob complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="WSPutBackgroundJob">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="wsBackgroundJob" type="{http://www.talend.com/mdm}WSBackgroundJob" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WSPutBackgroundJob", propOrder = {
    "wsBackgroundJob"
})
public class WSPutBackgroundJob {

    protected WSBackgroundJob wsBackgroundJob;

    /**
     * 获取wsBackgroundJob属性的值。
     * 
     * @return
     *     possible object is
     *     {@link WSBackgroundJob }
     *     
     */
    public WSBackgroundJob getWsBackgroundJob() {
        return wsBackgroundJob;
    }

    /**
     * 设置wsBackgroundJob属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link WSBackgroundJob }
     *     
     */
    public void setWsBackgroundJob(WSBackgroundJob value) {
        this.wsBackgroundJob = value;
    }

}
