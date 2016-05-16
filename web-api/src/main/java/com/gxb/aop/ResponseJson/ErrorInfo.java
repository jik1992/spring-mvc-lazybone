package com.gxb.aop.ResponseJson;


import java.io.Serializable;

/**
 * 错误信息
 *
 * @author JackyLIU
 */
public class ErrorInfo implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 466041048253332761L;

    /**
     * 系统错误的编码
     */
    public final static int ERROR_SYSTEM = 10000;

    /**
     * 参数错误
     */
    public final static int ERROR_ARGUMENT = 10001;

    /**
     * 用户登录错误
     */
    public final static int ERROR_LOGIN = 10002;

    /**
     * 非法访问，例如用户登录失效，或者会话没传
     */
    public final static int ERROR_ILLEGAL_ACCESS = 10003;

    /**
     * 非法操作
     */
    public final static int ERROR_ACCESS = 10004;

    /**
     * 空指针
     */
    public final static int ERROR_NULL = 10005;
    
    /**
     * 淘宝短授权失效错误码
     */
    public final static int ERROR_W2_INVALID = 10006;

    private Integer error;

    private String message;

    public ErrorInfo() {

    }

    public ErrorInfo(Integer errorCode, String message) {
        this.error = errorCode;
        this.message = message;
    }

    public Integer getError() {
        return error;
    }

    public void setError(Integer error) {
        this.error = error;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public static ErrorInfo buildSystemError(String msg) {
        if (msg == null || "".equals(msg.trim())) {
            return new ErrorInfo(ErrorInfo.ERROR_SYSTEM, "访问淘宝系统出错，请重新授权或联系客服！");
        }
        return new ErrorInfo(ErrorInfo.ERROR_SYSTEM, msg);
    }
    
    public static ErrorInfo buildTaobaoError(String msg){
    	if (msg == null || "".equals(msg.trim())) {
            return new ErrorInfo(ErrorInfo.ERROR_SYSTEM, "访问淘宝系统出错，请重新授权或联系客服！");
        }
    	// 淘宝短授权失效异常
    	if(msg.contains("w2-security-authorize-invalid")){
            return new ErrorInfo(ErrorInfo.ERROR_W2_INVALID, "淘宝短授权失效，请重新授权或联系客服！");
    	}
        return new ErrorInfo(ErrorInfo.ERROR_SYSTEM, msg);
    }
}
