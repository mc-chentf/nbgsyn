
package com.mchz.nbg.talendservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>WSTransformerPluginV2Details complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="WSTransformerPluginV2Details">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="documentation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="inputVariableDescriptors" type="{http://www.talend.com/mdm}WSTransformerPluginV2VariableDescriptor" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="outputVariableDescriptors" type="{http://www.talend.com/mdm}WSTransformerPluginV2VariableDescriptor" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="parametersSchema" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WSTransformerPluginV2Details", propOrder = {
    "description",
    "documentation",
    "inputVariableDescriptors",
    "outputVariableDescriptors",
    "parametersSchema"
})
public class WSTransformerPluginV2Details {

    protected String description;
    protected String documentation;
    @XmlElement(nillable = true)
    protected List<WSTransformerPluginV2VariableDescriptor> inputVariableDescriptors;
    @XmlElement(nillable = true)
    protected List<WSTransformerPluginV2VariableDescriptor> outputVariableDescriptors;
    protected String parametersSchema;

    /**
     * ��ȡdescription���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * ����description���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * ��ȡdocumentation���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentation() {
        return documentation;
    }

    /**
     * ����documentation���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentation(String value) {
        this.documentation = value;
    }

    /**
     * Gets the value of the inputVariableDescriptors property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the inputVariableDescriptors property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInputVariableDescriptors().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WSTransformerPluginV2VariableDescriptor }
     * 
     * 
     */
    public List<WSTransformerPluginV2VariableDescriptor> getInputVariableDescriptors() {
        if (inputVariableDescriptors == null) {
            inputVariableDescriptors = new ArrayList<WSTransformerPluginV2VariableDescriptor>();
        }
        return this.inputVariableDescriptors;
    }

    /**
     * Gets the value of the outputVariableDescriptors property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the outputVariableDescriptors property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOutputVariableDescriptors().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WSTransformerPluginV2VariableDescriptor }
     * 
     * 
     */
    public List<WSTransformerPluginV2VariableDescriptor> getOutputVariableDescriptors() {
        if (outputVariableDescriptors == null) {
            outputVariableDescriptors = new ArrayList<WSTransformerPluginV2VariableDescriptor>();
        }
        return this.outputVariableDescriptors;
    }

    /**
     * ��ȡparametersSchema���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParametersSchema() {
        return parametersSchema;
    }

    /**
     * ����parametersSchema���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParametersSchema(String value) {
        this.parametersSchema = value;
    }

}
