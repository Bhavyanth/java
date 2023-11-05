package com.java.jsp.util;

import java.util.Base64;

public class PasswordUtils {
        public static  String encode(String password){
            Base64.Encoder encoder = Base64.getEncoder();
            byte byteArr[] = {1,2};
            byte byteArr2[] = encoder.encode(byteArr);
            int x = encoder.encode(byteArr,byteArr2);
            String str = encoder.encodeToString(password.getBytes());
            return str;
        }

    public static void main(String[] args) {
        encode("ABC");
    }
}
