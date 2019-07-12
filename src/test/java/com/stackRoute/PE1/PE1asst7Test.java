package com.stackRoute.PE1;

import org.junit.*;

import static org.junit.Assert.*;

public class PE1asst7Test {
    public PE1asst7 pe1asst7;
    @Before
    public void setup(){
        //arrrange
        System.out.println("Inside before");
        this.pe1asst7=new PE1asst7();
    }


    @After
    public void tearDown(){
        System.out.println("Inside after");
        pe1asst7=null;
    }

    @BeforeClass
    public static void beforeClass(){
        System.out.println("before class");
    }

    @AfterClass
    public static void afterClass(){
        System.out.println("After class");
    }


    @Test
    public void givenNumbeAndShouldReturnSortNumber() {
        //act
        int actualResult;
        actualResult = pe1asst7.conertGivenNumberToString(194637);
        //assert
        assertEquals(976431,actualResult);
    }
}