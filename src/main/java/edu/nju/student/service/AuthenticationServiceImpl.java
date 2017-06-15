package edu.nju.student.service;

import edu.nju.student.dao.DepartmentRepository;
import edu.nju.student.dao.ScoreRepository;
import edu.nju.student.dao.StudentRepository;
import edu.nju.student.exception.ErrorPassword;
import edu.nju.student.exception.InvalidStudentId;
import edu.nju.student.model.*;
import edu.nju.student.my_enum.年级类型;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.jws.WebService;
import java.util.List;

/**
 * Created by yyy on 2017/6/15.
 */
@WebService(name = "AuthenticationService",endpointInterface = "edu.nju.student.service.AuthenticationService",
targetNamespace = "http://jw.nju.edu.cn/wsdl")
@Service
@Transactional
public class AuthenticationServiceImpl implements AuthenticationService {
    @Autowired
    private StudentRepository studentRepository;
    @Autowired
    private DepartmentRepository departmentRepository;
    @Autowired
    private ScoreRepository scoreRepository;

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

        String studentId = parameters.get学号();
        String password = parameters.get密码();

        StudentEntity entity = studentRepository.findByStudentIdAndPassword(studentId, password);

        if (entity == null) {
            throw new ErrorPassword("login","password or account is invalid");
        }

        年级类型 yearType = 年级类型.fromValue(entity.getGrade());

        个人信息类型 personType = new 个人信息类型(entity, departmentRepository.findByDptId(entity.getDepartmentId()));

        List<ScoreEntity > scoreEntities = scoreRepository.findByStudentId(entity.getStudentId() );

        课程成绩列表类型 courseList = new 课程成绩列表类型(scoreEntities);
//        courseList.get课程成绩().addA



        return null;
    }
}
