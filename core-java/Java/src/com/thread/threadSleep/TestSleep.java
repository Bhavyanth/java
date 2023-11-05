package com.thread.threadSleep;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TestSleep {
	public static void main(String argvs[]) {

		try {
			for (int j = 0; j < 5; j++) {

				// The main thread sleeps for the 1000 milliseconds, which is 1 sec
				// whenever the loop runs
				Thread.sleep(1000);

				// displaying the value of the variable
				DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
				LocalDateTime now = LocalDateTime.now();
				System.out.println(dtf.format(now));
				System.out.println(j);
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
