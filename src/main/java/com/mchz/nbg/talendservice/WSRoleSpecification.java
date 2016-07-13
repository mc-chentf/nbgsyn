
package com.mchz.nbg.talendservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>WSRoleSpecification complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="WSRoleSpecification">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="admin" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="instance" type="{http://www.talend.com/mdm}WSRoleSpecificationInstance" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="objectType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WSRoleSpecification", propOrder = {
    "admin",
    "instance",
    "objectType"
})
public class WSRoleSpecification {

    protected boolean admin;
    @XmlElement(nillable = true)
    protected List<WSRoleSpecificationInstance> instance;
    protected String objectType;

    /**
     * ��ȡadmin���Ե�ֵ��
     * 
     */
    public boolean isAdmin() {
        return admin;
    }

    /**
     * ����admin���Ե�ֵ��
     * 
     */
    public void setAdmin(boolean value) {
        this.admin = value;
    }

    /**
     * Gets the value of the instance property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the instance property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInstance().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WSRoleSpecificationInstance }
     * 
     * 
     */
    public List<WSRoleSpecificationInstance> getInstance() {
        if (instance == null) {
            instance = new ArrayList<WSRoleSpecificationInstance>();
        }
        return this.instance;
    }

    /**
     * ��ȡobjectType���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObjectType() {
        return objectType;
    }

    /**
     * ����objectType���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObjectType(String value) {
        this.objectType = value;
    }

}
