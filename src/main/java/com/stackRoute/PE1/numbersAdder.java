package com.stackRoute.PE1;

import java.util.Scanner;

public class numbersAdder {
    int total = 0;

    public int takeInput(int[] number) {
//        System.out.println("Enter the numbers:");
        for (int i = 0; i < number.length; i++)
            // <-- end loop body.
            while (number[i] != 0) {
                this.total += number[i];
                break;
            }
        System.out.println("addition of numbers:" + this.total);
        return this.total;
    }
}

