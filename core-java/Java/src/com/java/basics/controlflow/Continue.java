package com.java.basics.controlflow;

/**
 * This class is for continue statement concept
 * @author bhavyanth
 *
 */
public class Continue {
	
	/*
	 * This is a main method to execute continue statement
	 */
	public static void main(String[] args) {
		
		
		for (int i = 1; i <= 10; i++) {
			if (i == 8) {
				// using continue statement
				continue; // it will skip and continues the flow
			}
			System.out.println(i);
		}

	}
}
