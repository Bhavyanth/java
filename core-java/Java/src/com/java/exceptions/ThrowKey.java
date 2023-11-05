package com.java.exceptions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ThrowKey {
	/*
	 * The Java throw keyword is used to throw an exception explicitly.
	 * We specify the exception object which is to be thrown. The Exception has some message with it that provides the 
	 * error description. 
	 * These exceptions may be related to user inputs, server, etc.
	 */
	
	public static void method() throws FileNotFoundException {
		FileReader file = new FileReader("C:\\Users\\Bhavyanth\\Desktop\\abc.txt");
		BufferedReader fileInput = new BufferedReader(file);
		throw new FileNotFoundException();

	}

	// main method
	public static void main(String args[]) {
		try {
			method();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println("rest of the code...");
	}
}
