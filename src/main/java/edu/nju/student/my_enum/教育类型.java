
package edu.nju.student.my_enum;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>�������͵� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p>
 * <pre>
 * &lt;simpleType name="��������">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ר��"/>
 *     &lt;enumeration value="����"/>
 *     &lt;enumeration value="˶ʿ"/>
 *     &lt;enumeration value="��ʿ"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "\u6559\u80b2\u7c7b\u578b", namespace = "http://www.nju.edu.cn/schema")
@XmlEnum
public enum �������� {

    ר��,
    ����,
    ˶ʿ,
    ��ʿ;

    public String value() {
        return name();
    }

    public static �������� fromValue(String v) {
        return valueOf(v);
    }

}
