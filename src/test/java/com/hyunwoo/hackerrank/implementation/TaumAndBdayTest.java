package com.hyunwoo.hackerrank.implementation;

import org.junit.Test;

import static org.junit.Assert.*;

public class TaumAndBdayTest {

    @Test
    public void taumBday() {
        TaumAndBday taumAndBday = new TaumAndBday();
        assertEquals(20, taumAndBday.taumBday(10, 10, 1, 1, 1));
        assertEquals(37, taumAndBday.taumBday(5, 9, 2, 3, 4));
        assertEquals(12, taumAndBday.taumBday(3, 6, 9, 1, 1));
        assertEquals(35, taumAndBday.taumBday(7, 7, 4, 2, 1));
        assertEquals(12, taumAndBday.taumBday(3, 3, 1, 9, 2));
    }
}
