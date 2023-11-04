package com.java.generics;

import java.util.ArrayList;
import java.util.List;

public class NeedOfGeneric {

    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("Lion");
        String animal = (String) list.get(0); // Explicitly cast the result to string

        List<String> animalList = new ArrayList<>();
        list.add("Tiger");
        String animal2 = animalList.get(0);  // Works without casting
    }
}
