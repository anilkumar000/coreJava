package com.stackRoute.PE1;

import org.junit.*;

import static org.junit.Assert.*;

public class IntegerSorterAndEvenSumFinderTest {
    public IntegerSorterAndEvenSumFinder integerSorterAndEvenSumFinder;
    @Before
    public void setup(){
        //arrrange
        System.out.println("Inside before");
        this.integerSorterAndEvenSumFinder =new IntegerSorterAndEvenSumFinder();
    }


    @After
    public void tearDown(){
        System.out.println("Inside after");
        integerSorterAndEvenSumFinder =null;
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
        actualResult = integerSorterAndEvenSumFinder.conertGivenNumberToString(194637);
        //assert
        assertEquals(976431,actualResult);
    }
}