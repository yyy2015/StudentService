package edu.nju.student.exception;

/**
 * Created by yyy on 2017/6/15.
 */
public class EmailPwdException extends Exception {
    private String faultInfo;

    EmailPwdException(){
        super();
    }

    public EmailPwdException(String message, String faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    public EmailPwdException(String message, String faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    public String getFaultInfo() {
        return faultInfo;
    }
}
