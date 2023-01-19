package com.hyunwoo.hackerrank.implementation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MinimumDistancesTest {

    @Test
    public void minimumDistances() {
        MinimumDistances minimumDistances = new MinimumDistances();

        assertEquals(3, minimumDistances.minimumDistances(new int[] {7, 1, 3, 4, 1, 7}));
    }
}
