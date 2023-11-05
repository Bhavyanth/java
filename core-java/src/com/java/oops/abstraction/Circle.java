package com.java.oops.abstraction;

// User 2
public class Circle extends Shape{
	
	double radius;
	
	public Circle(String color, double radius) {
		super(color);
		System.out.println("This is a circle constructor");
		this.radius = radius;
	}

	@Override
	double area() {
		return Math.PI * Math.pow(radius, 2);
	}

	@Override
	public String toString() {
		return "Color is "+ super.color;
	}
	
	
}
