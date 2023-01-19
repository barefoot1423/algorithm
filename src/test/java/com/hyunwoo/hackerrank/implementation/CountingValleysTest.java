package com.hyunwoo.hackerrank.implementation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CountingValleysTest {

    @Test
    public void countingValleys() {
        CountingValleys countingValleys = new CountingValleys();
        assertEquals(1, countingValleys.countingValleys(8, "UDDDUDUU"));
    }

}
