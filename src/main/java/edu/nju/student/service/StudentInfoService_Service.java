
package edu.nju.student.service;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "StudentInfoService", targetNamespace = "http://jw.nju.edu.cn/wsdl", wsdlLocation = "file:/D:/semester3_3/soa/assignment/assignment10/sourceCode/StudentService/src/main/resources/wsdl/StudentInfo.wsdl")
public class StudentInfoService_Service
    extends Service
{

    private final static URL STUDENTINFOSERVICE_WSDL_LOCATION;
    private final static WebServiceException STUDENTINFOSERVICE_EXCEPTION;
    private final static QName STUDENTINFOSERVICE_QNAME = new QName("http://jw.nju.edu.cn/wsdl", "StudentInfoService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("file:/D:/semester3_3/soa/assignment/assignment10/sourceCode/StudentService/src/main/resources/wsdl/StudentInfo.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        STUDENTINFOSERVICE_WSDL_LOCATION = url;
        STUDENTINFOSERVICE_EXCEPTION = e;
    }

    public StudentInfoService_Service() {
        super(__getWsdlLocation(), STUDENTINFOSERVICE_QNAME);
    }

    public StudentInfoService_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), STUDENTINFOSERVICE_QNAME, features);
    }

    public StudentInfoService_Service(URL wsdlLocation) {
        super(wsdlLocation, STUDENTINFOSERVICE_QNAME);
    }

    public StudentInfoService_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, STUDENTINFOSERVICE_QNAME, features);
    }

    public StudentInfoService_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public StudentInfoService_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns StudentInfoService
     */
    @WebEndpoint(name = "StudentInfoServiceImplPort")
    public StudentInfoService getStudentInfoServiceImplPort() {
        return super.getPort(new QName("http://jw.nju.edu.cn/wsdl", "StudentInfoServiceImplPort"), StudentInfoService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns StudentInfoService
     */
    @WebEndpoint(name = "StudentInfoServiceImplPort")
    public StudentInfoService getStudentInfoServiceImplPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://jw.nju.edu.cn/wsdl", "StudentInfoServiceImplPort"), StudentInfoService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (STUDENTINFOSERVICE_EXCEPTION!= null) {
            throw STUDENTINFOSERVICE_EXCEPTION;
        }
        return STUDENTINFOSERVICE_WSDL_LOCATION;
    }

}
