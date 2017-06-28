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
import java.util.stream.Collectors;

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


    public void addInfo(Holder<学生信息> parameters) throws DataFormatError {
        学生信息 student = parameters.value;
        StudentEntity studentEntity = new StudentEntity(student);
        studentRepository.save(studentEntity);
        List<ScoreEntity> scoreEntities = student.get课程成绩列表().get课程成绩().stream().map(score -> new ScoreEntity(student.get学号(), score.get课程编号(), score.get成绩性质().name(), score.get成绩().get(0).get得分())).collect(Collectors.toList());
        scoreRepository.save(scoreEntities);
    }

    public void modifyInfo(Holder<学生信息> parameters) throws DataFormatError {
        学生信息 student = parameters.value;

        try {
            学号类型 idType = new 学号类型();
            deleteInfo(idType);
            addInfo(parameters);
        } catch (InvalidStudentId invalidStudentId) {
            //TODO   DO Nothing, student id should always exists
        }


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

    public 学生信息 deleteInfo(学号类型 parameters) throws InvalidStudentId {
        // 无需检测异常，若id不存在，执行queryinfo时即会抛出异常
        String id = parameters.get学号();
        学生信息 result = queryInfo(id);

        scoreRepository.deleteAllByStudentId(id);
        studentRepository.deleteByStudentId(id);

        return result;

    }
}
