package com.java.arrays;

public class OneDArray {
	/**
	 * Array is a reference data type
	 * Store multiple elements with same kind of data type
	 *
	 * 3 ways of declaring an array
	 *
	 * data_type[] var_name = { , , , };
	 * data_type[] var_name = new data_type[3];
	 * data_type[] var_name = new data_type[]{ , , , };
	 *
	 * int a[], c  -> a is array & c is variable
	 * int []b,x   -> both are array variables
	 * 
	 * Syntax to declare arrays
	 * dataType[] arr;  int[] a = {};
	 * dataType []arr;   int []a = {};
	 * dataType arr[];  int a[] = {};
	 * 
	 */
	
	 // Declaration of arrays in different ways
   
	
//	public static void main(String[] args) {
//		 	int [] arr = {1,2,3,4,5,6,7}; //size is based on values given
//			int [] arr1 = new int[3]; // size initialized to default value in heap
//			int [] arr2 = new int[]{1,2,3,4,5}; // size is based on values given
//
//			System.out.println(arr1.length);
//	}
	
	//Java Program to illustrate how to declare, instantiate, initialize  
	
//	public static void main(String[] args) {
//
//		int a[] = new int[5];// declaration and instantiation (new)
//		a[0] = 10;// initialization
//		a[1] = 20;
//		a[2] = 70;
//		a[3] = 40;
//		a[4] = 50;
//		// traversing array
//		for (int i = 0; i < a.length; i++)// length is the property of array
//			System.out.println(a[i]);
//	}
	
	//Java Program to illustrate the use of declaration, instantiation   
	//and initialization of Java array in a single line  
//	public static void main(String args[]){
//		int a[]={33,3,4,5};//declaration, instantiation and initialization
//		//printing array
//		for(int i=0;i<a.length;i++)//length is the property of array
//		System.out.println(a[i]);
//	}
	
	
// public static void main(String[] args) {
//	int [] arr = {77,35,48,93,27}; // index starts from 0
//	System.out.println(arr[2]);
//
//	//To print all values of unknown array size
//	int i =0;
//	while(i < arr.length){
//		System.out.println(arr[i]);
//		i++;
//	}
//}

//public static void main(String[] args) {
//	String names[] = new String[3];
//	names[0] = new String("Tom");
//	System.out.println(names[0]);
//	names[1]= "Alex";
//	names[0] = new String("Teena");
//	names[2] = "Job";
//
//	for (String string : names) {
//		System.out.println(string);
//	}
//}

//public static void main(String[] args) {
//	int a[] = new int [5];
//	System.out.println("Enter numbers");
//	Scanner scanner = new Scanner(System.in);
//	for(int i=0;i<a.length;i++)
//		a[i]=scanner.nextInt();
//	for(int i=0;i<a.length;i++)
//		System.out.println(i+1 + " number is: "+a[i]);
//	int sum = 0;
//	for(int x : a)
//		sum = sum + x;
//		System.out.println("Sum is: "+ sum);
//		scanner.close();
//}

/**
 * if printing array index is greater than length of array then
 * java.lang.ArrayIndexOutOfBoundsException is thrown
 */
}
