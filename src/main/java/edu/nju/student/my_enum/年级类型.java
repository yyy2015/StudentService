
package edu.nju.student.my_enum;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>�꼶���͵� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p>
 * <pre>
 * &lt;simpleType name="�꼶����">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="��һ"/>
 *     &lt;enumeration value="���"/>
 *     &lt;enumeration value="����"/>
 *     &lt;enumeration value="����"/>
 *     &lt;enumeration value="��һ"/>
 *     &lt;enumeration value="�ж�"/>
 *     &lt;enumeration value="����"/>
 *     &lt;enumeration value="��ʿ�ڶ�"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "\u5e74\u7ea7\u7c7b\u578b")
@XmlEnum
public enum �꼶���� {

    ��һ,
    ���,
    ����,
    ����,
    ��һ,
    �ж�,
    ����,
    ��ʿ�ڶ�;

    public String value() {
        return name();
    }

    public static �꼶���� fromValue(String v) {
        return valueOf(v);
    }

}
