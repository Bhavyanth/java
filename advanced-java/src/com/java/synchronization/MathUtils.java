package com.java.synchronization;

import java.util.stream.IntStream;

public class MathUtils {
    // add and remove synchronized keyword and check outputs
   //synchronized
   void getMultiples(int n){
        synchronized (this) { // whoever has the object of MathUtils, will place a lock and execute - no concurrent access
            IntStream.range(1, 6).forEach(i -> System.out.println(n * i));
            try {
                Thread.sleep(500);
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }
}
