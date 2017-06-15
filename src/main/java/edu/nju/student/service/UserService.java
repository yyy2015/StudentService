package edu.nju.student.service;

import edu.nju.student.exception.ParamNullException;
import edu.nju.student.model.UserEntity;

import javax.jws.WebParam;
import javax.jws.WebService;

/**
 * Created by yyy on 2017/6/13.
 */

@WebService(name="UserService")
public interface UserService {

    UserEntity login(@WebParam(name="email")String email,@WebParam(name="password")String password) throws ParamNullException;

}
