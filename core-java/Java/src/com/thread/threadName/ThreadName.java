package com.thread.threadName;

public class ThreadName extends Thread {
	ThreadName(String threadName) {
		// invoking the constructor of
		// the superclass, which is Thread class.
		super(threadName);
	}

	// overriding the method run()
	public void run() {
		System.out.println(" The thread is executing....");
	}
}
