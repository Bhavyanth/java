package com.java.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Lists {
	public static void main(String args[]) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("BMW");
		list.add("MERCEDES");
		list.add("AUDI");
		list.add("FERARRI");
//		System.out.println(list);

//		// Convert array to list
//		String[] array = { "Bmw", "Audi", "Pagani",  "RollsRoyce", "Mercedes" };
//		System.out.println("Printing Array: " + Arrays.toString(array));
//		// Converting Array to List
//		List<String> list1 = new ArrayList<String>();
//		for (String lang : array) {
//			list1.add(lang);
//		}
//		System.out.println("Printing List: " + list1);
//
//		// Convert list to array
//		List<String> carList = new ArrayList<>();
//		carList.add("BMW");
//		carList.add("MERCEDES");
//		carList.add("AUDI");
//		carList.add("FERARRI");
//		// Converting ArrayList to Array
//		
//		String[] array1 = carList.toArray(new String[carList.size()]);
//		System.out.println("Printing Array: " + Arrays.toString(array1));
//		System.out.println("Printing List: " + carList);
//		
//		// Sorting lists
//		Collections.sort(list, Collections.reverseOrder());
//		System.out.println(list);
//		
//		// List Iterator Interface
//		
		
		ListIterator<String> lt = list.listIterator();
		System.out.println("Traversing in forward direction ");
		while(lt.hasNext()) {
			System.out.println(lt.next());
		}
		
		System.out.println("Traversing in reverse direction ");
		while(lt.hasPrevious()) {
			System.out.println(lt.previous());
		}
	}
}
