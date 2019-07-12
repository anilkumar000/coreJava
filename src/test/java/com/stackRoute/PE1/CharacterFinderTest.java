package com.stackRoute.PE1;

import org.junit.*;

import static org.junit.Assert.*;

public class CharacterFinderTest {
    public CharacterFinder characterFinder;
    @Before
    public void setup(){
        //arrrange
        System.out.println("Inside before");
        this.characterFinder =new CharacterFinder();
    }


    @After
    public void tearDown(){
        System.out.println("Inside after");
        characterFinder =null;
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
    public void givenCharAndShouldReturnTypeOfChar() {
        //act
        String actualResult= characterFinder.givenCharTypeIs('A');
        //assert
        assertEquals("Capital Letter",actualResult);

    }


}