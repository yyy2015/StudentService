package edu.nju.student.service;

import edu.nju.student.dao.DepartmentRepository;
import edu.nju.student.dao.ScoreRepository;
import edu.nju.student.dao.StudentRepository;
import edu.nju.student.exception.ErrorPassword;
import edu.nju.student.exception.InvalidStudentId;
import edu.nju.student.model.*;
import edu.nju.student.my_enum.�꼶����;
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

        String studentId = parameters.getѧ��();
        String password = parameters.get����();

        StudentEntity entity = studentRepository.findByStudentIdAndPassword(studentId, password);

        if (entity == null) {
            throw new ErrorPassword("login","password or account is invalid");
        }

        �꼶���� yearType = �꼶����.fromValue(entity.getGrade());

        ������Ϣ���� personType = new ������Ϣ����(entity, departmentRepository.findByDptId(entity.getDepartmentId()));

        List<ScoreEntity > scoreEntities = scoreRepository.findByStudentId(entity.getStudentId() );

        �γ̳ɼ��б����� courseList = new �γ̳ɼ��б�����(scoreEntities);
//        courseList.get�γ̳ɼ�().addA



        return null;
    }
}
