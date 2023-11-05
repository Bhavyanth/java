package com.thread.threadCreate;

public class Multi extends Thread {
	public void run() {
		System.out.println("Multi thread is running.");
	}

	public static void main(String[] args) {
		Multi m = new Multi();
		m.start();
	}
	
//	public static void main(String args[]) {
//		Multi t1 = new Multi();
//		t1.start();
//	}
}
