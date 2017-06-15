
package edu.nju.student.model;

import edu.nju.student.my_enum.��������;
import edu.nju.student.my_enum.�Ա�����;
import edu.nju.student.my_enum.��������;
import edu.nju.student.my_enum.������������;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>������Ϣ���� complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="������Ϣ����">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.nju.edu.cn/schema}���˻�����Ϣ����">
 *       &lt;sequence minOccurs="0">
 *         &lt;element name="��������" type="{http://www.nju.edu.cn/schema}������������"/>
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
public class ������Ϣ����
    extends ���˻�����Ϣ����
{

    protected String ��������;

    public ������Ϣ����() {
    }

    public ������Ϣ����(StudentEntity entity, DepartmentEntity departmentEntity) {
        super();
        this.set��������(entity.getTelephoneNum());
        this.set��ַ(new ��ַ����(entity.getAddress()));
        this.set����(entity.getName());
        this.set����״��(��������.fromValue(entity.getMarriageStat()));
        this.set�Ա�(�Ա�����.fromValue(entity.getMarriageStat()));
        this.set��������(��������.fromValue(entity.getEducation()));
        this.set����(new ��������(departmentEntity.getManager(), departmentEntity.getDescription(), ������������.fromValue(departmentEntity.getAttr()), departmentEntity.getDptId(), departmentEntity.getName()));
        this.set�ֻ�����(entity.getPhoneNum());
    }

    /**
     * ��ȡ�����������Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String get��������() {
        return ��������;
    }

    /**
     * ���������������Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void set��������(String value) {
        this.�������� = value;
    }

}
