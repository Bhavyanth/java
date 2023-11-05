package com.java.exceptions;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

import java.util.Objects;

public class Finally {
	/*
	 * Java finally block is a block used to execute important code such as closing the connection, etc.
	 */
	
	public static void main(String args[]) {
		Path path1 = Paths.get("C:\\Bhavyanth\\Source Code\\phoenix-graphic\\server\\index.js");
		Path path2 = Paths.get("");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter string");
		String input = scanner.next();
		System.out.println("String entered is "+input);
		BufferedReader in;
		BufferedWriter out = null;
		try {
			// below code do not throw any exception
			in = Files.newBufferedReader(path1); // passing as an argument
			out = Files.newBufferedWriter(path2);
			int data = 25 / 5;
			System.out.println(data);
		}
		// catch won't be executed
		catch (NullPointerException e) {
			System.out.println(e);
		}
		catch (IOException e){

		}
		// executed regardless of exception occurred or not
		finally {
				scanner.close();
				System.out.println("finally block is always executed");
		}

		System.out.println("rest of the code...");
	} 
	
//	public static void main(String args[]) {
//
//		try {
//
//			System.out.println("Inside the try block");
//
//			// below code throws divide by zero exception
//			int data = 25 / 0;
//			System.out.println(data);
//		}
//		// cannot handle Arithmetic type exception
//		// can only accept Null Pointer type exception
//		catch (NullPointerException e) {
//			System.out.println(e);
//		}
//
//		// executes regardless of exception occurred or not
//		finally {
//			System.out.println("finally block is always executed");
//		}
//
//		System.out.println("rest of the code...");
//	} 
}
