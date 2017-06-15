
package edu.nju.student.model;

import edu.nju.student.utils.SystemDefault;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>地址类型 complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="地址类型">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="省份" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="城市" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="区" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="街道" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="号" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "\u5730\u5740\u7c7b\u578b", namespace = "http://www.nju.edu.cn/schema")
public class 地址类型 {

    protected String 省份;
    @XmlElement(required = true)
    protected String 城市;
    @XmlElement(required = true)
    protected String 区;
    @XmlElement(required = true)
    protected String 街道;
    @XmlElement(required = true)
    protected String 号;

    public 地址类型() {
    }

    public 地址类型(String 省份, String 城市, String 区, String 街道, String 号) {
        this.省份 = 省份;
        this.城市 = 城市;
        this.区 = 区;
        this.街道 = 街道;
        this.号 = 号;
    }

    public String getAddress() {
        return 省份 + ";" + 城市 + ";" + 区 + ";" + 街道 + ";" + 号;
    }

    public 地址类型(String address) {
        String[] addressSplit = address.split(SystemDefault.ADDRESS_SPLITER);
        if (addressSplit.length == 5) {
            this.省份 = addressSplit[0];
            this.城市 = addressSplit[1];
            this.区 = addressSplit[2];
            this.街道 = addressSplit[3];
            this.号 = addressSplit[4];
        }

    }

    /**
     * 获取省份属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String get省份() {
        return 省份;
    }

    /**
     * 设置省份属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void set省份(String value) {
        this.省份 = value;
    }

    /**
     * 获取城市属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String get城市() {
        return 城市;
    }

    /**
     * 设置城市属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void set城市(String value) {
        this.城市 = value;
    }

    /**
     * 获取区属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String get区() {
        return 区;
    }

    /**
     * 设置区属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void set区(String value) {
        this.区 = value;
    }

    /**
     * 获取街道属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String get街道() {
        return 街道;
    }

    /**
     * 设置街道属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void set街道(String value) {
        this.街道 = value;
    }

    /**
     * 获取号属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String get号() {
        return 号;
    }

    /**
     * 设置号属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void set号(String value) {
        this.号 = value;
    }

}
