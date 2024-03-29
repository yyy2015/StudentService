
package edu.nju.student.service;

import edu.nju.student.exception.DataFormatError;
import edu.nju.student.exception.InvalidStudentId;
import edu.nju.student.model.学号类型;
import edu.nju.student.model.学生信息;
import edu.nju.student.utils.ObjectFactory;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.Holder;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "StudentInfoService", targetNamespace = "http://jw.nju.edu.cn/wsdl")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface StudentInfoService {


    /**
     * 添加学生信息操作
     * 
     * @param parameters
     * @throws DataFormatError
     */
    @WebMethod
    @Action(input = "http://localhost:8080/cxf/studentInfoService/addInfoRequest", output = "http://localhost:8080/cxf/studentInfoService/addInfoResponse")
    public void addInfo(
        @WebParam(name = "\u5b66\u751f", targetNamespace = "http://jw.nju.edu.cn/schema", mode = WebParam.Mode.INOUT, partName = "parameters")
        Holder<学生信息> parameters)
        throws DataFormatError
    ;

    /**
     * 修改学生信息操作
     * 
     * @param parameters
     * @throws DataFormatError
     */
    @WebMethod
    @Action(input = "http://localhost:8080/cxf/studentInfoService/modifyInfoRequest", output = "http://localhost:8080/cxf/studentInfoService/modifyInfoResponse")
    public void modifyInfo(
        @WebParam(name = "\u5b66\u751f", targetNamespace = "http://jw.nju.edu.cn/schema", mode = WebParam.Mode.INOUT, partName = "parameters")
        Holder<学生信息> parameters)
        throws DataFormatError
    ;

    /**
     * 查询学生信息操作
     * 
     * @param parameters
     * @return
     *     returns edu.nju.student.controller.学生信息
     * @throws InvalidStudentId
     */
    @WebMethod
    @WebResult(name = "\u5b66\u751f", targetNamespace = "http://jw.nju.edu.cn/schema", partName = "parameters")
    public 学生信息 queryInfo(
        @WebParam(name = "\u5b66\u53f7", targetNamespace = "http://jw.nju.edu.cn/schema", partName = "parameters")
        String parameters)
        throws InvalidStudentId
    ;

    /**
     * 删除学生信息操作
     * 
     * @param parameters
     * @return
     *     returns edu.nju.student.controller.学生信息
     * @throws InvalidStudentId
     */
    @WebMethod
    @WebResult(name = "\u5b66\u751f", targetNamespace = "http://jw.nju.edu.cn/schema", partName = "parameters")
    public 学生信息 deleteInfo(
        @WebParam(name = "学号类型", targetNamespace = "http://jw.nju.edu.cn/schema", partName = "parameters")
                学号类型 parameters)
        throws InvalidStudentId
    ;

}
