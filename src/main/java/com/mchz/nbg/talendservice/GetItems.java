package com.mchz.nbg.talendservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * getItems complex type�� Java �ࡣ
 * 
 * <p>
 * ����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="getItems">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="arg0" type="{http://www.talend.com/mdm}WSGetItems" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getItems", propOrder = { "arg0" })
public class GetItems {

	protected WSGetItems arg0;

	/**
	 * ��ȡarg0���Ե�ֵ��
	 * 
	 * @return possible object is {@link WSGetItems }
	 * 
	 */
	public WSGetItems getArg0() {
		return arg0;
	}

	/**
	 * ����arg0���Ե�ֵ��
	 * 
	 * @param value
	 *            allowed object is {@link WSGetItems }
	 * 
	 */
	public void setArg0(WSGetItems value) {
		this.arg0 = value;
	}

}
