package edu.nju.student.model;

import javax.persistence.*;

/**
 * @author Qiang
 * @since 15/06/2017
 */
@Entity
@Table(name = "score", schema = "student_soa", catalog = "")
public class ScoreEntity {
    private String studentId;
    private String courseId;
    private String scoreAttr;
    private Integer score;
    private int id;

    public ScoreEntity() {
    }

    public ScoreEntity(String studentId, String courseId, String scoreAttr, Integer score) {
        this.studentId = studentId;
        this.courseId = courseId;
        this.scoreAttr = scoreAttr;
        this.score = score;
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
    @Column(name = "courseId", nullable = false, length = 255)
    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    @Basic
    @Column(name = "scoreAttr", nullable = false, length = 255)
    public String getScoreAttr() {
        return scoreAttr;
    }

    public void setScoreAttr(String scoreAttr) {
        this.scoreAttr = scoreAttr;
    }

    @Basic
    @Column(name = "score", nullable = true)
    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ScoreEntity that = (ScoreEntity) o;

        if (id != that.id) return false;
        if (studentId != null ? !studentId.equals(that.studentId) : that.studentId != null) return false;
        if (courseId != null ? !courseId.equals(that.courseId) : that.courseId != null) return false;
        if (scoreAttr != null ? !scoreAttr.equals(that.scoreAttr) : that.scoreAttr != null) return false;
        if (score != null ? !score.equals(that.score) : that.score != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = studentId != null ? studentId.hashCode() : 0;
        result = 31 * result + (courseId != null ? courseId.hashCode() : 0);
        result = 31 * result + (scoreAttr != null ? scoreAttr.hashCode() : 0);
        result = 31 * result + (score != null ? score.hashCode() : 0);
        result = 31 * result + id;
        return result;
    }
}
