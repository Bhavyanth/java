package com.java.collections;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSets {
	public static void main(String args[]) {
		LinkedHashSet<String> set = new LinkedHashSet<String>();
		set.add("Bmw");
		set.add("Audi");
		set.add("Pagani");
		set.add("Bugatti");
		set.add("Mercedes");
		set.add("Pagani"); // Ignores duplicate elements
		Iterator<String> i = set.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}
		
		// removing element
		System.out.println("Removing element "+set.remove("Bmw"));
		System.out.println("Removing element "+set.remove("Lambo"));
	}
}
