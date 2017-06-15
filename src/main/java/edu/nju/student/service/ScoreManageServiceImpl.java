package edu.nju.student.service;

import edu.nju.student.dao.ScoreRepository;
import edu.nju.student.dao.StudentRepository;
import edu.nju.student.exception.InvalidCourseId;
import edu.nju.student.exception.InvalidScore;
import edu.nju.student.exception.InvalidStudentId;
import edu.nju.student.model.*;
import edu.nju.student.my_enum.����ʽ����;
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

    public �γ̳ɼ��б����� queryGrade(String parameters) throws InvalidStudentId {
        if (!studentRepository.existsByStudentId(parameters))
            throw new InvalidStudentId("login", "studentId is invalid");

        List<ScoreEntity> scoreEntities = scoreRepository.findByStudentId(parameters);

        return new �γ̳ɼ��б�����(scoreEntities);


    }

    public �γ̳ɼ��б����� modifyGrade(�γ̳ɼ����� parameters) throws InvalidCourseId, InvalidScore, InvalidStudentId {
        //TODO �쳣���
        �ɼ����� score = parameters.get�ɼ�().get(0);
        ScoreEntity entity = scoreRepository.findByStudentIdAndCourseIdAndScoreAttr(score.getѧ��(), parameters.get�γ̱��(), parameters.get�ɼ�����().name());

        if (entity == null ) {
            throw new InvalidScore("modify", "The specific score does not exist");
        }
        entity.setScore(score.get�÷�());
        scoreRepository.save(entity);
        return queryGrade(score.getѧ��());
    }

    public void addGrade(Holder<�γ̳ɼ��б�����> parameters) throws InvalidCourseId, InvalidScore, InvalidStudentId {

        �γ̳ɼ��б����� list = parameters.value;
        if (list.get�γ̳ɼ�().size() == 0) {
            throw new InvalidScore("add", "There isnot any score");
        }
        String courseID = list.get�γ̳ɼ�().get(0).get�γ̱��();
        String courseType = list.get�γ̳ɼ�().get(0).get�ɼ�����().name();
        String studentId = list.get�γ̳ɼ�().get(0).get�ɼ�().get(0).getѧ��();
        List<ScoreEntity> result = list.get�γ̳ɼ�().stream().map(score-> new ScoreEntity(studentId, courseID, courseType, score.get�ɼ�().get(0).get�÷�())).collect(Collectors.toList());
        scoreRepository.save(result);
    }

    public �γ̳ɼ��б����� deleteGrade(ѧ�ſγ̺����� parameters) throws InvalidCourseId, InvalidStudentId {
        //TODO �쳣���

        List<ScoreEntity> entity = scoreRepository.findByStudentIdAndCourseId(parameters.getѧ��(), parameters.get�γ̱��());

        if (entity == null || entity.isEmpty()) {
            throw new InvalidStudentId("modify", "The specific score does not exist");
        }
        scoreRepository.delete(entity);
        return queryGrade(parameters.getѧ��());
    }

    @Override
    public �γ̳ɼ��б����� sortGrade(�������� parameters) throws InvalidCourseId, InvalidStudentId {
        �γ̳ɼ��б����� result = queryGrade(parameters.getѧ��());
        int factor = parameters.get����ʽ() == ����ʽ����.�ӵ͵��� ? 1 : -1;
        result.get�γ̳ɼ�().sort((score1, score2) -> factor * Integer.compare(score1.get�ɼ�().get(0).get�÷�(), score2.get�ɼ�().get(0).get�÷�()));
        return result;
    }


}
