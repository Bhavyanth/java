package com.java.oops.abstraction;

public class TestShape {



	public static void main(String[] args) {

		Shape s1 = new Circle("Red", 20);
		Shape s2 = new Rectangle("Blue",10,20);
		System.out.println("Color of circle is "+ s1.toString() + " "+ " and area is "+ s1.area());
		System.out.println("Color of Rectangle is "+ s2.toString() + " "+ " and area is "+ s2.area());
		
	}
}
