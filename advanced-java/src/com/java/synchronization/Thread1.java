package com.java.synchronization;

public class Thread1 extends Thread{

    MathUtils mathUtils;

    public Thread1(MathUtils mathUtils){
        this.mathUtils = mathUtils;
    }

    public void run(){
        try{
            mathUtils.getMultiples(4);
        }
        catch (Exception ex){
            ex.printStackTrace();
        }
    }


}
