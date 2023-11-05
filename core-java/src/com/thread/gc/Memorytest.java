package com.thread.gc;

public class Memorytest {
	
	static void bhavyanth() {
		System.out.println("bhavyanth");
	}
	
	void bharath() {
		System.out.println("bharath");
	}
	
	public static void main(String args[]) throws Exception {
		Memorytest memorytest = new Memorytest();
		memorytest.bharath();
		bhavyanth();
		Runtime r = Runtime.getRuntime();
		System.out.println("Total Memory: " + r.totalMemory());
		System.out.println("Free Memory: " + r.freeMemory());

		for (int i = 0; i < 100000; i++) {
			new Memorytest();
		}
		System.out.println("After creating 100000 instance, Free Memory: " + r.freeMemory());
		System.gc();
		System.out.println("After gc(), Free Memory: " + r.freeMemory());
	}
}
