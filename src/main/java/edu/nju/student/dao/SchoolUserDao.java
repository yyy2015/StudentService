package edu.nju.student.dao;

import edu.nju.student.model.SchoolUserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.io.Serializable;

/**
 * Created by yyy on 2017/6/15.
 */
public interface SchoolUserDao extends JpaRepository<SchoolUserEntity,Serializable> {

    SchoolUserEntity findSchoolUserEntityById(int id);

    SchoolUserEntity findSchoolUserEntityByStudentIdAndPassword(String studentId,String password);
}
