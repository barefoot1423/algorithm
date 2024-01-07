package com.hyunwoo.leetCode.interview150.p1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwoSumTest {

    @Test
    void twoSum() {
        TwoSum twoSum = new TwoSum();

        assertArrayEquals(new int[] {0, 1}, twoSum.twoSum(new int[] {2,7,11,15}, 9));
        assertArrayEquals(new int[] {1, 2}, twoSum.twoSum(new int[] {3,2,4}, 6));

    }

}
