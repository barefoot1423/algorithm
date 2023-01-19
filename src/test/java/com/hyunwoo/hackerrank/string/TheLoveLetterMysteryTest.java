package com.hyunwoo.hackerrank.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TheLoveLetterMysteryTest {

    @Test
    public void theLoveLetterMystery() {
        TheLoveLetterMystery theLoveLetterMystery = new TheLoveLetterMystery();
        assertEquals(2, theLoveLetterMystery.theLoveLetterMystery("abc"));
        assertEquals(0, theLoveLetterMystery.theLoveLetterMystery("abcba"));
        assertEquals(4, theLoveLetterMystery.theLoveLetterMystery("abcd"));
        assertEquals(2, theLoveLetterMystery.theLoveLetterMystery("cba"));
    }

}
