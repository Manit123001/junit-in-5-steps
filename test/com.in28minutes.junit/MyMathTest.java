package com.in28minutes.junit;

import org.junit.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class MyMathTest {
    MyMath myMath = new MyMath();


    @Before
    public void before() {
        System.out.println("Before");
    }

    @After
    public void after() {
        System.out.println("After");
    }

    @BeforeClass
    public static void beforeClass() {
        System.out.println("BeforeClass");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("AfterClass");
    }


    @Test
    public void sum_with3number() {
        System.out.println("Test1");
        int result = myMath.sum(new int[]{1, 2, 3});
        assertEquals(6, result);
    }

    @Test
    public void sum_with1number() {
        System.out.println("Test2");
        MyMath myMath = new MyMath();
        int result = myMath.sum(new int[]{3});
        assertEquals(3, result);
    }

    /*
    Step running
    BeforeClass
    Before
    Test2
    After
    Before
    Test1
    After
    AfterClass*/
}