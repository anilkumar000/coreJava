package com.stackRoute.PE1;

import org.junit.*;

import static org.junit.Assert.*;

public class PE1asst9Test {
    public PE1asst9 pe1asst9;

    @Before
    public void setup(){
        //arrrange
        System.out.println("Inside before");
        this.pe1asst9=new PE1asst9();
    }


    @After
    public void tearDown(){
        System.out.println("Inside after");
        pe1asst9=null;
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
        public void givenStringShouldReturntheReverse(){
            //act
            String actualResult=pe1asst9.reverseString("Hello");
            //assert
            assertEquals("olleH",actualResult);

        }
    }
