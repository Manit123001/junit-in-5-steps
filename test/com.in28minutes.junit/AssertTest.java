package com.in28minutes.junit;

import org.junit.Test;

import static org.junit.Assert.*;

public class AssertTest {
    @Test
    public void test(){
        boolean condn = true;
        assertEquals(true, condn);
        assertTrue(condn);
//        assertFalse(condn);
//        assertNull(condn);
//        assertNotNull(condn);
//        assertArrayEquals();
    }
}
