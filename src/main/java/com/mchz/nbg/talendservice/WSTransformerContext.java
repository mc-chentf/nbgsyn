
package com.mchz.nbg.talendservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>WSTransformerContext complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="WSTransformerContext">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pipeline" type="{http://www.talend.com/mdm}WSTransformerContextPipeline" minOccurs="0"/>
 *         &lt;element name="projectedItemPKs" type="{http://www.talend.com/mdm}WSTransformerContextProjectedItemPKs" minOccurs="0"/>
 *         &lt;element name="wsTransformerPK" type="{http://www.talend.com/mdm}WSTransformerV2PK" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WSTransformerContext", propOrder = {
    "pipeline",
    "projectedItemPKs",
    "wsTransformerPK"
})
public class WSTransformerContext {

    protected WSTransformerContextPipeline pipeline;
    protected WSTransformerContextProjectedItemPKs projectedItemPKs;
    protected WSTransformerV2PK wsTransformerPK;

    /**
     * ��ȡpipeline���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link WSTransformerContextPipeline }
     *     
     */
    public WSTransformerContextPipeline getPipeline() {
        return pipeline;
    }

    /**
     * ����pipeline���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link WSTransformerContextPipeline }
     *     
     */
    public void setPipeline(WSTransformerContextPipeline value) {
        this.pipeline = value;
    }

    /**
     * ��ȡprojectedItemPKs���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link WSTransformerContextProjectedItemPKs }
     *     
     */
    public WSTransformerContextProjectedItemPKs getProjectedItemPKs() {
        return projectedItemPKs;
    }

    /**
     * ����projectedItemPKs���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link WSTransformerContextProjectedItemPKs }
     *     
     */
    public void setProjectedItemPKs(WSTransformerContextProjectedItemPKs value) {
        this.projectedItemPKs = value;
    }

    /**
     * ��ȡwsTransformerPK���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link WSTransformerV2PK }
     *     
     */
    public WSTransformerV2PK getWsTransformerPK() {
        return wsTransformerPK;
    }

    /**
     * ����wsTransformerPK���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link WSTransformerV2PK }
     *     
     */
    public void setWsTransformerPK(WSTransformerV2PK value) {
        this.wsTransformerPK = value;
    }

}
