package com.thread.threadCreate;

public class CustomThread {
	public static void main(String argvs[]) {
		// creating an object of the Thread class using the constructor Thread(String
		// name)
		// String name = select * from schema.tableName where name = "";
		Thread t = new Thread("");
		System.out.println(t.getState());
		// the start() method moves the thread to the active state
		t.start();
		System.out.println(t.getState());
		// getting the thread name by invoking the getName() method
		String str = t.getName();
		System.out.println(str);
	}
}
