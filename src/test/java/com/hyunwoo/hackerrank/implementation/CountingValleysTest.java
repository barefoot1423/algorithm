package com.hyunwoo.hackerrank.implementation;

import org.junit.Test;

import static org.junit.Assert.*;

public class CountingValleysTest {

    @Test
    public void countingValleys() {
        CountingValleys countingValleys = new CountingValleys();
        assertEquals(1, countingValleys.countingValleys(8, "UDDDUDUU"));
    }

}
