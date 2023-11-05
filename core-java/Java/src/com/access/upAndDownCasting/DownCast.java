package com.access.upAndDownCasting;

public class DownCast {
	public static void main(String[] args) {
		DownParent p = new DownChild(); // upcasting
		p.name = "Tetra";

		// Child cp = (Child)new Parent(); // it gives run-time error

		// Performing Downcasting Explicitly
		
		DownChild c = (DownChild) p;
		c.age = 22;
		System.out.println(c.name);
		System.out.println(c.age);
		c.showMessage();
	}
}
