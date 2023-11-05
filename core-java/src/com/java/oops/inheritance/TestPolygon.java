package com.java.oops.inheritance;

public class TestPolygon {
	
	public static void main(String[] args) {
		
		Rectangle rectangle = new Rectangle();
		rectangle.setValues(10, 20);
		System.out.println("Rectangle area "+rectangle.calArea());

		Triangle triangle = new Triangle();
		triangle.setValues(10, 20.25);
		System.out.println("Triangle area "+ triangle.calArea());

		Square square = new Square();
		square.setValues(10, 10);
		System.out.println("Square area "+ square.calArea());
		
	}
}
