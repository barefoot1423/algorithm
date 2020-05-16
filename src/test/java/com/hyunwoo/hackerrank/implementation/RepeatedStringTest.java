package com.hyunwoo.hackerrank.implementation;

import org.junit.Test;

import static org.junit.Assert.*;

public class RepeatedStringTest {

    @Test
    public void repeatedString() {
        RepeatedString repeatedString = new RepeatedString();

        assertEquals(7l, repeatedString.repeatedString("aba", 10l));
        assertEquals(1000000000000l, repeatedString.repeatedString("a", 1000000000000l));
    }
}
