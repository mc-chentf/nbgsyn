
package com.mchz.nbg.talendservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>WSPipelineTypedContentEntry complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="WSPipelineTypedContentEntry">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="output" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="wsExtractedContent" type="{http://www.talend.com/mdm}WSExtractedContent" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WSPipelineTypedContentEntry", propOrder = {
    "output",
    "wsExtractedContent"
})
public class WSPipelineTypedContentEntry {

    protected String output;
    protected WSExtractedContent wsExtractedContent;

    /**
     * ��ȡoutput���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutput() {
        return output;
    }

    /**
     * ����output���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutput(String value) {
        this.output = value;
    }

    /**
     * ��ȡwsExtractedContent���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link WSExtractedContent }
     *     
     */
    public WSExtractedContent getWsExtractedContent() {
        return wsExtractedContent;
    }

    /**
     * ����wsExtractedContent���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link WSExtractedContent }
     *     
     */
    public void setWsExtractedContent(WSExtractedContent value) {
        this.wsExtractedContent = value;
    }

}
