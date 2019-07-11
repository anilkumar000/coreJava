package com.stackRoute.PE1;

public class JunitDemo {
    public String concatAndUpperCase(String str1, String str2){
        if (str1==null || str2==null){
            return "Null value not allowed";
        }
        String concatedString=str1.concat(str2);
        return concatedString.toUpperCase();
    }

    public String reverseString(String str3) {

        String reversedString="";
        for(int i = str3. length() - 1; i >= 0; i--) {
            reversedString = reversedString + str3. charAt(i);
        }
        return reversedString;
    }
}
