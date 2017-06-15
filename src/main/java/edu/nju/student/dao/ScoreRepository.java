package edu.nju.student.dao;

import edu.nju.student.model.ScoreEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author Qiang
 * @since 15/06/2017
 */
public interface ScoreRepository extends JpaRepository<ScoreEntity, Integer> {

    List<ScoreEntity> findByStudentIdAndCourseId(String studentId, String courseId);
    List<ScoreEntity> findByStudentId(String studentId);
}
