
package edu.nju.student.model;

import edu.nju.student.my_enum.�꼶����;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ѧ����Ϣ complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="ѧ����Ϣ">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="�꼶" type="{http://jw.nju.edu.cn/schema}�꼶����"/>
 *         &lt;element ref="{http://www.nju.edu.cn/schema}������Ϣ"/>
 *         &lt;element ref="{http://jw.nju.edu.cn/schema}�γ̳ɼ��б�"/>
 *       &lt;/all>
 *       &lt;attribute name="ѧ��" type="{http://jw.nju.edu.cn/schema}ѧ������" />
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
public class ѧ����Ϣ {

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected �꼶���� �꼶;
    @XmlElement(namespace = "http://www.nju.edu.cn/schema", required = true)
    protected ������Ϣ���� ������Ϣ;
    @XmlElement(required = true)
    protected �γ̳ɼ��б����� �γ̳ɼ��б�;
    @XmlAttribute
    protected String ѧ��;

    /**
     * ��ȡ�꼶���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link �꼶���� }
     *     
     */
    public �꼶���� get�꼶() {
        return �꼶;
    }

    /**
     * �����꼶���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link �꼶���� }
     *     
     */
    public void set�꼶(�꼶���� value) {
        this.�꼶 = value;
    }

    /**
     * ��ȡ������Ϣ���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ������Ϣ���� }
     *     
     */
    public ������Ϣ���� get������Ϣ() {
        return ������Ϣ;
    }

    /**
     * ���û�����Ϣ���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ������Ϣ���� }
     *     
     */
    public void set������Ϣ(������Ϣ���� value) {
        this.������Ϣ = value;
    }

    /**
     * ��ȡ�γ̳ɼ��б����Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link �γ̳ɼ��б����� }
     *     
     */
    public �γ̳ɼ��б����� get�γ̳ɼ��б�() {
        return �γ̳ɼ��б�;
    }

    /**
     * ���ÿγ̳ɼ��б����Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link �γ̳ɼ��б����� }
     *     
     */
    public void set�γ̳ɼ��б�(�γ̳ɼ��б����� value) {
        this.�γ̳ɼ��б� = value;
    }

    /**
     * ��ȡѧ�����Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getѧ��() {
        return ѧ��;
    }

    /**
     * ����ѧ�����Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setѧ��(String value) {
        this.ѧ�� = value;
    }

}
