package edu.nju.student.exception;

/**
 * Created by yyy on 2017/6/14.
 */
public class ParamNullException extends Exception {

    private String faultInfo;

    ParamNullException(){
        super();
    }

    public ParamNullException(String message, String faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    public ParamNullException(String message, String faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    public String getFaultInfo() {
        return faultInfo;
    }
}
