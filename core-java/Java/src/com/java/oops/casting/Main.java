package com.java.oops.casting;

public class Main {
	public static void main(String[] args) {

	Parent p = new Parent();
	Child c = new Child();
	Parent pc = new Child(); // upcasting
	
	Child cp = (Child) new Parent(); // Run time error
	//Exception in thread "main" java.lang.ClassCastException: class com.basics.upAndDownCasting.
	//Parent cannot be cast to class com.basics.upAndDownCasting.Child
	}
}
