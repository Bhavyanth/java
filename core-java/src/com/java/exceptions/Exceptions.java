package com.java.exceptions;

public class Exceptions {
	public static void main(String[] args) {
		 try{  
		      //code that may raise exception  
			 System.out.println("In try");
			 System.out.println("perform operation");
		      int data=100/0;  
		      System.out.println(data);
		      
		   }
		 	catch(ArithmeticException e){
		
			 System.out.println("Printing exception "+e);
			 
		}  
		   System.out.println("Code continuation");  
	}
	
	
//	public static void main(String[] args) {
////		String s = null;
////		System.out.println(s.hashCode());
////		null.something will cause a null pointer exception
//		
////		String s1="abc";  
////		int i=Integer.parseInt(s1);//NumberFormatException
////		
////		int a[]=new int[5];  
////		a[10]=50; //ArrayIndexOutOfBoundsException  
//		
//	}
}
