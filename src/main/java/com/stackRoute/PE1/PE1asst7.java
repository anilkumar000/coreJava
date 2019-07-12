package com.stackRoute.PE1;

import java.sql.SQLOutput;
import java.util.*;

import static java.util.Collections.*;

public class PE1asst7 {
    public int conertGivenNumberToString(int number){

        String num=Integer.toString(number);
        sortingOfStringAndSumOfEvenNumbers(num);
        return 0;

    }

    public int sortingOfStringAndSumOfEvenNumbers(String num1){

        int sum=0;
        int [] numarray=new int[10000];
        for(int i=0;i<num1.length();i++){
            for(int j=0;j<num1.length();j++){
                if(numarray[i]>numarray[j]){
                    int temp=numarray[i];
                    numarray[i]=numarray[j];
                    numarray[j]=temp;
                }

            }
            System.out.print(numarray[i]);
            return numarray[i];
        }
        for(int i=0;i<num1.length();i++){
            numarray[i]=num1.charAt(i)-'0';

            if(numarray[i]%2==0){
                sum=sum+numarray[i];
            }

        }

        System.out.println("sum of even numbers"+sum);
        if(sum>15){
        System.out.println("true");
        }else{
        System.out.println("false");
        }
        return sum;
    }
}
