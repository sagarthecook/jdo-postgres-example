package com.sinfo.jdopostgresexample.exception;

/**
 * @author sagar THIS EXCEPTION HABDLING FOR SERVICE LEVEL
 */
public class BusinessServiceException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String message;

	public BusinessServiceException(String message, Exception e) {
		super(message, e);
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

}
