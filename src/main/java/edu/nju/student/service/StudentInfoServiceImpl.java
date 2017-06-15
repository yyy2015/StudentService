package edu.nju.student.service;

import edu.nju.student.exception.DataFormatError;
import edu.nju.student.exception.InvalidStudentId;
import edu.nju.student.model.学生信息;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.jws.WebService;
import javax.xml.ws.Holder;

/**
 * Created by yyy on 2017/6/15.
 */
@WebService(name = "StudentInfoService",endpointInterface = "edu.nju.student.service.StudentInfoService",
        targetNamespace = "http://jw.nju.edu.cn/wsdl")
@Service
@Transactional
public class StudentInfoServiceImpl implements StudentInfoService {

    public void addInfo(Holder<学生信息> parameters) throws DataFormatError {

    }

    public void modifyInfo(Holder<学生信息> parameters) throws DataFormatError {

    }

    public 学生信息 queryInfo(String parameters) throws InvalidStudentId {
        return null;
    }

    public 学生信息 deleteInfo(String parameters) throws InvalidStudentId {
        return null;
    }
}
