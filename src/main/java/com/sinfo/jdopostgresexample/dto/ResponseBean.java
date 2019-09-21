package com.sinfo.jdopostgresexample.dto;

/**
 * @author sagar 
 * THIS BEAN IS RETUEN IN REPOSNE
 */
public class ResponseBean {

	private Boolean status;
	private String msg;
	private Object response;

	public ResponseBean() {

	}

	public ResponseBean(Boolean status, String msg, Object response) {
		super();
		this.status = status;
		this.msg = msg;
		this.response = response;
	}

	public Boolean getStatus() {
		return status;
	}

	public String getMsg() {
		return msg;
	}

	public Object getResponse() {
		return response;
	}

}
