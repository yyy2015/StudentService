
package edu.nju.student.my_enum;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>����ʽ���͵� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p>
 * <pre>
 * &lt;simpleType name="����ʽ����">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="�Ӹߵ���"/>
 *     &lt;enumeration value="�ӵ͵���"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "\u6392\u5e8f\u65b9\u5f0f\u7c7b\u578b")
@XmlEnum
public enum ����ʽ���� {

    �Ӹߵ���,
    �ӵ͵���;

    public String value() {
        return name();
    }

    public static ����ʽ���� fromValue(String v) {
        return valueOf(v);
    }

}
