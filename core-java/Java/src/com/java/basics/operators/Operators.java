package com.java.basics.operators;

public class Operators {

	public static void main(String args[]) {
		
		// UNARY OPERATORS
		int x = 10; // x -> 10
		// x+1 -> 11 
		// -> x
		//   x = x +1
		//   10 = 10 + 1; -> x++
		//   x = 11;
		//   ++x
		//   11 = 11 + 1;
//		System.out.println(x++);// Current x value is 10 but it is incremented
//		// x -> 11 + 1 = 12
//		System.out.println(++x);// Current x value is 11 and now incremented to 1
//		// x = 12
//		// 12 = 12-1
//		System.out.println(x--);// Current x value is 12 and will be decremented by 1 
//		// 11 = 11 - 1  - 10
//		System.out.println(--x);// Current x value is 11 and will be decremented by 1
//		
//		int a=10;  
//		int b=10;          // 10 = 10 +1  -> 11 + 1 = 12
//		System.out.println(a++ + ++a);//10+12=22  
//						// 10 = 10 + 1 -> 11 + 1 = 12
//		System.out.println(b++ + b++);//10+11=21
//		
//		int p=10; //  -10 - 1 = -11 
//		int q=-10;  // 10 - 1 = 9
//		boolean c=true;  
//		boolean d=false;  
//		System.out.println(~p);//-11 (minus of total positive value which starts from 0)  // ~ tild
//		   
////		 bitwise compliment  -> ~	
////		 ~0010= 1101 = -3  
//		
//		System.out.println("~p = " + (~p));   
//		
//		System.out.println("Q -> "+~q);//9 (positive of total minus, positive starts from 0)  // negation
//		
//		System.out.println("C -> " +!c);//false (opposite of boolean value)  
//		
//		System.out.println("D -> " + !d);//true 

		
		// ARITHMETIC OPERATORS
//		int a=10;  
//		int b=5;  
//		System.out.println(a+b);//15  
//		System.out.println(a-b);//5  
//		System.out.println(a*b);//50   astriek
//		System.out.println(a/b);//2  // Returns the quotient
//		System.out.println(a%b);//0  // Modulus symbol - Returns the reminder
		
		// LOGICAL OPERATORS - Logical && and Bitwise &
		// AND
//		int a=10;  
//		int b=5;  
//		int c=20;  
//		System.out.println(a<b && a<c);//false && true = false  
//		System.out.println(a<b & a<c);//false & true = false  
//		
//		int x = 9, y = 8;
//		// 8421
//		// 1001 -> 1000
//		// bitwise AND 1001 & 1000 = 1000 = 8  
//		System.out.println("x & y = " + (x & y));  
//

		
		
		// LOGICAL || and Bitwise |
		/*
		 * The logical || operator doesn't check the second condition if the first condition is true. 
		 * It checks the second condition only if the first one is false.
		 */
		// OR
//		int a=10;  
//		int b=5;  
//		int c=20;  
//		System.out.println(a>b || a<c);//true || true = true  
//		
//		int x = 9, y = 8;   
//		// bitwise OR   
//		// 1001 ^ 1000 = 0001 = 1  
//		System.out.println("x ^ y = " + (x ^ y));   
		
		//TERNARY OPERATOR
		/*
		 * Java Ternary operator is used as one line replacement for if-then-else statement and used a lot in Java programming. 
		 * It is the only conditional operator which takes three operands.
		 */
		
//		int a=2;  
//		int b=5;  
//		int min =(a<b)?a:b;  // (condition)? yes : no
//		
//		int m = (a>b) ? a : b;
//		
//		System.out.println(m);  
	
		
		// ASSIGNMENT OPERATOR
		
		/*
		 * Java assignment operator is one of the most common operators. 
		 * It is used to assign the value on its right to the operand on its left.
		 */
//		
		int a=10;  
		int b=20;  
		//a+=4; // ~ to a = a+4;
		
		a+=4;//a=a+4 (a=10+4) 
		b-=4;//b=b-4 (b=20-4)  
		System.out.println(a);  
		System.out.println(b); 
		
		
	}
}
