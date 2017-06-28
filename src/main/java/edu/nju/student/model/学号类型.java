package edu.nju.student.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Created by yyy on 2017/6/28.
 */

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "学号类型", namespace = "http://www.nju.edu.cn/schema")
public class 学号类型 {

    @XmlElement(required = true)
    protected String 学号;

    public String get学号() {
        return 学号;
    }

    public void set学号(String 学号) {
        this.学号 = 学号;
    }
}
