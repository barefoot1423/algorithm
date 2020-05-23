package com.hyunwoo.hackerrank.implementation;

import org.junit.Test;

import static org.junit.Assert.*;

public class BeautifulTripletsTest {

    @Test
    public void beautifulTriplets() {
        BeautifulTriplets beautifulTriplets = new BeautifulTriplets();
        assertEquals(3, beautifulTriplets.beautifulTriplets(3, new int[] {1, 2, 4, 5, 7, 8, 10}));
    }
}
