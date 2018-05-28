package com.mongodb.mon.exception;

public class AuditException extends Exception{
	String msg;

	/**
	 * @param msg
	 */
	public AuditException(String msg) {
		super();
		this.msg = msg;
	}

}
