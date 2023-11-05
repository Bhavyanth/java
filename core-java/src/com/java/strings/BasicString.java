package com.java.strings;

import com.sun.jmx.snmp.SnmpUnknownSubSystemException;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BasicString {
	public static void main(String[] args) {
		// Char array sequence
		char[] ch={'P','r','a','s','a'};
		String s = new String(ch);
//		System.out.println(s);

		String s1 = "Prasanna";
//		String s2 = "PRASANNA";
//		String s3 = new String("Prasanna");
//		System.out.println(s1.concat(" Sai"));
//		System.out.println(s1);
		
//		StringBuffer stringBuffer = new StringBuffer();
//		stringBuffer.append(2);
//		stringBuffer.append(" Prasanna");
//		System.out.println(stringBuffer.toString());

//		System.out.println(s1 == s2);
//		System.out.println(s1 == s3);
//		System.out.println(s1.equalsIgnoreCase(s2));

		
		//Strings can be declared in 2 ways 
		String string = "Hello World"; // declaring as a literal
		String s2 = new String("hello World"); // declaring as an object
		System.out.println("Length: "+string.length()); // gives length of string
		System.out.println("Char at: "+string.charAt(6)); // getting a particular character at index
		System.out.println("Equals: "+ string.equals(s2)); // comparing two strings
		System.out.println("IgnoreCase: "+string.equalsIgnoreCase("Hello world")); // ignore case
		System.out.println("Index: "+string.indexOf('e')); // position of a character
		System.out.println("Index of: "+string.indexOf("loW")); // index of string
		System.out.println("Concat: "+string.concat(" Java")); // concatenating a string
		System.out.println("Substr: "+string.substring(3)); // take a part of the string
		System.out.println("Substr at index: "+string.substring(3,6)); // print from 3rd position to 6th position (6 is excluded)
		System.out.println("Replace: "+string.replace('l', 'x')); // replaces l with x
		System.out.println("ReplaceAll: "+string.replaceAll("Hello", "d"));
		System.out.println("Replace at index: "+string.replace("ll", "xx")); // replaces ll with xx
		System.out.println("Lower case: "+string.toLowerCase()); // converts to lower case
		System.out.println("Upper case: "+string.toUpperCase()); // converts to upper case

		String s3 = "Sai Prasanna       ";
		System.out.println(s3);
		System.out.println("Trimmed "+  s3.trim());

		Pattern pattern = Pattern.compile("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&-+=()])(?=\\\\S+$).{8, 20}$");
		Matcher m = pattern.matcher("pras");
		System.out.println(m.matches());


	}
}
