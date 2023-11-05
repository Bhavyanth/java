package com.java.basics;

public class Variables {

	static int p = 10; // Static variable
	
	public static void main(String[] args) {

	/*
	 * variable:-  name used to store some values
	 * dataType variableName = value
	 */
	 
	 int x = 10; // Instance variables
	 int y = 30;
	 float f = x; // passing a lower size data type to higher size data type
	 
	 System.out.println(); // CTRL + Space (syso - to print)

	 System.out.println("Variable widening :: "+f);
	 System.out.println(x+y); 
	 System.out.println("Add method :: "+ add());
	}
	
	private static int add() {
		int x = 10; // local variables
		int y = 10;
		return x+y;
	}
	
	

}
