
package com.mchz.nbg.talendservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>WSExecuteTransformerV2 complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="WSExecuteTransformerV2">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="wsTransformerContext" type="{http://www.talend.com/mdm}WSTransformerContext" minOccurs="0"/>
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
@XmlType(name = "WSExecuteTransformerV2", propOrder = {
    "wsTransformerContext",
    "wsTypedContent"
})
public class WSExecuteTransformerV2 {

    protected WSTransformerContext wsTransformerContext;
    protected WSTypedContent wsTypedContent;

    /**
     * ��ȡwsTransformerContext���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link WSTransformerContext }
     *     
     */
    public WSTransformerContext getWsTransformerContext() {
        return wsTransformerContext;
    }

    /**
     * ����wsTransformerContext���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link WSTransformerContext }
     *     
     */
    public void setWsTransformerContext(WSTransformerContext value) {
        this.wsTransformerContext = value;
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
