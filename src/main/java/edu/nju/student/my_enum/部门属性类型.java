
package edu.nju.student.my_enum;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>部门属性类型的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="部门属性类型">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="系"/>
 *     &lt;enumeration value="院"/>
 *     &lt;enumeration value="直属"/>
 *     &lt;enumeration value="行政部门"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "\u90e8\u95e8\u5c5e\u6027\u7c7b\u578b", namespace = "http://www.nju.edu.cn/schema")
@XmlEnum
public enum 部门属性类型 {

    系,
    院,
    直属,
    行政部门;

    public String value() {
        return name();
    }

    public static 部门属性类型 fromValue(String v) {
        return valueOf(v);
    }

}
