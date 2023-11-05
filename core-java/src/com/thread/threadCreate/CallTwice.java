package com.thread.threadCreate;

public class CallTwice extends Thread{
	public void run() {
		System.out.println("running...");
	}

	public static void main(String args[]) {
		CallTwice t1 = new CallTwice();
//		t1.start();
//		t1.start();
		
	}
}
