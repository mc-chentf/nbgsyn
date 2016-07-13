
package com.mchz.nbg.talendservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>WSTransformerContextPipelinePipelineItem complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="WSTransformerContextPipelinePipelineItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="variable" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="wsTypedContent" type="{http://www.talend.com/mdm}WSTypedContent" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WSTransformerContextPipelinePipelineItem", propOrder = {
    "variable",
    "wsTypedContent"
})
public class WSTransformerContextPipelinePipelineItem {

    protected String variable;
    protected WSTypedContent wsTypedContent;

    /**
     * ��ȡvariable���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVariable() {
        return variable;
    }

    /**
     * ����variable���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVariable(String value) {
        this.variable = value;
    }

    /**
     * ��ȡwsTypedContent���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link WSTypedContent }
     *     
     */
    public WSTypedContent getWsTypedContent() {
        return wsTypedContent;
    }

    /**
     * ����wsTypedContent���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link WSTypedContent }
     *     
     */
    public void setWsTypedContent(WSTypedContent value) {
        this.wsTypedContent = value;
    }

}
