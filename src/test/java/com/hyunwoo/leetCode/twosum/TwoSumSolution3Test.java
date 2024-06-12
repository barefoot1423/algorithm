package com.hyunwoo.leetCode.twosum;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwoSumSolution3Test {

    @Test
    void twoSum() {
        TwoSumSolution3 twoSumSolution = new TwoSumSolution3();
//        assertArrayEquals(new int[] {0, 1}, twoSumSolution.TwoSum(new int[] {2, 7, 11, 15}, 9));
        assertArrayEquals(new int[] {1, 2}, twoSumSolution.TwoSum(new int[] {3, 2, 4}, 6));
    }

}
