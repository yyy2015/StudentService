
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
 *     &lt;enumeration value="δ��"/>
 *     &lt;enumeration value="�ѻ�"/>
 *     &lt;enumeration value="����"/>
 *     &lt;enumeration value="ɥż"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "\u5a5a\u59fb\u7c7b\u578b", namespace = "http://www.nju.edu.cn/schema")
@XmlEnum
public enum �������� {

    δ��,
    �ѻ�,
    ����,
    ɥż;

    public String value() {
        return name();
    }

    public static �������� fromValue(String v) {
        return valueOf(v);
    }

}
