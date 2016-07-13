
package com.mchz.nbg.talendservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>WSTransformerProcessStep complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="WSTransformerProcessStep">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="disabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="inputMappings" type="{http://www.talend.com/mdm}WSTransformerVariablesMapping" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="outputMappings" type="{http://www.talend.com/mdm}WSTransformerVariablesMapping" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="parameters" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pluginJNDI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WSTransformerProcessStep", propOrder = {
    "description",
    "disabled",
    "inputMappings",
    "outputMappings",
    "parameters",
    "pluginJNDI"
})
public class WSTransformerProcessStep {

    protected String description;
    protected Boolean disabled;
    @XmlElement(nillable = true)
    protected List<WSTransformerVariablesMapping> inputMappings;
    @XmlElement(nillable = true)
    protected List<WSTransformerVariablesMapping> outputMappings;
    protected String parameters;
    protected String pluginJNDI;

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
     * ��ȡdisabled���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDisabled() {
        return disabled;
    }

    /**
     * ����disabled���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDisabled(Boolean value) {
        this.disabled = value;
    }

    /**
     * Gets the value of the inputMappings property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the inputMappings property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInputMappings().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WSTransformerVariablesMapping }
     * 
     * 
     */
    public List<WSTransformerVariablesMapping> getInputMappings() {
        if (inputMappings == null) {
            inputMappings = new ArrayList<WSTransformerVariablesMapping>();
        }
        return this.inputMappings;
    }

    /**
     * Gets the value of the outputMappings property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the outputMappings property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOutputMappings().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WSTransformerVariablesMapping }
     * 
     * 
     */
    public List<WSTransformerVariablesMapping> getOutputMappings() {
        if (outputMappings == null) {
            outputMappings = new ArrayList<WSTransformerVariablesMapping>();
        }
        return this.outputMappings;
    }

    /**
     * ��ȡparameters���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParameters() {
        return parameters;
    }

    /**
     * ����parameters���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParameters(String value) {
        this.parameters = value;
    }

    /**
     * ��ȡpluginJNDI���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPluginJNDI() {
        return pluginJNDI;
    }

    /**
     * ����pluginJNDI���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPluginJNDI(String value) {
        this.pluginJNDI = value;
    }

}
