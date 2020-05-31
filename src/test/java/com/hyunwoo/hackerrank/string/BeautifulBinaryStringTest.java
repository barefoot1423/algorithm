package com.hyunwoo.hackerrank.string;

import org.junit.Test;

import static org.junit.Assert.*;

public class BeautifulBinaryStringTest {

    @Test
    public void beautifulBinaryString() {
        BeautifulBinaryString beautifulBinaryString = new BeautifulBinaryString();
        assertEquals(0, beautifulBinaryString.beautifulBinaryString("01100"));
        assertEquals(3, beautifulBinaryString.beautifulBinaryString("0100101010"));
    }

}
