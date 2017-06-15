
package edu.nju.student.model;

import edu.nju.student.my_enum.排序方式类型;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>排序类型 complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="排序类型">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="排序方式" type="{http://jw.nju.edu.cn/schema}排序方式类型"/>
 *         &lt;element ref="{http://jw.nju.edu.cn/schema}学号"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "\u6392\u5e8f\u7c7b\u578b", propOrder = {

})
public class 排序类型 {

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected 排序方式类型 排序方式;
    @XmlElement(required = true)
    protected String 学号;

    /**
     * 获取排序方式属性的值。
     * 
     * @return
     *     possible object is
     *     {@link 排序方式类型 }
     *     
     */
    public 排序方式类型 get排序方式() {
        return 排序方式;
    }

    /**
     * 设置排序方式属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link 排序方式类型 }
     *     
     */
    public void set排序方式(排序方式类型 value) {
        this.排序方式 = value;
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
