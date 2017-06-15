package edu.nju.student.service;

import edu.nju.student.exception.ErrorPassword;
import edu.nju.student.exception.InvalidStudentId;
import edu.nju.student.model.学生信息;
import edu.nju.student.model.账号类型;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.jws.WebService;

/**
 * Created by yyy on 2017/6/15.
 */
@WebService(name = "AuthenticationService",endpointInterface = "edu.nju.student.service.AuthenticationService",
targetNamespace = "http://jw.nju.edu.cn/wsdl")
@Service
@Transactional
public class AuthenticationServiceImpl implements AuthenticationService {

    public 学生信息 login(账号类型 parameters) throws ErrorPassword, InvalidStudentId {

        if(parameters==null){
            throw new InvalidStudentId("login","account is null");
        }

        if(parameters.get学号().equals("")||parameters.get学号()==null){
            throw new InvalidStudentId("login","studentId is invalid");
        }

        if(parameters.get密码().equals("")||parameters.get密码()==null){
            throw new ErrorPassword("login","password is invalid");
        }



        return null;
    }
}
