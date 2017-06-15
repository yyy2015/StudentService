package edu.nju.student.model;

import javax.persistence.*;

/**
 * @author Qiang
 * @since 15/06/2017
 */
@Entity
@Table(name = "department", schema = "student_soa", catalog = "")
public class DepartmentEntity {
    private int id;
    private String manager;
    private String description;
    private String dptId;
    private String name;
    private String attr;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "manager", nullable = false, length = 255)
    public String getManager() {
        return manager;
    }

    public void setManager(String manager) {
        this.manager = manager;
    }

    @Basic
    @Column(name = "description", nullable = true, length = 255)
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Basic
    @Column(name = "dpt_id", nullable = false, length = 255)
    public String getDptId() {
        return dptId;
    }

    public void setDptId(String dptId) {
        this.dptId = dptId;
    }

    @Basic
    @Column(name = "name", nullable = false, length = 255)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "attr", nullable = false, length = 255)
    public String getAttr() {
        return attr;
    }

    public void setAttr(String attr) {
        this.attr = attr;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DepartmentEntity that = (DepartmentEntity) o;

        if (id != that.id) return false;
        if (manager != null ? !manager.equals(that.manager) : that.manager != null) return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;
        if (dptId != null ? !dptId.equals(that.dptId) : that.dptId != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (attr != null ? !attr.equals(that.attr) : that.attr != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (manager != null ? manager.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (dptId != null ? dptId.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (attr != null ? attr.hashCode() : 0);
        return result;
    }
}
