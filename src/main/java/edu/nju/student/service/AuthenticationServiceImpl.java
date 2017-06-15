package edu.nju.student.service;

import edu.nju.student.exception.ErrorPassword;
import edu.nju.student.exception.InvalidStudentId;
import edu.nju.student.model.ѧ����Ϣ;
import edu.nju.student.model.�˺�����;
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

    public ѧ����Ϣ login(�˺����� parameters) throws ErrorPassword, InvalidStudentId {

        if(parameters==null){
            throw new InvalidStudentId("login","account is null");
        }

        if(parameters.getѧ��().equals("")||parameters.getѧ��()==null){
            throw new InvalidStudentId("login","studentId is invalid");
        }

        if(parameters.get����().equals("")||parameters.get����()==null){
            throw new ErrorPassword("login","password is invalid");
        }



        return null;
    }
}
