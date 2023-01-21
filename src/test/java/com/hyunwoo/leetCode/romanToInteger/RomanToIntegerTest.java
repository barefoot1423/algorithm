package com.hyunwoo.leetCode.romanToInteger;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RomanToIntegerTest {

    @Test
    void romanToInt() {
        var romanToInterger = new RomanToInteger();

        assertEquals(3, romanToInterger.romanToInt("III"));
        assertEquals(58, romanToInterger.romanToInt("LVIII"));
        assertEquals(1994, romanToInterger.romanToInt("MCMXCIV"));

    }

}
