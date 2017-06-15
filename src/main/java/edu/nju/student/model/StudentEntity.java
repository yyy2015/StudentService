package edu.nju.student.model;

import javax.persistence.*;

/**
 * @author Qiang
 * @since 15/06/2017
 */
@Entity
@Table(name = "student", schema = "student_soa", catalog = "")
public class StudentEntity {
    private int id;
    private String studentId;
    private String password;
    private String grade;
    private String telephoneNum;
    private String name;
    private String sex;
    private String education;
    private String marriageStat;
    private String phoneNum;
    private String address;
    private String departmentId;

    public StudentEntity() {
    }

    public StudentEntity(学生信息 student) {


        this.studentId = student.get学号();
        this.password = student.get学号(); //TODO
        this.grade = student.get年级().name();
        this.telephoneNum = student.get基本信息().get座机号码();
        this.name = student.get基本信息().get姓名();
        this.sex = student.get基本信息().get性别().name();
        this.education = student.get基本信息().get教育背景().value();
        this.marriageStat = student.get基本信息().get婚姻状况().value();
        this.phoneNum = student.get基本信息().get手机号码();
        this.address = student.get基本信息().get地址().getAddress();
        this.departmentId = student.get基本信息().get部门().get部门编号();

    }

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "studentId", nullable = false, length = 255)
    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    @Basic
    @Column(name = "password", nullable = false, length = 255)
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Basic
    @Column(name = "grade", nullable = true, length = 255)
    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    @Basic
    @Column(name = "telephoneNum", nullable = true, length = 255)
    public String getTelephoneNum() {
        return telephoneNum;
    }

    public void setTelephoneNum(String telephoneNum) {
        this.telephoneNum = telephoneNum;
    }

    @Basic
    @Column(name = "name", nullable = true, length = 255)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "sex", nullable = true, length = 255)
    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Basic
    @Column(name = "education", nullable = true, length = 255)
    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    @Basic
    @Column(name = "marriageStat", nullable = true, length = 255)
    public String getMarriageStat() {
        return marriageStat;
    }

    public void setMarriageStat(String marriageStat) {
        this.marriageStat = marriageStat;
    }

    @Basic
    @Column(name = "phoneNum", nullable = true, length = 255)
    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    @Basic
    @Column(name = "address", nullable = true, length = 255)
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Basic
    @Column(name = "departmentId", nullable = true, length = 255)
    public String getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        StudentEntity entity = (StudentEntity) o;

        if (id != entity.id) return false;
        if (studentId != null ? !studentId.equals(entity.studentId) : entity.studentId != null) return false;
        if (password != null ? !password.equals(entity.password) : entity.password != null) return false;
        if (grade != null ? !grade.equals(entity.grade) : entity.grade != null) return false;
        if (telephoneNum != null ? !telephoneNum.equals(entity.telephoneNum) : entity.telephoneNum != null)
            return false;
        if (name != null ? !name.equals(entity.name) : entity.name != null) return false;
        if (sex != null ? !sex.equals(entity.sex) : entity.sex != null) return false;
        if (education != null ? !education.equals(entity.education) : entity.education != null) return false;
        if (marriageStat != null ? !marriageStat.equals(entity.marriageStat) : entity.marriageStat != null)
            return false;
        if (phoneNum != null ? !phoneNum.equals(entity.phoneNum) : entity.phoneNum != null) return false;
        if (address != null ? !address.equals(entity.address) : entity.address != null) return false;
        if (departmentId != null ? !departmentId.equals(entity.departmentId) : entity.departmentId != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (studentId != null ? studentId.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + (grade != null ? grade.hashCode() : 0);
        result = 31 * result + (telephoneNum != null ? telephoneNum.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (sex != null ? sex.hashCode() : 0);
        result = 31 * result + (education != null ? education.hashCode() : 0);
        result = 31 * result + (marriageStat != null ? marriageStat.hashCode() : 0);
        result = 31 * result + (phoneNum != null ? phoneNum.hashCode() : 0);
        result = 31 * result + (address != null ? address.hashCode() : 0);
        result = 31 * result + (departmentId != null ? departmentId.hashCode() : 0);
        return result;
    }
}
