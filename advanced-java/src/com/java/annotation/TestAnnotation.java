package com.java.annotation;

import java.lang.reflect.Method;

public class TestAnnotation {

    @CustomAnnotation(value = 45)
    public void test(){
        System.out.println("Invoked custom annotation");
    }

    public static void main(String[] args) throws Exception {
        TestAnnotation annotation = new TestAnnotation();
        Method method = annotation.getClass().getMethod("test"); // getting the method based on reflection API.

        CustomAnnotation customAnnotation = method.getAnnotation(CustomAnnotation.class);
        System.out.println(customAnnotation.value());

    }
}
