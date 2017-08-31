package com.cn.hnust.Exception;

public class CarException extends RuntimeException {

	/**
	 * ae
	 */
	private static final long serialVersionUID = 1L;
	
	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public CarException(String message) {
		super();
		this.message = message;
	}

}
