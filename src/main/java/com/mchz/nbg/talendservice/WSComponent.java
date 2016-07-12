
package com.mchz.nbg.talendservice;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>WSComponent的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="WSComponent">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="DataManager"/>
 *     &lt;enumeration value="Service"/>
 *     &lt;enumeration value="Connector"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "WSComponent")
@XmlEnum
public enum WSComponent {

    @XmlEnumValue("DataManager")
    DATA_MANAGER("DataManager"),
    @XmlEnumValue("Service")
    SERVICE("Service"),
    @XmlEnumValue("Connector")
    CONNECTOR("Connector");
    private final String value;

    WSComponent(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static WSComponent fromValue(String v) {
        for (WSComponent c: WSComponent.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
