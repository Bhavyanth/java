package com.java.networking;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.stream.IntStream;

public class HttpURL {
    public static void main(String[] args){
        try {
            URL url=new URL("https://phoenix-play.vercel.app");
            HttpURLConnection httpURLConnection =(HttpURLConnection)url.openConnection();
            IntStream.range(1,5).forEach( i -> System.out.println(httpURLConnection.getHeaderFieldKey(i)+" = "+httpURLConnection.getHeaderField(i)));
            httpURLConnection.disconnect();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
