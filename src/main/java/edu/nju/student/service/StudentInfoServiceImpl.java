package edu.nju.student.service;

import edu.nju.student.dao.DepartmentRepository;
import edu.nju.student.dao.ScoreRepository;
import edu.nju.student.dao.StudentRepository;
import edu.nju.student.exception.DataFormatError;
import edu.nju.student.exception.ErrorPassword;
import edu.nju.student.exception.InvalidStudentId;
import edu.nju.student.model.*;
import edu.nju.student.my_enum.�꼶����;
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


    public void addInfo(Holder<ѧ����Ϣ> parameters) throws DataFormatError {
        ѧ����Ϣ student = parameters.value;
        StudentEntity studentEntity = new StudentEntity(student);
        studentRepository.save(studentEntity);
        List<ScoreEntity> scoreEntities = student.get�γ̳ɼ��б�().get�γ̳ɼ�().stream().map(score -> new ScoreEntity(student.getѧ��(), score.get�γ̱��(), score.get�ɼ�����().name(), score.get�ɼ�().get(0).get�÷�())).collect(Collectors.toList());
        scoreRepository.save(scoreEntities);
    }

    public void modifyInfo(Holder<ѧ����Ϣ> parameters) throws DataFormatError {
        ѧ����Ϣ student = parameters.value;

        try {
            ѧ������ idType = new ѧ������();
            deleteInfo(idType);
            addInfo(parameters);
        } catch (InvalidStudentId invalidStudentId) {
            //TODO   DO Nothing, student id should always exists
        }


    }

    public ѧ����Ϣ queryInfo(String parameters) throws InvalidStudentId {
        StudentEntity entity = studentRepository.findByStudentId(parameters);

        if (entity == null) {
            throw new InvalidStudentId("Student ID not exists","pStudent ID not exists");
        }

        �꼶���� yearType = �꼶����.fromValue(entity.getGrade());

        ������Ϣ���� personType = new ������Ϣ����(entity, departmentRepository.findByDptId(entity.getDepartmentId()));

        List<ScoreEntity > scoreEntities = scoreRepository.findByStudentId(entity.getStudentId() );

        �γ̳ɼ��б����� courseList = new �γ̳ɼ��б�����(scoreEntities);

        return new ѧ����Ϣ(yearType, personType, courseList, parameters);
    }

    public ѧ����Ϣ deleteInfo(ѧ������ parameters) throws InvalidStudentId {
        // �������쳣����id�����ڣ�ִ��queryinfoʱ�����׳��쳣
        String id = parameters.getѧ��();
        ѧ����Ϣ result = queryInfo(id);

        scoreRepository.deleteAllByStudentId(id);
        studentRepository.deleteByStudentId(id);

        return result;

    }
}
