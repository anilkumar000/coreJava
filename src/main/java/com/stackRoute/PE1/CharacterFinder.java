package com.stackRoute.PE1;

public class CharacterFinder {
    public String givenCharTypeIs(char chr1){


        if (chr1>=97 && chr1<=122)
            return "Lower Case";
        else if (chr1>=65 && chr1<=90)
            return "Capital Letter";
        else if(chr1>=48 && chr1<=57)
            return "Number";
        else
            return "Special Character";

    }
}
