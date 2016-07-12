
package com.mchz.nbg.talendservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>WSWhereOr complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="WSWhereOr">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="whereItems" type="{http://www.talend.com/mdm}WSWhereItem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WSWhereOr", propOrder = {
    "whereItems"
})
public class WSWhereOr {

    @XmlElement(nillable = true)
    protected List<WSWhereItem> whereItems;

    /**
     * Gets the value of the whereItems property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the whereItems property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWhereItems().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WSWhereItem }
     * 
     * 
     */
    public List<WSWhereItem> getWhereItems() {
        if (whereItems == null) {
            whereItems = new ArrayList<WSWhereItem>();
        }
        return this.whereItems;
    }

}
