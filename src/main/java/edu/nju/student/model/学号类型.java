package edu.nju.student.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Created by yyy on 2017/6/28.
 */

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ѧ������", namespace = "http://www.nju.edu.cn/schema")
public class ѧ������ {

    @XmlElement(required = true)
    protected String ѧ��;

    public String getѧ��() {
        return ѧ��;
    }

    public void setѧ��(String ѧ��) {
        this.ѧ�� = ѧ��;
    }
}
