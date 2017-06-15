package edu.nju.student.service;

import edu.nju.student.exception.InvalidCourseId;
import edu.nju.student.exception.InvalidScore;
import edu.nju.student.exception.InvalidStudentId;
import edu.nju.student.model.学号课程号类型;
import edu.nju.student.model.课程成绩列表类型;
import edu.nju.student.model.课程成绩类型;
import edu.nju.student.my_enum.排序方式类型;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.jws.WebService;
import javax.xml.ws.Holder;

/**
 * Created by yyy on 2017/6/15.
 */
@WebService(name="ScoreManageService",endpointInterface = "edu.nju.student.service.ScoreManageService",targetNamespace = "http://jw.nju.edu.cn/wsdl")
@Service
@Transactional
public class ScoreManageServiceImpl implements ScoreManageService {

    public 课程成绩列表类型 queryGrade(String parameters) throws InvalidStudentId {
        return null;
    }

    public 课程成绩列表类型 modifyGrade(课程成绩类型 parameters) throws InvalidCourseId, InvalidScore, InvalidStudentId {
        return null;
    }

    public void addGrade(Holder<课程成绩列表类型> parameters) throws InvalidCourseId, InvalidScore, InvalidStudentId {

    }

    public 课程成绩列表类型 deleteGrade(学号课程号类型 parameters) throws InvalidCourseId, InvalidStudentId {
        return null;
    }

    public 课程成绩列表类型 sortGrade(排序方式类型 parameters) throws InvalidCourseId, InvalidStudentId {
        return null;
    }
}
