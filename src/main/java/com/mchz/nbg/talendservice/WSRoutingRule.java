
package com.mchz.nbg.talendservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>WSRoutingRule complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="WSRoutingRule">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="concept" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="condition" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="deactive" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="executeOrder" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="parameters" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="serviceJNDI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="synchronous" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="wsRoutingRuleExpressions" type="{http://www.talend.com/mdm}WSRoutingRuleExpression" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WSRoutingRule", propOrder = {
    "concept",
    "condition",
    "deactive",
    "description",
    "executeOrder",
    "name",
    "parameters",
    "serviceJNDI",
    "synchronous",
    "wsRoutingRuleExpressions"
})
public class WSRoutingRule {

    protected String concept;
    protected String condition;
    protected Boolean deactive;
    protected String description;
    protected int executeOrder;
    protected String name;
    protected String parameters;
    protected String serviceJNDI;
    protected boolean synchronous;
    @XmlElement(nillable = true)
    protected List<WSRoutingRuleExpression> wsRoutingRuleExpressions;

    /**
     * ��ȡconcept���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConcept() {
        return concept;
    }

    /**
     * ����concept���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConcept(String value) {
        this.concept = value;
    }

    /**
     * ��ȡcondition���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCondition() {
        return condition;
    }

    /**
     * ����condition���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCondition(String value) {
        this.condition = value;
    }

    /**
     * ��ȡdeactive���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDeactive() {
        return deactive;
    }

    /**
     * ����deactive���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDeactive(Boolean value) {
        this.deactive = value;
    }

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
     * ��ȡexecuteOrder���Ե�ֵ��
     * 
     */
    public int getExecuteOrder() {
        return executeOrder;
    }

    /**
     * ����executeOrder���Ե�ֵ��
     * 
     */
    public void setExecuteOrder(int value) {
        this.executeOrder = value;
    }

    /**
     * ��ȡname���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * ����name���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
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
     * ��ȡserviceJNDI���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceJNDI() {
        return serviceJNDI;
    }

    /**
     * ����serviceJNDI���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceJNDI(String value) {
        this.serviceJNDI = value;
    }

    /**
     * ��ȡsynchronous���Ե�ֵ��
     * 
     */
    public boolean isSynchronous() {
        return synchronous;
    }

    /**
     * ����synchronous���Ե�ֵ��
     * 
     */
    public void setSynchronous(boolean value) {
        this.synchronous = value;
    }

    /**
     * Gets the value of the wsRoutingRuleExpressions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the wsRoutingRuleExpressions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWsRoutingRuleExpressions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WSRoutingRuleExpression }
     * 
     * 
     */
    public List<WSRoutingRuleExpression> getWsRoutingRuleExpressions() {
        if (wsRoutingRuleExpressions == null) {
            wsRoutingRuleExpressions = new ArrayList<WSRoutingRuleExpression>();
        }
        return this.wsRoutingRuleExpressions;
    }

}
