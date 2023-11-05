package com.java.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Hashset {
	public static void main(String[] args) {
//		HashSet<String> set=new HashSet<String>();
//        set.add("Bmw");
//        set.add("Audi");
//        set.add("Pagani");
//        set.add("Bugatti");
//        set.add("Mercedes");
//        Iterator<String> i=set.iterator();
//        while(i.hasNext())
//        {
//        System.out.println(i.next());   // Prints unordered collection
//        }
//        
//        //  Ignoring duplicate elements
//        HashSet<String> set1=new HashSet<String>();
//        set1.add("Bmw");
//        set1.add("Audi");
//        set1.add("Pagani");
//        set1.add("Bugatti");
//        set1.add("Bugatti");
//        Iterator<String> it=set1.iterator();
//        while(it.hasNext())
//        {
//        System.out.println(it.next());   // Prints unordered collection
//        }
        
        // Removing elements in hashset
//        HashSet<String> set2=new HashSet<String>();
//        set2.add("Bmw");
//        set2.add("Audi");
//        set2.add("Pagani");
//        set2.add("Bugatti");
//        System.out.println("Set of cars "+ set2);
//        set2.remove("Pagani");
//        System.out.println("Set of cars after removing "+ set2);
//        HashSet<String> set3=new HashSet<String>();
//        set3.add("RollsRoyce");
//        set3.add("MiniCooper");
//        set2.addAll(set3);
//        System.out.println("Adding set "+ set2);
//        set2.removeAll(set3);
//        System.out.println("Removing new set "+ set2);
//
//        // Remove everything
//        set2.clear();
//        System.out.println("Empty set "+   set2);
//
//        // Adding list to HashSet
        ArrayList<String> list = new ArrayList<String>();
		list.add("BMW");
		list.add("MERCEDES");
		list.add("AUDI");
		list.add("FERARRI");
		HashSet<String> set = new HashSet<String>(list);
		set.add("PAGANI");
		Iterator<String> i=set.iterator();
        while(i.hasNext())
        {
        System.out.println(i.next());
        }
	}
}
