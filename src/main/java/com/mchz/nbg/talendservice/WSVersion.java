
package com.mchz.nbg.talendservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>WSVersion complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="WSVersion">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="build" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="major" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="minor" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="revision" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WSVersion", propOrder = {
    "build",
    "date",
    "description",
    "major",
    "minor",
    "revision"
})
public class WSVersion {

    protected String build;
    protected String date;
    protected String description;
    protected int major;
    protected int minor;
    protected int revision;

    /**
     * ��ȡbuild���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuild() {
        return build;
    }

    /**
     * ����build���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBuild(String value) {
        this.build = value;
    }

    /**
     * ��ȡdate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDate() {
        return date;
    }

    /**
     * ����date���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDate(String value) {
        this.date = value;
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
     * ��ȡmajor���Ե�ֵ��
     * 
     */
    public int getMajor() {
        return major;
    }

    /**
     * ����major���Ե�ֵ��
     * 
     */
    public void setMajor(int value) {
        this.major = value;
    }

    /**
     * ��ȡminor���Ե�ֵ��
     * 
     */
    public int getMinor() {
        return minor;
    }

    /**
     * ����minor���Ե�ֵ��
     * 
     */
    public void setMinor(int value) {
        this.minor = value;
    }

    /**
     * ��ȡrevision���Ե�ֵ��
     * 
     */
    public int getRevision() {
        return revision;
    }

    /**
     * ����revision���Ե�ֵ��
     * 
     */
    public void setRevision(int value) {
        this.revision = value;
    }

}
