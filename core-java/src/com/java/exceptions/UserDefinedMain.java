package com.java.exceptions;

public class UserDefinedMain {
	public static void main(String args[]) {
		try {
			// Custom logic
			throw new UserDefinedException("This is user-defined exception");
		} catch (UserDefinedException ude) {
			System.out.println("Caught the exception");
			// Print the message from MyException object
			System.out.println(ude.getMessage());
		}
	}

}
