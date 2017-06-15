
package edu.nju.student.model;

import edu.nju.student.my_enum.婚姻类型;
import edu.nju.student.my_enum.性别类型;
import edu.nju.student.my_enum.教育类型;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>个人基本信息类型 complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="个人基本信息类型">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="姓名" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="性别" type="{http://www.nju.edu.cn/schema}性别类型"/>
 *         &lt;element name="教育背景" type="{http://www.nju.edu.cn/schema}教育类型"/>
 *         &lt;element name="婚姻状况" type="{http://www.nju.edu.cn/schema}婚姻类型"/>
 *         &lt;element name="手机号码" type="{http://www.nju.edu.cn/schema}手机号码类型"/>
 *         &lt;element ref="{http://www.nju.edu.cn/schema}部门"/>
 *         &lt;element name="地址" type="{http://www.nju.edu.cn/schema}地址类型"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "\u4e2a\u4eba\u57fa\u672c\u4fe1\u606f\u7c7b\u578b", namespace = "http://www.nju.edu.cn/schema")
@XmlSeeAlso({
    个人信息类型.class
})
public class 个人基本信息类型 {

    @XmlElement(required = true)
    protected String 姓名;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected 性别类型 性别;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected 教育类型 教育背景;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected 婚姻类型 婚姻状况;
    @XmlElement(required = true)
    protected String 手机号码;
    @XmlElement(required = true)
    protected 部门类型 部门;
    @XmlElement(required = true)
    protected 地址类型 地址;

    /**
     * 获取姓名属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String get姓名() {
        return 姓名;
    }

    /**
     * 设置姓名属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void set姓名(String value) {
        this.姓名 = value;
    }

    /**
     * 获取性别属性的值。
     * 
     * @return
     *     possible object is
     *     {@link 性别类型 }
     *     
     */
    public 性别类型 get性别() {
        return 性别;
    }

    /**
     * 设置性别属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link 性别类型 }
     *     
     */
    public void set性别(性别类型 value) {
        this.性别 = value;
    }

    /**
     * 获取教育背景属性的值。
     * 
     * @return
     *     possible object is
     *     {@link 教育类型 }
     *     
     */
    public 教育类型 get教育背景() {
        return 教育背景;
    }

    /**
     * 设置教育背景属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link 教育类型 }
     *     
     */
    public void set教育背景(教育类型 value) {
        this.教育背景 = value;
    }

    /**
     * 获取婚姻状况属性的值。
     * 
     * @return
     *     possible object is
     *     {@link 婚姻类型 }
     *     
     */
    public 婚姻类型 get婚姻状况() {
        return 婚姻状况;
    }

    /**
     * 设置婚姻状况属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link 婚姻类型 }
     *     
     */
    public void set婚姻状况(婚姻类型 value) {
        this.婚姻状况 = value;
    }

    /**
     * 获取手机号码属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String get手机号码() {
        return 手机号码;
    }

    /**
     * 设置手机号码属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void set手机号码(String value) {
        this.手机号码 = value;
    }

    /**
     * 获取部门属性的值。
     * 
     * @return
     *     possible object is
     *     {@link 部门类型 }
     *     
     */
    public 部门类型 get部门() {
        return 部门;
    }

    /**
     * 设置部门属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link 部门类型 }
     *     
     */
    public void set部门(部门类型 value) {
        this.部门 = value;
    }

    /**
     * 获取地址属性的值。
     * 
     * @return
     *     possible object is
     *     {@link 地址类型 }
     *     
     */
    public 地址类型 get地址() {
        return 地址;
    }

    /**
     * 设置地址属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link 地址类型 }
     *     
     */
    public void set地址(地址类型 value) {
        this.地址 = value;
    }

}
