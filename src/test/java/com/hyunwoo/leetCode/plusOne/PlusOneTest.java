package com.hyunwoo.leetCode.plusOne;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlusOneTest {

    @Test
    void plusOne() {
        PlusOne plusOne = new PlusOne();
//        assertEquals(124, plusOne.plusOne(new int[] {1, 2, 3}));
        assertEquals(124, plusOne.plusOne(new int[] {9, 8, 7, 6, 5, 4, 3, 2, 1, 0}));
    }

}
