package com.gxb.aop.ResponseJson;

import java.io.Serializable;

/**
 * 响应数据的封装
 * @author JackyLIU
 *
 */
public class ResponseDataWrapper<T> implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7119063314369403485L;

	private String api_name;
	
	private Integer result;
	
	private Integer subCode;
	
	private String message;
	
	private T data;

	public String getApi_name() {
		return api_name;
	}

	public ResponseDataWrapper<T> setApi_name(String api_name) {
		this.api_name = api_name;
		return this;
	}

	public Integer getResult() {
		return result;
	}

	public ResponseDataWrapper<T> setResult(Integer result) {
		this.result = result;
		return this;
	}

	public String getMessage() {
		return message;
	}

	public ResponseDataWrapper<T> setMessage(String message) {
		this.message = message;
		return this;
	}

	public T getData() {
		return data;
	}

	public ResponseDataWrapper<T> setData(T data) {
		this.data = data;
		return this;
	}

	public Integer getSubCode() {
		return subCode;
	}

	public ResponseDataWrapper<T> setSubCode(Integer subCode) {
		this.subCode = subCode;
		return this;
	}
}
