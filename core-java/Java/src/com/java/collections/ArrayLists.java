package com.java.collections;

import java.util.*;

public class ArrayLists {
	public static void main(String args[]) {
		// CTRL + / -> to comment or uncomment
		// CTRL + D -> To delete entire line

		ArrayList<String> list = new ArrayList<String>();

		list.add("BMW");
		list.add("MERCEDES");
		list.add("AUDI");
		list.add("FERARRI");

		list.remove("BMW");



//		System.out.println(list); // It will print list of objects
		
		// One way of printing the elements
//		Iterator<String> iterator = list.iterator();
//		while(iterator.hasNext()) {
//			System.out.println(iterator.next());
//		}

		// Enhanced for loop -> fore + CTRL + SPACE
//		for (String string : list) {
//			System.out.println(string);
//		}
//
//		// GET element from array
//		System.out.println("Getting an element from array " + list.get(3));
//
//		// SET element in array
//		System.out.println("Setting element in array " + list.set(3, "BUGATTI"));
//		list.add(4, "PAGANI");
//		System.out.println("List " + list);
//
//		// Sorting elements
		Collections.sort(list, Collections.reverseOrder());
		// To sort in reverse order
//		Collections.sort(list,Collections.reverseOrder());
		//System.out.println(list);
//
//		List<Integer> numList = new ArrayList<Integer>();
//		numList.add(55);
//		numList.add(68);
//		numList.add(95);
//		numList.add(12);
//		// Sorting the list
//		Collections.sort(numList, Collections.reverseOrder());
//		for (Integer n : numList)
//			System.out.println(n);
	}
}
