package com.hyunwoo.hackerrank.implementation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ManasaAndStonesTest {

    @Test
    public void stones() {
        ManasaAndStones manasaAndStones = new ManasaAndStones();

        assertArrayEquals(new int[] {2, 3, 4}, manasaAndStones.stones(3, 1, 2));
        assertArrayEquals(new int[] {30, 120, 210, 300}, manasaAndStones.stones(4, 10, 100));
    }
}
