package com.stackRoute.PE1;


public class NumbersAdder {
    int total = 0;

    public String takeInput(int[] number) {
    String s="";
        for (int i = 0; i < number.length; i++) {
            if (Character.isDigit(number[i])) {
                while (number[i] != 0) {
                    this.total += number[i];
                    break;
                }
                System.out.println("addition of numbers:" + this.total);
                s= String.valueOf(this.total);
            } else {
                s= "Only integers are Allowed";
            }

        }
        return s;
    }
}
