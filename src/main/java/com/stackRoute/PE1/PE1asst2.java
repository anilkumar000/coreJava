package com.stackRoute;

import java.util.Scanner;

public class PE1asst2 {
    public static void main(String[] args) {

        int n;
        // Taking input from user
        Scanner num = new Scanner(System.in);
        System.out.print("Input a Number: ");
        n = num.nextInt();


        if(n>20 && n<30){

            if(n%2==0)
                System.out.println("Tom");

            else
                System.out.println("Jerry");
        }
        else
            System.out.println("Number is not in our Range");

    }

}