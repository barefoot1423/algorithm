package com.hyunwoo.hackerrank.string;

import org.junit.Test;

import static org.junit.Assert.*;

public class TheLoveLetterMysteryTest {

    @Test
    public void theLoveLetterMystery() {
        TheLoveLetterMystery theLoveLetterMystery = new TheLoveLetterMystery();
        assertEquals(3, theLoveLetterMystery.theLoveLetterMystery("abc"));
        assertEquals(0, theLoveLetterMystery.theLoveLetterMystery("abcba"));
        assertEquals(2, theLoveLetterMystery.theLoveLetterMystery("abcd"));
        assertEquals(4, theLoveLetterMystery.theLoveLetterMystery("cba"));
    }

}
