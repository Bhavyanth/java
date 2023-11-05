package com.access.upAndDownCasting;

public class Main {
	public static void main(String[] args) {

	Parent p = new Parent();
	Child c = new Child();
	
	
	Parent pc = new Child(); // Upcasting 
	
	Child cp = (Child) new Parent(); //  downcasting
	pc.print();
	
	
	/**
	 * In Java, we cannot assign a parent class reference object to the child class, 
	 * but if we perform downcasting, we will not get any compile-time error. 
	 * When we run it, it throws the "ClassCastException".
	 */
//	Child cp = (Child) new Parent(); // Run time error
	//Exception in thread "main" java.lang.ClassCastException: class com.basics.upAndDownCasting.
	//Parent cannot be cast to class com.basics.upAndDownCasting.Child
	}
}
