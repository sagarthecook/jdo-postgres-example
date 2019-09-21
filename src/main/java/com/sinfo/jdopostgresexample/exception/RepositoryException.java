package com.sinfo.jdopostgresexample.exception;

/**
 * @author sagar
 *
 */
public class RepositoryException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 724316510050246439L;

	public RepositoryException(String message, Exception e) {
		super(message, e);
	}
}
