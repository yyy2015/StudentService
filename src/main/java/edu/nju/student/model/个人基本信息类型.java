
package edu.nju.student.model;

import edu.nju.student.my_enum.��������;
import edu.nju.student.my_enum.�Ա�����;
import edu.nju.student.my_enum.��������;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>���˻�����Ϣ���� complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="���˻�����Ϣ����">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="����" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="�Ա�" type="{http://www.nju.edu.cn/schema}�Ա�����"/>
 *         &lt;element name="��������" type="{http://www.nju.edu.cn/schema}��������"/>
 *         &lt;element name="����״��" type="{http://www.nju.edu.cn/schema}��������"/>
 *         &lt;element name="�ֻ�����" type="{http://www.nju.edu.cn/schema}�ֻ���������"/>
 *         &lt;element ref="{http://www.nju.edu.cn/schema}����"/>
 *         &lt;element name="��ַ" type="{http://www.nju.edu.cn/schema}��ַ����"/>
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
    ������Ϣ����.class
})
public class ���˻�����Ϣ���� {

    @XmlElement(required = true)
    protected String ����;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected �Ա����� �Ա�;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected �������� ��������;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected �������� ����״��;
    @XmlElement(required = true)
    protected String �ֻ�����;
    @XmlElement(required = true)
    protected �������� ����;
    @XmlElement(required = true)
    protected ��ַ���� ��ַ;

    /**
     * ��ȡ�������Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String get����() {
        return ����;
    }

    /**
     * �����������Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void set����(String value) {
        this.���� = value;
    }

    /**
     * ��ȡ�Ա����Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link �Ա����� }
     *     
     */
    public �Ա����� get�Ա�() {
        return �Ա�;
    }

    /**
     * �����Ա����Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link �Ա����� }
     *     
     */
    public void set�Ա�(�Ա����� value) {
        this.�Ա� = value;
    }

    /**
     * ��ȡ�����������Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link �������� }
     *     
     */
    public �������� get��������() {
        return ��������;
    }

    /**
     * ���ý����������Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link �������� }
     *     
     */
    public void set��������(�������� value) {
        this.�������� = value;
    }

    /**
     * ��ȡ����״�����Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link �������� }
     *     
     */
    public �������� get����״��() {
        return ����״��;
    }

    /**
     * ���û���״�����Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link �������� }
     *     
     */
    public void set����״��(�������� value) {
        this.����״�� = value;
    }

    /**
     * ��ȡ�ֻ��������Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String get�ֻ�����() {
        return �ֻ�����;
    }

    /**
     * �����ֻ��������Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void set�ֻ�����(String value) {
        this.�ֻ����� = value;
    }

    /**
     * ��ȡ�������Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link �������� }
     *     
     */
    public �������� get����() {
        return ����;
    }

    /**
     * ���ò������Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link �������� }
     *     
     */
    public void set����(�������� value) {
        this.���� = value;
    }

    /**
     * ��ȡ��ַ���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ��ַ���� }
     *     
     */
    public ��ַ���� get��ַ() {
        return ��ַ;
    }

    /**
     * ���õ�ַ���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ��ַ���� }
     *     
     */
    public void set��ַ(��ַ���� value) {
        this.��ַ = value;
    }

}
