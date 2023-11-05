package com.java.arrays;

public class AnonymousArray {
	
	static void printArray(int arr[]) {
		for (int i = 0; i < arr.length; i++)
			System.out.println(arr[i]);
	}

	// you don't need to declare the array while passing an array to the method

	public static void main(String args[]) {
		printArray(new int[] { 10, 22, 44, 66 });// passing anonymous array to method

		//  methodName(new arr[]{1,2,3,67});
		
		/*
		 * The method printArray(int[]) in the type AnonymousArray is not applicable for the arguments (Class<int[]>)
		 */
	}
}
