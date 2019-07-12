package com.stackRoute.PE1;

import org.junit.*;

import static org.junit.Assert.*;

public class StringReverserTest {
    public StringReverser stringReverser;

    @Before
    public void setup(){
        //arrrange
        System.out.println("Inside before");
        this.stringReverser =new StringReverser();
    }


    @After
    public void tearDown(){
        System.out.println("Inside after");
        stringReverser =null;
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
            String actualResult= stringReverser.reverseString("Hello");
            //assert
            assertEquals("olleH",actualResult);

        }
    }
