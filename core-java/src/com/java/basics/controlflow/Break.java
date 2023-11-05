package com.java.basics.controlflow;

public class Break {
	public static void main(String[] args) {
		
		
		for (int i = 1; i <= 10; i++) {
			if (i == 7) {
				break;
			}
			System.out.println(i);
		}

		// break statement in inner loop
//		for (int i = 1; i <= 3; i++) {
//			// inner loop
//			for (int j = 1; j <= 3; j++) {
//				if (i == 2 && j == 2) {
//					break;
//				}
//				System.out.println(i + " " + j);
//			}
//		}
	}
}
