
package com.mchz.nbg.talendservice;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>WSWhereOperator的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="WSWhereOperator">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="JOIN"/>
 *     &lt;enumeration value="CONTAINS_TEXT_OF"/>
 *     &lt;enumeration value="CONTAINS"/>
 *     &lt;enumeration value="STARTSWITH"/>
 *     &lt;enumeration value="STRICTCONTAINS"/>
 *     &lt;enumeration value="EQUALS"/>
 *     &lt;enumeration value="NOT_EQUALS"/>
 *     &lt;enumeration value="GREATER_THAN"/>
 *     &lt;enumeration value="GREATER_THAN_OR_EQUAL"/>
 *     &lt;enumeration value="LOWER_THAN"/>
 *     &lt;enumeration value="LOWER_THAN_OR_EQUAL"/>
 *     &lt;enumeration value="NO_OPERATOR"/>
 *     &lt;enumeration value="FULLTEXTSEARCH"/>
 *     &lt;enumeration value="EMPTY_NULL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "WSWhereOperator")
@XmlEnum
public enum WSWhereOperator {

    JOIN,
    CONTAINS_TEXT_OF,
    CONTAINS,
    STARTSWITH,
    STRICTCONTAINS,
    EQUALS,
    NOT_EQUALS,
    GREATER_THAN,
    GREATER_THAN_OR_EQUAL,
    LOWER_THAN,
    LOWER_THAN_OR_EQUAL,
    NO_OPERATOR,
    FULLTEXTSEARCH,
    EMPTY_NULL;

    public String value() {
        return name();
    }

    public static WSWhereOperator fromValue(String v) {
        return valueOf(v);
    }

}
