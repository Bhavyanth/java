package com.java.oops.abstraction;

// Created by user 1
abstract class Shape {
	
	String color;
	
	// These are abstract methods -> do not have a method body 
	abstract double area();
	
	// Abstract classes can have constructor
	public Shape(String color) {
		System.out.println("This is shape constructor");
		this.color = color;
	}
	
	// They can also have concrete methods
	public String getColor() {
		return color;
	}

	public abstract String toString();
	
}
