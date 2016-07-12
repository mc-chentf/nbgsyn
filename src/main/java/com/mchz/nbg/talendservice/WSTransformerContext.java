
package com.mchz.nbg.talendservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>WSTransformerContext complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
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
     * 获取pipeline属性的值。
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
     * 设置pipeline属性的值。
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
     * 获取projectedItemPKs属性的值。
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
     * 设置projectedItemPKs属性的值。
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
     * 获取wsTransformerPK属性的值。
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
     * 设置wsTransformerPK属性的值。
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
