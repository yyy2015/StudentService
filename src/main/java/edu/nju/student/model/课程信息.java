
package edu.nju.student.model;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>�γ���Ϣ complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="�γ���Ϣ">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="�γ̱��" type="{http://jw.nju.edu.cn/schema}�γ̱������"/>
 *         &lt;element name="�γ�����" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="�ον�ʦ" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ѧ��" type="{http://jw.nju.edu.cn/schema}ѧ������"/>
 *         &lt;element name="ѡ������" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger"/>
 *         &lt;element name="�γ�����" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="�ο��̲�" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="��ʼʱ��" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="����ʱ��" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "\u8bfe\u7a0b\u4fe1\u606f", propOrder = {

})
public class �γ���Ϣ {

    @XmlElement(required = true)
    protected String �γ̱��;
    @XmlElement(required = true)
    protected String �γ�����;
    @XmlElement(required = true)
    protected String �ον�ʦ;
    @XmlSchemaType(name = "integer")
    protected int ѧ��;
    @XmlElement(required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger ѡ������;
    @XmlElement(required = true)
    protected String �γ�����;
    @XmlElement(required = true)
    protected String �ο��̲�;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar ��ʼʱ��;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar ����ʱ��;

    /**
     * ��ȡ�γ̱�����Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String get�γ̱��() {
        return �γ̱��;
    }

    /**
     * ���ÿγ̱�����Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void set�γ̱��(String value) {
        this.�γ̱�� = value;
    }

    /**
     * ��ȡ�γ��������Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String get�γ�����() {
        return �γ�����;
    }

    /**
     * ���ÿγ��������Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void set�γ�����(String value) {
        this.�γ����� = value;
    }

    /**
     * ��ȡ�ον�ʦ���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String get�ον�ʦ() {
        return �ον�ʦ;
    }

    /**
     * �����ον�ʦ���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void set�ον�ʦ(String value) {
        this.�ον�ʦ = value;
    }

    /**
     * ��ȡѧ�����Ե�ֵ��
     * 
     */
    public int getѧ��() {
        return ѧ��;
    }

    /**
     * ����ѧ�����Ե�ֵ��
     * 
     */
    public void setѧ��(int value) {
        this.ѧ�� = value;
    }

    /**
     * ��ȡѡ���������Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getѡ������() {
        return ѡ������;
    }

    /**
     * ����ѡ���������Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setѡ������(BigInteger value) {
        this.ѡ������ = value;
    }

    /**
     * ��ȡ�γ��������Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String get�γ�����() {
        return �γ�����;
    }

    /**
     * ���ÿγ��������Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void set�γ�����(String value) {
        this.�γ����� = value;
    }

    /**
     * ��ȡ�ο��̲����Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String get�ο��̲�() {
        return �ο��̲�;
    }

    /**
     * ���òο��̲����Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void set�ο��̲�(String value) {
        this.�ο��̲� = value;
    }

    /**
     * ��ȡ��ʼʱ�����Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar get��ʼʱ��() {
        return ��ʼʱ��;
    }

    /**
     * ���ÿ�ʼʱ�����Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void set��ʼʱ��(XMLGregorianCalendar value) {
        this.��ʼʱ�� = value;
    }

    /**
     * ��ȡ����ʱ�����Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar get����ʱ��() {
        return ����ʱ��;
    }

    /**
     * ���ý���ʱ�����Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void set����ʱ��(XMLGregorianCalendar value) {
        this.����ʱ�� = value;
    }

}
