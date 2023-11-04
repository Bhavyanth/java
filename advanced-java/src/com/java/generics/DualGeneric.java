package com.java.generics;

public class DualGeneric<T,U> {

    // Example of HashMap<> -> this has 2 generic types key and a value
    T object1;
    U object2;

    public DualGeneric(T object1, U object2) {
        this.object1 = object1;
        this.object2 = object2;
    }

    public void display(){
        System.out.println(object1);
        System.out.println(object2);
    }

    public static void main(String[] args) {
        DualGeneric<String, Integer> dualGeneric = new DualGeneric<>("Sumatran", 14);
        dualGeneric.display();
    }
}
