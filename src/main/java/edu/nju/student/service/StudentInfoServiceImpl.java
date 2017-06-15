package edu.nju.student.service;

import edu.nju.student.dao.DepartmentRepository;
import edu.nju.student.dao.ScoreRepository;
import edu.nju.student.dao.StudentRepository;
import edu.nju.student.exception.DataFormatError;
import edu.nju.student.exception.ErrorPassword;
import edu.nju.student.exception.InvalidStudentId;
import edu.nju.student.model.*;
import edu.nju.student.my_enum.年级类型;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.jws.WebService;
import javax.xml.ws.Holder;
import java.util.List;

/**
 * Created by yyy on 2017/6/15.
 */
@WebService(name = "StudentInfoService",endpointInterface = "edu.nju.student.service.StudentInfoService",
        targetNamespace = "http://jw.nju.edu.cn/wsdl")
@Service
@Transactional
public class StudentInfoServiceImpl implements StudentInfoService {

    @Autowired
    private StudentRepository studentRepository;
    @Autowired
    private DepartmentRepository departmentRepository;
    @Autowired
    private ScoreRepository scoreRepository;
    @Autowired
    private AuthenticationService authenticationService;


    public void addInfo(Holder<学生信息> parameters) throws DataFormatError {

    }

    public void modifyInfo(Holder<学生信息> parameters) throws DataFormatError {

    }

    public 学生信息 queryInfo(String parameters) throws InvalidStudentId {
        StudentEntity entity = studentRepository.findByStudentId(parameters);

        if (entity == null) {
            throw new InvalidStudentId("Student ID not exists","pStudent ID not exists");
        }

        年级类型 yearType = 年级类型.fromValue(entity.getGrade());

        个人信息类型 personType = new 个人信息类型(entity, departmentRepository.findByDptId(entity.getDepartmentId()));

        List<ScoreEntity > scoreEntities = scoreRepository.findByStudentId(entity.getStudentId() );

        课程成绩列表类型 courseList = new 课程成绩列表类型(scoreEntities);

        return new 学生信息(yearType, personType, courseList, parameters);
    }

    public 学生信息 deleteInfo(String parameters) throws InvalidStudentId {
        // 无需检测异常，若id不存在，执行queryinfo时即会抛出异常
        学生信息 result = queryInfo(parameters);

        scoreRepository.deleteAllByStudentId(parameters);
        studentRepository.deleteByStudentId(parameters);

        return result;

    }
}
