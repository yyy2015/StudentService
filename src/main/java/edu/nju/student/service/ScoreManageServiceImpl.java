package edu.nju.student.service;

import edu.nju.student.exception.InvalidCourseId;
import edu.nju.student.exception.InvalidScore;
import edu.nju.student.exception.InvalidStudentId;
import edu.nju.student.model.ѧ�ſγ̺�����;
import edu.nju.student.model.�γ̳ɼ��б�����;
import edu.nju.student.model.�γ̳ɼ�����;
import edu.nju.student.my_enum.����ʽ����;
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

    public �γ̳ɼ��б����� queryGrade(String parameters) throws InvalidStudentId {
        return null;
    }

    public �γ̳ɼ��б����� modifyGrade(�γ̳ɼ����� parameters) throws InvalidCourseId, InvalidScore, InvalidStudentId {
        return null;
    }

    public void addGrade(Holder<�γ̳ɼ��б�����> parameters) throws InvalidCourseId, InvalidScore, InvalidStudentId {

    }

    public �γ̳ɼ��б����� deleteGrade(ѧ�ſγ̺����� parameters) throws InvalidCourseId, InvalidStudentId {
        return null;
    }

    public �γ̳ɼ��б����� sortGrade(����ʽ���� parameters) throws InvalidCourseId, InvalidStudentId {
        return null;
    }
}
