package com.cn.hnust.Exception;

public class BusinessException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public BusinessException(String message) {
		super();
		this.message = message;
	}
	
}
