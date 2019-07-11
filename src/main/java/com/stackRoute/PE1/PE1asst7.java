package com.stackRoute.PE1;

import java.util.Arrays;

public class PE1asst7 {
    public static int[] sortANumber(int number){
        int[] sortednumber={};
        int i=0;

            while (number != 0) {
                sortednumber[i] =number%10;
                number /= 10;
                i++;

            }
        Arrays.sort(sortednumber);
        return sortednumber;
    }
    public static void main(String[] args){
        sortANumber(1937842);
    }
}
