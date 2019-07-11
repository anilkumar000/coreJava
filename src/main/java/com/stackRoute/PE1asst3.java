package com.stackRoute;
import java.util.Scanner;
public class PE1asst3 {
    public static void main(String[] args) {
        int n,i=0;

        Scanner in = new Scanner(System.in);

        System.out.print("Input an alphabet: ");
        String input = in.next().toLowerCase();

        n = input.length();

        boolean lowercase = input.charAt(i) >= 97 && input.charAt(i) <= 122;
        boolean vowels =input.equals("a") || input.equals("e") || input.equals("i")
                || input.equals("o") || input.equals("u");

        if (n > 1) {

            for (i=0; i < n; i++) {
                if (lowercase) {

                    if (vowels)
                        System.out.println("Vowel");
                    else
                        System.out.println("Consonant");

                }
            }

        }
        else if (lowercase) {
            if (vowels)
                System.out.println("Input letter is Vowel");
            else
                System.out.println("Input letter is Consonant");
        }
    }
}
