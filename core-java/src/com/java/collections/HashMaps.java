package com.java.collections;

import java.util.HashMap;
import java.util.Map;

public class HashMaps {
	public static void main(String args[]) {
		HashMap<Integer, String> map = new HashMap<Integer, String>();// Creating HashMap
		map.put(1, "BMW"); // Adding elements
		map.put(2, "Audi");
		map.put(3, "Pagani");
		map.put(4, "Lambo");

		for (Map.Entry m : map.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
		
		HashMap<Integer, String> map1 = new HashMap<Integer, String>();
		map1.put(5, "Bugatti");
		map1.put(6, "Ferrari");
		
		map.putAll(map1);
		
		for (Map.Entry m : map.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
		
		// removing elements based in key
		map.remove(2);
		for (Map.Entry m : map.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
		
		map.remove(3, "Pagani");
		for (Map.Entry m : map.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
		
		// Replacing elements
		
		map.replace(5, "Pagani");
		
		for (Map.Entry m : map.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
		
	}
}
