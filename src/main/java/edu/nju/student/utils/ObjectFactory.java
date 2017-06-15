
package edu.nju.student.utils;

import edu.nju.student.model.*;
import edu.nju.student.my_enum.����ʽ����;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the edu.nju.student.utils package.
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ѧ�Ŵ���_QNAME = new QName("http://jw.nju.edu.cn/schema", "\u5b66\u53f7\u9519\u8bef");
    private final static QName _�γ̳ɼ�_QNAME = new QName("http://jw.nju.edu.cn/schema", "\u8bfe\u7a0b\u6210\u7ee9");
    private final static QName _�γ�_QNAME = new QName("http://jw.nju.edu.cn/schema", "\u8bfe\u7a0b");
    private final static QName _ѧ��_QNAME = new QName("http://jw.nju.edu.cn/schema", "\u5b66\u53f7");
    private final static QName _��������_QNAME = new QName("http://jw.nju.edu.cn/schema", "\u5206\u6570\u9519\u8bef");
    private final static QName _����_QNAME = new QName("http://www.nju.edu.cn/schema", "\u90e8\u95e8");
    private final static QName _ѧ��_QNAME = new QName("http://jw.nju.edu.cn/schema", "\u5b66\u751f");
    private final static QName _�γ̱��_QNAME = new QName("http://jw.nju.edu.cn/schema", "\u8bfe\u7a0b\u7f16\u53f7");
    private final static QName _������Ϣ_QNAME = new QName("http://www.nju.edu.cn/schema", "\u57fa\u672c\u4fe1\u606f");
    private final static QName _�γ̱�Ŵ���_QNAME = new QName("http://jw.nju.edu.cn/schema", "\u8bfe\u7a0b\u7f16\u53f7\u9519\u8bef");
    private final static QName _ѧ�ſγ̺�_QNAME = new QName("http://jw.nju.edu.cn/schema", "\u5b66\u53f7\u8bfe\u7a0b\u53f7");
    private final static QName _�γ̳ɼ��б�_QNAME = new QName("http://jw.nju.edu.cn/schema", "\u8bfe\u7a0b\u6210\u7ee9\u5217\u8868");
    private final static QName _����ʽ_QNAME = new QName("http://jw.nju.edu.cn/schema", "\u6392\u5e8f\u65b9\u5f0f");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: edu.nju.student.utils
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link �γ̳ɼ��б����� }
     * 
     */
    public �γ̳ɼ��б����� create�γ̳ɼ��б�����() {
        return new �γ̳ɼ��б�����();
    }

    /**
     * Create an instance of {@link ѧ����Ϣ }
     * 
     */
    public ѧ����Ϣ createѧ����Ϣ() {
        return new ѧ����Ϣ();
    }

    /**
     * Create an instance of {@link ѧ�ſγ̺����� }
     * 
     */
    public ѧ�ſγ̺����� createѧ�ſγ̺�����() {
        return new ѧ�ſγ̺�����();
    }

    /**
     * Create an instance of {@link �γ���Ϣ }
     * 
     */
    public �γ���Ϣ create�γ���Ϣ() {
        return new �γ���Ϣ();
    }

    /**
     * Create an instance of {@link �γ̳ɼ����� }
     * 
     */
    public �γ̳ɼ����� create�γ̳ɼ�����() {
        return new �γ̳ɼ�����();
    }

    /**
     * Create an instance of {@link �ɼ����� }
     * 
     */
    public �ɼ����� create�ɼ�����() {
        return new �ɼ�����();
    }

    /**
     * Create an instance of {@link �������� }
     * 
     */
    public �������� create��������() {
        return new ��������();
    }

    /**
     * Create an instance of {@link ������Ϣ���� }
     * 
     */
    public ������Ϣ���� create������Ϣ����() {
        return new ������Ϣ����();
    }

    /**
     * Create an instance of {@link ���˻�����Ϣ���� }
     * 
     */
    public ���˻�����Ϣ���� create���˻�����Ϣ����() {
        return new ���˻�����Ϣ����();
    }

    /**
     * Create an instance of {@link ��ַ���� }
     * 
     */
    public ��ַ���� create��ַ����() {
        return new ��ַ����();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jw.nju.edu.cn/schema", name = "\u5b66\u53f7\u9519\u8bef")
    public JAXBElement<String> createѧ�Ŵ���(String value) {
        return new JAXBElement<String>(_ѧ�Ŵ���_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link �γ̳ɼ����� }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jw.nju.edu.cn/schema", name = "\u8bfe\u7a0b\u6210\u7ee9")
    public JAXBElement<�γ̳ɼ�����> create�γ̳ɼ�(�γ̳ɼ����� value) {
        return new JAXBElement<�γ̳ɼ�����>(_�γ̳ɼ�_QNAME, �γ̳ɼ�����.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link �γ���Ϣ }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jw.nju.edu.cn/schema", name = "\u8bfe\u7a0b")
    public JAXBElement<�γ���Ϣ> create�γ�(�γ���Ϣ value) {
        return new JAXBElement<�γ���Ϣ>(_�γ�_QNAME, �γ���Ϣ.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jw.nju.edu.cn/schema", name = "\u5b66\u53f7")
    public JAXBElement<String> createѧ��(String value) {
        return new JAXBElement<String>(_ѧ��_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jw.nju.edu.cn/schema", name = "\u5206\u6570\u9519\u8bef")
    public JAXBElement<String> create��������(String value) {
        return new JAXBElement<String>(_��������_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link �������� }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nju.edu.cn/schema", name = "\u90e8\u95e8")
    public JAXBElement<��������> create����(�������� value) {
        return new JAXBElement<��������>(_����_QNAME, ��������.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ѧ����Ϣ }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jw.nju.edu.cn/schema", name = "\u5b66\u751f")
    public JAXBElement<ѧ����Ϣ> createѧ��(ѧ����Ϣ value) {
        return new JAXBElement<ѧ����Ϣ>(_ѧ��_QNAME, ѧ����Ϣ.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jw.nju.edu.cn/schema", name = "\u8bfe\u7a0b\u7f16\u53f7")
    public JAXBElement<String> create�γ̱��(String value) {
        return new JAXBElement<String>(_�γ̱��_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ������Ϣ���� }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nju.edu.cn/schema", name = "\u57fa\u672c\u4fe1\u606f")
    public JAXBElement<������Ϣ����> create������Ϣ(������Ϣ���� value) {
        return new JAXBElement<������Ϣ����>(_������Ϣ_QNAME, ������Ϣ����.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jw.nju.edu.cn/schema", name = "\u8bfe\u7a0b\u7f16\u53f7\u9519\u8bef")
    public JAXBElement<String> create�γ̱�Ŵ���(String value) {
        return new JAXBElement<String>(_�γ̱�Ŵ���_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ѧ�ſγ̺����� }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jw.nju.edu.cn/schema", name = "\u5b66\u53f7\u8bfe\u7a0b\u53f7")
    public JAXBElement<ѧ�ſγ̺�����> createѧ�ſγ̺�(ѧ�ſγ̺����� value) {
        return new JAXBElement<ѧ�ſγ̺�����>(_ѧ�ſγ̺�_QNAME, ѧ�ſγ̺�����.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link �γ̳ɼ��б����� }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jw.nju.edu.cn/schema", name = "\u8bfe\u7a0b\u6210\u7ee9\u5217\u8868")
    public JAXBElement<�γ̳ɼ��б�����> create�γ̳ɼ��б�(�γ̳ɼ��б����� value) {
        return new JAXBElement<�γ̳ɼ��б�����>(_�γ̳ɼ��б�_QNAME, �γ̳ɼ��б�����.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ����ʽ���� }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jw.nju.edu.cn/schema", name = "\u6392\u5e8f\u65b9\u5f0f")
    public JAXBElement<����ʽ����> create����ʽ(����ʽ���� value) {
        return new JAXBElement<����ʽ����>(_����ʽ_QNAME, ����ʽ����.class, null, value);
    }

}
