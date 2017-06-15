package edu.nju.student.service;

import edu.nju.student.dao.ScoreRepository;
import edu.nju.student.dao.StudentRepository;
import edu.nju.student.exception.InvalidCourseId;
import edu.nju.student.exception.InvalidScore;
import edu.nju.student.exception.InvalidStudentId;
import edu.nju.student.model.*;
import edu.nju.student.my_enum.排序方式类型;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.jws.WebService;
import javax.xml.ws.Holder;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by yyy on 2017/6/15.
 */
@WebService(name = "ScoreManageService", endpointInterface = "edu.nju.student.service.ScoreManageService", targetNamespace = "http://jw.nju.edu.cn/wsdl")
@Service
@Transactional
public class ScoreManageServiceImpl implements ScoreManageService {

    @Autowired
    private StudentRepository studentRepository;
    @Autowired
    private ScoreRepository scoreRepository;

    public 课程成绩列表类型 queryGrade(String parameters) throws InvalidStudentId {
        if (!studentRepository.existsByStudentId(parameters))
            throw new InvalidStudentId("login", "studentId is invalid");

        List<ScoreEntity> scoreEntities = scoreRepository.findByStudentId(parameters);

        return new 课程成绩列表类型(scoreEntities);


    }

    public 课程成绩列表类型 modifyGrade(课程成绩类型 parameters) throws InvalidCourseId, InvalidScore, InvalidStudentId {
        //TODO 异常检测
        成绩类型 score = parameters.get成绩().get(0);
        ScoreEntity entity = scoreRepository.findByStudentIdAndCourseIdAndScoreAttr(score.get学号(), parameters.get课程编号(), parameters.get成绩性质().name());

        if (entity == null ) {
            throw new InvalidScore("modify", "The specific score does not exist");
        }
        entity.setScore(score.get得分());
        scoreRepository.save(entity);
        return queryGrade(score.get学号());
    }

    public void addGrade(Holder<课程成绩列表类型> parameters) throws InvalidCourseId, InvalidScore, InvalidStudentId {

        课程成绩列表类型 list = parameters.value;
        if (list.get课程成绩().size() == 0) {
            throw new InvalidScore("add", "There isnot any score");
        }
        String courseID = list.get课程成绩().get(0).get课程编号();
        String courseType = list.get课程成绩().get(0).get成绩性质().name();
        String studentId = list.get课程成绩().get(0).get成绩().get(0).get学号();
        List<ScoreEntity> result = list.get课程成绩().stream().map(score-> new ScoreEntity(studentId, courseID, courseType, score.get成绩().get(0).get得分())).collect(Collectors.toList());
        scoreRepository.save(result);
    }

    public 课程成绩列表类型 deleteGrade(学号课程号类型 parameters) throws InvalidCourseId, InvalidStudentId {
        //TODO 异常检测

        List<ScoreEntity> entity = scoreRepository.findByStudentIdAndCourseId(parameters.get学号(), parameters.get课程编号());

        if (entity == null || entity.isEmpty()) {
            throw new InvalidStudentId("modify", "The specific score does not exist");
        }
        scoreRepository.delete(entity);
        return queryGrade(parameters.get学号());
    }

    @Override
    public 课程成绩列表类型 sortGrade(排序类型 parameters) throws InvalidCourseId, InvalidStudentId {
        课程成绩列表类型 result = queryGrade(parameters.get学号());
        int factor = parameters.get排序方式() == 排序方式类型.从低到高 ? 1 : -1;
        result.get课程成绩().sort((score1, score2) -> factor * Integer.compare(score1.get成绩().get(0).get得分(), score2.get成绩().get(0).get得分()));
        return result;
    }


}
