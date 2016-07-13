
package com.mchz.nbg.talendservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>WSTransformerContextPipeline complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="WSTransformerContextPipeline">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pipelineItem" type="{http://www.talend.com/mdm}WSTransformerContextPipelinePipelineItem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WSTransformerContextPipeline", propOrder = {
    "pipelineItem"
})
public class WSTransformerContextPipeline {

    @XmlElement(nillable = true)
    protected List<WSTransformerContextPipelinePipelineItem> pipelineItem;

    /**
     * Gets the value of the pipelineItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pipelineItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPipelineItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WSTransformerContextPipelinePipelineItem }
     * 
     * 
     */
    public List<WSTransformerContextPipelinePipelineItem> getPipelineItem() {
        if (pipelineItem == null) {
            pipelineItem = new ArrayList<WSTransformerContextPipelinePipelineItem>();
        }
        return this.pipelineItem;
    }

}
