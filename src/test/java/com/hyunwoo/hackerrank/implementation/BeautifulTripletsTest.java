package com.hyunwoo.hackerrank.implementation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BeautifulTripletsTest {

    @Test
    public void beautifulTriplets() {
        BeautifulTriplets beautifulTriplets = new BeautifulTriplets();
        assertEquals(3, beautifulTriplets.beautifulTriplets(3, new int[] {1, 2, 4, 5, 7, 8, 10}));
    }
}
