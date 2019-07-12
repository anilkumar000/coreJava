package com.stackRoute.PE1;

import org.junit.*;

import static org.junit.Assert.*;

public class numbersAdderTest {
    public numbersAdder numbersadder;
    @Before
    public void setup(){
        //arrrange
        System.out.println("Inside before");
        this.numbersadder=new numbersAdder();
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
        int actualResult = numbersadder.takeInput(testInputs);
        //assert
        assertEquals(60,actualResult);
    }

    @Test
    public void givenArrayAndShouldReturnError() {
        //act
        int[] testInputs={};
        int actualResult = numbersadder.takeInput(testInputs);
        //assert
        assertN(60,actualResult);
    }

}