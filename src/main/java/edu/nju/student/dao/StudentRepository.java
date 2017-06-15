package edu.nju.student.dao;

import edu.nju.student.model.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Qiang
 * @since 15/06/2017
 */
public interface StudentRepository extends JpaRepository<StudentEntity, Integer> {


    StudentEntity findByStudentIdAndPassword(String studentId, String password);

    boolean existsStudentId(String studentId);
}
