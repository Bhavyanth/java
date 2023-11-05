package com.thread.threadCreate;

public class MultiRun implements Runnable {
//	public void run() {
//		System.out.println("Runnable thread is running");
//	}

	public static void main(String args[]) {
		MultiRun m1 = new MultiRun();
		Thread t1 = new Thread(m1); // Using the constructor Thread(Runnable r)
		t1.start();
	}

	@Override
	public void run() {
		System.out.println("My thread");
		
	}
}
