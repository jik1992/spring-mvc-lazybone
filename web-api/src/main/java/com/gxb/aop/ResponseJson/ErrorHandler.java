package com.gxb.aop.ResponseJson;

import org.springframework.dao.DataAccessException;
import org.springframework.web.bind.annotation.ControllerAdvice;

import java.io.UnsupportedEncodingException;

/**
 * 异常处理拦截器，使用了{@link ControllerAdvice}注解
 *
 * @author JackyLIU
 */
//@ControllerAdvice
public class ErrorHandler {


    /*public Object errorResponse(WebRequest request, Exception e) {
        String apiName = request.getParameter("api_name");
        return errorResponse(apiName, e);
    }*/

  public Object errorResponse(String apiName, Exception e) throws UnsupportedEncodingException {
    if (apiName != null && (apiName.contains("wlb_") || apiName.contains("pt_") || apiName.contains("_express"))) {
      if (!(e instanceof SessionException)) {
        e.printStackTrace();
      }
    }
    if (e instanceof DataAccessException) {
      return ResponseDataWrapperBuilder.buildWithApiName(apiName, ErrorInfo.buildSystemError(e.getMessage()));
    } else if (e instanceof SessionException) {
      ErrorInfo errorInfo = new ErrorInfo();
      errorInfo.setError(ErrorInfo.ERROR_LOGIN);
      errorInfo.setMessage(e.getMessage());
      return ResponseDataWrapperBuilder.buildWithApiName(apiName, errorInfo);
    }



    return ResponseDataWrapperBuilder.buildWithApiName(apiName, ErrorInfo.buildSystemError(e.getMessage()));
  }


}
