
package com.mchz.nbg.talendservice;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>WSRoutingEngineV2ActionCode�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
