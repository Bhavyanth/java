package com.java.oops.abstraction;

public class CircleShape implements ShapeInterface{

	@Override
	public double area(int a) {
		return Math.PI * Math.pow(a, 2);
	}

}
