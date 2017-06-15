package edu.nju.student.dao;

import edu.nju.student.model.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Qiang
 * @since 15/06/2017
 */
public interface StudentRepository extends JpaRepository<StudentEntity, Integer> {

    StudentEntity findByStudentId(String studentId);
    StudentEntity findByStudentIdAndPassword(String studentId, String password);



    void deleteByStudentId(String parameters);
}
