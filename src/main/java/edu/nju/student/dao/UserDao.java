package edu.nju.student.dao;

import edu.nju.student.model.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.io.Serializable;

/**
 * Created by yyy on 2017/6/14.
 */
public interface UserDao extends JpaRepository<UserEntity,Serializable> {

    UserEntity findById(int id);

    UserEntity findUserEntityByEmail(String email);

    UserEntity findUserEntityByEmailAndPassword(String email,String password);
}
