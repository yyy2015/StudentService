package edu.nju.student.dao;

import edu.nju.student.model.DepartmentEntity;
import org.omg.CORBA.INTERNAL;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Qiang
 * @since 15/06/2017
 */
public interface DepartmentRepository extends JpaRepository<DepartmentEntity, Integer> {

    DepartmentEntity findByDptId(String dptId);
}
