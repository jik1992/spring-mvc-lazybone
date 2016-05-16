package com.gxb.aop.ResponseJson;

import org.springframework.web.context.request.WebRequest;

public class ResponseDataWrapperBuilder {

	public static <T> ResponseDataWrapper<T> build(String apiName, T t) {
		return build(apiName, 1, null, t);
	}

	public static <T> ResponseDataWrapper<T> build(String apiName,
			Integer result, String message, T object) {
		return new ResponseDataWrapper<T>().setApi_name(apiName)
				.setData(object).setMessage(message).setResult(result);
	}

	public static ResponseDataWrapper<Object> build(WebRequest request,
			ErrorInfo errorInfo) {

		// 每个控制器的最后一个参数必须有一个参数为api_name
		String apiName = request.getParameter("api_name");
		
		return buildWithApiName(apiName, errorInfo);
	}
	
	public static ResponseDataWrapper<Object> buildWithApiName(String apiName,
			ErrorInfo errorInfo){
		Integer result = 2;
		if (errorInfo.getError() == ErrorInfo.ERROR_ARGUMENT) {
			result = 2;
		} else if (errorInfo.getError() == ErrorInfo.ERROR_ILLEGAL_ACCESS
				|| errorInfo.getError() == ErrorInfo.ERROR_ACCESS
				|| errorInfo.getError() == ErrorInfo.ERROR_SYSTEM) {
			result = 3;
		} else if (errorInfo.getError() == ErrorInfo.ERROR_LOGIN) {
			result = 8;
		} else if (errorInfo.getError() == ErrorInfo.ERROR_W2_INVALID){
			result = 12;
		}else {
			result = 4;
		}
		return build(apiName, result, errorInfo.getMessage(), new Object());
	}

	public static ResponseDataWrapper<Object> buildBatchError(
            WebRequest request, Object errorInfo) {
		// 每个控制器的最后一个参数必须有一个参数为api_name
		String apiName = request.getParameter("api_name");
		return buildBatchError(apiName, errorInfo);
	}

	public static ResponseDataWrapper<Object> buildBatchError(
			String apiName, Object errorInfo) {
		Integer result = 1;
		return build(apiName, result, "批处理订单部分出错", errorInfo).setSubCode(20001);
	}
}
