package com.stackRoute;

import java.util.Scanner;

public class PE1asst4 {
    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);

        System.out.print("Input a number: ");
        int n=in.nextInt();
        for(int i =1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i);
            }
        }
    }
}
