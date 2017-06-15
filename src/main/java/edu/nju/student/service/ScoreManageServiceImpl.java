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
import java.util.List;

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
        if (!studentRepository.existsStudentId(parameters))
            throw new InvalidStudentId("login", "studentId is invalid");

        List<ScoreEntity> scoreEntities = scoreRepository.findByStudentId(parameters);

        return new �γ̳ɼ��б�����(scoreEntities);


    }

    public �γ̳ɼ��б����� modifyGrade(�γ̳ɼ����� parameters) throws InvalidCourseId, InvalidScore, InvalidStudentId {
        //TODO �쳣���
        �ɼ����� score = parameters.get�ɼ�().get(0);
        ScoreEntity entity = scoreRepository.findByStudentIdAndCourseIdAndScoreAttr(score.getѧ��(), parameters.get�γ̱��(), parameters.get�ɼ�����().name();

        if (entity == null ) {
            throw new InvalidScore("modify", "The specific score does not exist");
        }
        entity.setScore(score.get�÷�());
        scoreRepository.save(entity);
        return queryGrade(score.getѧ��());
    }

    public void addGrade(Holder<�γ̳ɼ��б�����> parameters) throws InvalidCourseId, InvalidScore, InvalidStudentId {


    }

    public �γ̳ɼ��б����� deleteGrade(ѧ�ſγ̺����� parameters) throws InvalidCourseId, InvalidStudentId {
//        parameters.
        return null;
    }

    public �γ̳ɼ��б����� sortGrade(����ʽ���� parameters) throws InvalidCourseId, InvalidStudentId {
//        �γ̳ɼ��б����� result = queryGrade(pa)


        return null;
    }
}
