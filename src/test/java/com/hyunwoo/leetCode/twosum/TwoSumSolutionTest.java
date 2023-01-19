package com.hyunwoo.leetCode.twosum;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwoSumSolutionTest {

    @Test
    void twoSumHash() {
        var twoSumSolution = new TwoSumSolution();
        assertArrayEquals(new int[] {1, 4}, twoSumSolution.twoSumHash(new int[] {4, 1, 5, 2, 3, 4}, 4));
        assertArrayEquals(new int[] {1, 2}, twoSumSolution.twoSumHash(new int[] {3,2,4}, 6));
        assertArrayEquals(new int[] {0, 1} , twoSumSolution.twoSumHash(new int[] {3,3}, 6));
    }

}
