package com.java.exceptions;

public class UserDefinedException extends Exception {
	/**
	* 
	*/
	private static final long serialVersionUID = 1L;

	public UserDefinedException(String str) {

		super(str);
		System.out.println("This is my own exception");
	}
}