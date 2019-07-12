package com.stackRoute.PE1;
import java.util.Scanner;
public class PE1asst3 {
    public static void main(String[] args) {



        Scanner in = new Scanner(System.in);

        System.out.print("Input an alphabet: ");
        String input = in.next().toLowerCase();


        for (int i=0;i<input.length();i++){

            char temp=input.charAt(i);
            if (temp >= 'a' && temp <= 'z') {

                switch(temp){
                    case 'a':
                    case 'e':
                    case 'i':
                    case 'o':
                    case 'u':
                        System.out.println("vowel");
                        break;
                        default:
                            System.out.println("consonant");

              }


            }
            else
                System.out.println("It is not an alphabet");
        }

    }
}
