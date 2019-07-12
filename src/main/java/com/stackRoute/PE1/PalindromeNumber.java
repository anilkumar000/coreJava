package com.stackRoute.PE1;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {

        int n, reversedInteger = 0, remainder, originalInteger, sum = 0, temp;
        Scanner num = new Scanner(System.in);
        n = num.nextInt();
        originalInteger = n;

        // Palindrome_logic
        while (n != 0) {
            remainder = n % 10;
            reversedInteger = reversedInteger * 10 + remainder;
            n /= 10;

        }
        if (originalInteger == reversedInteger) {
            System.out.println(originalInteger + " is a palindrome.");

            // Sum-of_Even-numbers Logic
            n=originalInteger;
            while (n != 0) {
                temp = n % 10;
                if (temp % 2 == 0) {
                    sum += temp;
                }
                n /= 10;
            }
            if (sum > 25) {
                System.out.println("sum of even numbers is more than 25");
            } else {
                System.out.println("sum of even numbers is less than 25");

            }
        } else
            System.out.println(originalInteger + " is not a palindrome.");

    }
}
