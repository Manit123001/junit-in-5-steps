package com.in28minutes.junit;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class MyMathTest {
    MyMath myMath = new MyMath();
    //MyMath.sum_witkh3number
    //1,2,3,4 => 6
    @Test
    public void sum_with3number() {
        int result = myMath.sum(new int[]{1, 2, 3});
        assertEquals(6, result);
    }

    @Test
    public void sum_with1number() {
        MyMath myMath = new MyMath();
        int result = myMath.sum(new int[]{3});
        assertEquals(3, result);
    }
}