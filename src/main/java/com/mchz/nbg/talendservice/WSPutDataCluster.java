
package com.mchz.nbg.talendservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>WSPutDataCluster complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡwsDataCluster���Ե�ֵ��
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
     * ����wsDataCluster���Ե�ֵ��
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
