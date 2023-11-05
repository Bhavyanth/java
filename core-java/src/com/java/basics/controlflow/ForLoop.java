package com.java.basics.controlflow;

public class ForLoop {
	public static void main(String[] args) {
		/**
		 * for (initialize ; expression ; increment)
		 */
		int[] arr = {77,35,48,93,27};
		
		System.out.println("Array length is :: "+ arr.length);
//		for(declare the index, run through the length, increment)
		for(int i = 0; i <= arr.length ; i++){
			System.out.println(arr[i]);
		}
		
//		for (int j : arr) { // for each loop
//			System.out.println(j);
//		}
	}
}
