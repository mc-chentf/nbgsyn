
package com.mchz.nbg.talendservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>WSTransformerVariablesMapping complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="WSTransformerVariablesMapping">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="hardCoding" type="{http://www.talend.com/mdm}WSTypedContent" minOccurs="0"/>
 *         &lt;element name="pipelineVariable" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pluginVariable" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WSTransformerVariablesMapping", propOrder = {
    "hardCoding",
    "pipelineVariable",
    "pluginVariable"
})
public class WSTransformerVariablesMapping {

    protected WSTypedContent hardCoding;
    protected String pipelineVariable;
    protected String pluginVariable;

    /**
     * 获取hardCoding属性的值。
     * 
     * @return
     *     possible object is
     *     {@link WSTypedContent }
     *     
     */
    public WSTypedContent getHardCoding() {
        return hardCoding;
    }

    /**
     * 设置hardCoding属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link WSTypedContent }
     *     
     */
    public void setHardCoding(WSTypedContent value) {
        this.hardCoding = value;
    }

    /**
     * 获取pipelineVariable属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPipelineVariable() {
        return pipelineVariable;
    }

    /**
     * 设置pipelineVariable属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPipelineVariable(String value) {
        this.pipelineVariable = value;
    }

    /**
     * 获取pluginVariable属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPluginVariable() {
        return pluginVariable;
    }

    /**
     * 设置pluginVariable属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPluginVariable(String value) {
        this.pluginVariable = value;
    }

}
