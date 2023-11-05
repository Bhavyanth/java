package com.java.oops;

/**
 * Constructor
 * @author bhavyanth
 *
 */
public class Basic {
		
	static String name;
	static int age;
	
	// ALT + SHIFT + S -> TO create a constructor
	//Access modifier   methodName   (Parameter)
	
	public Basic(String name, int age) {
		// Method body
		this.name = name;
		this.age = age;
	}
				// Return type
	public static void main(String[] args) {
	//  Class object = initializing the class
		Basic basic = new Basic("Tetra", 10);
		System.out.println(name+" "+ age);
		
	}
	
}
