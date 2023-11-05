package com.java.strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringRegex {

    /*
    [abc] -> a,b,c
    [^abc] -> Any character except a,b,c
    [a-zA-Z] -> a to z and A to Z
    [a-d[m-p]] -> a to d OR m t p ~ [a-dm-p]
    [a-z&&[def]] -> d,e,f
    [a-z&&[^bc]] -> a to z except b and c
    [a-z&&[^m-p]] -> a to z and not m to p ~ [a-lq-z]
     */

    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&-+=()])(?=\\\\S+$)");
        Matcher m = pattern.matcher("Sumatran");
        if(m.find()){
        System.out.println(m.matches());
        }
        else{
            System.out.println("No Match found");
        }
    }


}
