package com.stackRoute.PE1;

public class StringReverser {
    public String reverseString(String str3) {

        String reversedString = "";
        for (int i = str3.length() - 1; i >= 0; i--) {
            reversedString = reversedString + str3.charAt(i);
        }
        return reversedString;
    }
}
