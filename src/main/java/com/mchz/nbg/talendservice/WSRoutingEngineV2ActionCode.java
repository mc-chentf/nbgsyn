
package com.mchz.nbg.talendservice;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>WSRoutingEngineV2ActionCode的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="WSRoutingEngineV2ActionCode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="START"/>
 *     &lt;enumeration value="STOP"/>
 *     &lt;enumeration value="SUSPEND"/>
 *     &lt;enumeration value="RESUME"/>
 *     &lt;enumeration value="STATUS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "WSRoutingEngineV2ActionCode")
@XmlEnum
public enum WSRoutingEngineV2ActionCode {

    START,
    STOP,
    SUSPEND,
    RESUME,
    STATUS;

    public String value() {
        return name();
    }

    public static WSRoutingEngineV2ActionCode fromValue(String v) {
        return valueOf(v);
    }

}
