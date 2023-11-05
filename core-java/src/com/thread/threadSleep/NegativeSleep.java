package com.thread.threadSleep;

public class NegativeSleep {
	public static void main(String argvs[]) {
		// we can also use throws keyword followed by
		// exception name for throwing the exception
		try {
			for (int j = 0; j < 5; j++) {

				// it throws the exception IllegalArgumentException
				// as the time is -ive which is -100
				Thread.sleep(-100);

				// displaying the variable's value
				System.out.println(j);
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
