
package edu.nju.student.my_enum;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>婚姻类型的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="婚姻类型">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="未婚"/>
 *     &lt;enumeration value="已婚"/>
 *     &lt;enumeration value="离异"/>
 *     &lt;enumeration value="丧偶"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "\u5a5a\u59fb\u7c7b\u578b", namespace = "http://www.nju.edu.cn/schema")
@XmlEnum
public enum 婚姻类型 {

    未婚,
    已婚,
    离异,
    丧偶;

    public String value() {
        return name();
    }

    public static 婚姻类型 fromValue(String v) {
        return valueOf(v);
    }

}
