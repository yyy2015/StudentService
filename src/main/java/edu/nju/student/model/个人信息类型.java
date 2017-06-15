
package edu.nju.student.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>个人信息类型 complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="个人信息类型">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.nju.edu.cn/schema}个人基本信息类型">
 *       &lt;sequence minOccurs="0">
 *         &lt;element name="座机号码" type="{http://www.nju.edu.cn/schema}座机号码类型"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "\u4e2a\u4eba\u4fe1\u606f\u7c7b\u578b", namespace = "http://www.nju.edu.cn/schema")
public class 个人信息类型
    extends 个人基本信息类型
{

    protected String 座机号码;

    /**
     * 获取座机号码属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String get座机号码() {
        return 座机号码;
    }

    /**
     * 设置座机号码属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void set座机号码(String value) {
        this.座机号码 = value;
    }

}
