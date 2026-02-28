package com.test.exceptions;

public class CustomerBadRequestException extends RuntimeException{

	private static final long serialVersionUID = 1L;

	public CustomerBadRequestException(String msg) {
		super(msg);
	}

}
