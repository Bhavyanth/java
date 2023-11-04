package com.java.synchronization;

public class TestSynchronization {

    public static void main(String[] args) {
        MathUtils mathUtils = new MathUtils();

        Thread1 thread1 = new Thread1(mathUtils);
        Thread thread2 = new Thread( new Thread2(mathUtils));
        thread1.start();
        thread2.start();

    }
}
