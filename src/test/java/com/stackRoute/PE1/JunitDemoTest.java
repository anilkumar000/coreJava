package com.stackRoute.PE1;

import org.junit.*;

import static org.junit.Assert.*;

public class JunitDemoTest {
    public JunitDemo junitDemo;

    @Before
    public void setup(){
        //arrrange
        System.out.println("Inside before");
        this.junitDemo=new JunitDemo();
    }


    @After
    public void tearDown(){
        System.out.println("Inside after");
        junitDemo=null;
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
    public void concatAndUpperCase() {

        //act
        String actualResult= junitDemo.concatAndUpperCase("anil","kumar");
        //assert
        assertEquals("ANILKUMAR",actualResult);
    }


    @Test
    public void givenAStringAndNullShouldReturnErrorMessage(){


        //act
        String actualResult= junitDemo.concatAndUpperCase("anil",null);
        //assert
        assertNotNull(actualResult);
        assertEquals("Null value not allowed",actualResult);

    }

    @Test
    public void givenStringShouldReturntheReverse(){
        //act
        String actualResult=junitDemo.reverseString("Hello");
        //assert
        assertEquals("olleH",actualResult);

    }
}