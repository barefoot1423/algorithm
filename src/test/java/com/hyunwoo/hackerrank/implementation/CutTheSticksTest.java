package com.hyunwoo.hackerrank.implementation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class CutTheSticksTest {

    @Test
    public void cutTheSticks() {
        CutTheSticks cutTheSticks = new CutTheSticks();
        assertArrayEquals(new int[] {6, 4, 2, 1}, cutTheSticks.cutTheSticks(new int[] {5, 4, 4, 2, 2, 8}));
        assertArrayEquals(new int[] {8, 6, 4, 1}, cutTheSticks.cutTheSticks(new int[] {1, 2, 3, 4, 3, 3, 2, 1}));
    }
}
