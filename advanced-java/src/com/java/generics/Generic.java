package com.java.generics;

public class Generic<T> {
 // T is any type
    T object;

    Generic(T object){
        this.object = object;
    }

    public T getObject(){
        return this.object;
    }

    public static void main(String[] args) {
        Generic<Integer> integerGeneric = new Generic<>(45);
        System.out.println(integerGeneric.getObject());

        Generic<String> stringGeneric = new Generic<>("Royal Bengal");
        System.out.println(stringGeneric.getObject());
    }
}
