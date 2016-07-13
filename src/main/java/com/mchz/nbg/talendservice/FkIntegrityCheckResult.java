
package com.mchz.nbg.talendservice;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>fkIntegrityCheckResult�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p>
 * <pre>
 * &lt;simpleType name="fkIntegrityCheckResult">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="FORBIDDEN"/>
 *     &lt;enumeration value="FORBIDDEN_OVERRIDE_ALLOWED"/>
 *     &lt;enumeration value="ALLOWED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "fkIntegrityCheckResult")
@XmlEnum
public enum FkIntegrityCheckResult {

    FORBIDDEN,
    FORBIDDEN_OVERRIDE_ALLOWED,
    ALLOWED;

    public String value() {
        return name();
    }

    public static FkIntegrityCheckResult fromValue(String v) {
        return valueOf(v);
    }

}
