
package edu.nju.student.model;

import edu.nju.student.my_enum.年级类型;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>学生信息 complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="学生信息">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="年级" type="{http://jw.nju.edu.cn/schema}年级类型"/>
 *         &lt;element ref="{http://www.nju.edu.cn/schema}基本信息"/>
 *         &lt;element ref="{http://jw.nju.edu.cn/schema}课程成绩列表"/>
 *       &lt;/all>
 *       &lt;attribute name="学号" type="{http://jw.nju.edu.cn/schema}学号类型" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "\u5b66\u751f\u4fe1\u606f", propOrder = {

})
public class 学生信息 {

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected 年级类型 年级;
    @XmlElement(namespace = "http://www.nju.edu.cn/schema", required = true)
    protected 个人信息类型 基本信息;
    @XmlElement(required = true)
    protected 课程成绩列表类型 课程成绩列表;
    @XmlAttribute
    protected String 学号;

    /**
     * 获取年级属性的值。
     * 
     * @return
     *     possible object is
     *     {@link 年级类型 }
     *     
     */
    public 年级类型 get年级() {
        return 年级;
    }

    /**
     * 设置年级属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link 年级类型 }
     *     
     */
    public void set年级(年级类型 value) {
        this.年级 = value;
    }

    /**
     * 获取基本信息属性的值。
     * 
     * @return
     *     possible object is
     *     {@link 个人信息类型 }
     *     
     */
    public 个人信息类型 get基本信息() {
        return 基本信息;
    }

    /**
     * 设置基本信息属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link 个人信息类型 }
     *     
     */
    public void set基本信息(个人信息类型 value) {
        this.基本信息 = value;
    }

    /**
     * 获取课程成绩列表属性的值。
     * 
     * @return
     *     possible object is
     *     {@link 课程成绩列表类型 }
     *     
     */
    public 课程成绩列表类型 get课程成绩列表() {
        return 课程成绩列表;
    }

    /**
     * 设置课程成绩列表属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link 课程成绩列表类型 }
     *     
     */
    public void set课程成绩列表(课程成绩列表类型 value) {
        this.课程成绩列表 = value;
    }

    /**
     * 获取学号属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String get学号() {
        return 学号;
    }

    /**
     * 设置学号属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void set学号(String value) {
        this.学号 = value;
    }

}
