package com.access.upAndDownCasting;

public class DownChild extends DownParent {
	
	int age;

	// Performing overriding
	@Override
	void showMessage() {
		System.out.println("Child method is called");
	}
}
