package com.stackRoute.PE1;

import org.junit.*;

import static org.junit.Assert.*;

public class NumbersAdderTest {
    public NumbersAdder numbersadder;
    @Before
    public void setup(){
        //arrrange
        System.out.println("Inside before");
        this.numbersadder=new NumbersAdder();
    }


    @After
    public void tearDown(){
        System.out.println("Inside after");
        numbersadder=null;
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
    public void  givenArrayAndShouldReturnAdditionOfElements() {
        //act
        int[] testInputs={10,20,30,0};
        String actualResult = numbersadder.takeInput(testInputs);
        //assert
        assertEquals(60,actualResult);
    }

    @Test
    public void givenEmptyArrayAndShouldReturnZero() {
        //act
        int[] testInputs={};
        String actualResult = numbersadder.takeInput(testInputs);
        //assert
        assertEquals(0,actualResult);
    }

    @Test
    public void givenArrayElementCharAndShouldReturnError() {
        //act
        int[] testInputs={'a',10,20};
        String actualResult = numbersadder.takeInput(testInputs);
        //assert
        assertEquals("Only integers are Allowed",actualResult);
    }



}