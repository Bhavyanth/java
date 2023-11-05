package com.java.collections;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedLists {
	public static void main(String args[]) {
		
		LinkedList<String> al = new LinkedList<String>();
		System.out.println("Initial list of elements "+ al);
		al.add("Bmw");
		al.add("Mercedes");
		al.add("Audi");
		al.add("Ferrari");
//		Iterator<String> itr = al.iterator();
//		while (itr.hasNext()) {
//			System.out.println(itr.next());
//		}
		
//		// Adding element at specific position
//		al.add(2,"RollsRoyce");
//		System.out.println("List after adding RR at pos 2 " + al );
//		
//		// Adding elements to linked list
		LinkedList<String> al1 = new LinkedList<String>();
		al1.add("MiniCooper");
		al1.add("Volkswagen");
		al.addAll(al1); // Added list 2 to list 1
		System.out.println("List after adding elements "+ al);
//		
//		LinkedList<String> al2 = new LinkedList<String>();
//		al2.add("McLaren");
//		al2.add("Bugatti");
//		al.addAll(1,al2);
//		System.out.println("List after adding elements at specific position "+ al);
//		
		al.addFirst("Lamborgini");
		System.out.println("Added first element to list "+ al);
//		
		al.addLast("Pagani");
		System.out.println("Added last element to list "+ al);
	}
}
