package com.stackRoute;

import java.util.Scanner;

public class PE1asst5 {
    int total=0;

    private void takeInput(){
        System.out.println("Enter the numbers:");

        Scanner input=new Scanner(System.in);
        int number;
        while((number = input.nextInt()) != 0) {
                this.total += number;
        } // <-- end loop body.
        System.out.println("addition of numbers:"+this.total);

    }
    public static void main(String[] args){
        PE1asst5 in=new PE1asst5();
        in.takeInput();

    }
}
