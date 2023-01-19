package com.hyunwoo.hackerrank.implementation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RepeatedStringTest {

    @Test
    public void repeatedString() {
        RepeatedString repeatedString = new RepeatedString();

        assertEquals(7l, repeatedString.repeatedString("aba", 10l));
        assertEquals(1000000000000l, repeatedString.repeatedString("a", 1000000000000l));
    }
}
