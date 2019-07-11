package com.stackRoute.PE1;

import org.junit.*;

import static org.junit.Assert.*;

public class PE1asst6Test {
    public PE1asst6 pe1asst6;
    @Before
    public void setup(){
        //arrrange
        System.out.println("Inside before");
        this.pe1asst6=new PE1asst6();
    }


    @After
    public void tearDown(){
        System.out.println("Inside after");
        pe1asst6=null;
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
    public void givenCharTypeIs() {
        //act
        String actualResult= pe1asst6.givenCharTypeIs('A');
        //assert
        assertEquals("Capital Letter",actualResult);

    }


}