
package edu.nju.student.model;

import edu.nju.student.my_enum.����ʽ����;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>�������� complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="��������">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="����ʽ" type="{http://jw.nju.edu.cn/schema}����ʽ����"/>
 *         &lt;element ref="{http://jw.nju.edu.cn/schema}ѧ��"/>
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
public class �������� {

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected ����ʽ���� ����ʽ;
    @XmlElement(required = true)
    protected String ѧ��;

    /**
     * ��ȡ����ʽ���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ����ʽ���� }
     *     
     */
    public ����ʽ���� get����ʽ() {
        return ����ʽ;
    }

    /**
     * ��������ʽ���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ����ʽ���� }
     *     
     */
    public void set����ʽ(����ʽ���� value) {
        this.����ʽ = value;
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
