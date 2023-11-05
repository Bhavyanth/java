package com.java.collections;

import java.util.*;

public class Maps {
	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {

		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "BMW"); // Adding elements
		map.put(2, "Audi");
		map.put(3, "Pagani");
		map.put(4, "Lambo");
		//for(map.Entry m:)
//
//		// Comparing By Key
//		// returns a Set view of the mappings contained in this map
		//map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);}}
//     Sort in reverse order

		int c = 10;
		System.out.println(c/0);
		map.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.reverseOrder())).forEach(System.out::println);


	}}


