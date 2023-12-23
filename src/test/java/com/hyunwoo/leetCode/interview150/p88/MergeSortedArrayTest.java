package com.hyunwoo.leetCode.interview150.p88;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MergeSortedArrayTest {

    @Test
    void merge() {
        MergeSortedArray mergeSortedArray = new MergeSortedArray();
//        mergeSortedArray.merge(new int[] {1, 2, 3, 0, 0, 0}, 3, new int[] {2, 5, 6}, 3);
        mergeSortedArray.merge(new int[] {-1, 0, 0, 3, 3, 3, 0, 0, 0}, 6, new int[] {1, 2, 2}, 3);
//        assertArrayEquals(new int[] {1, 2, 2, 3, 5, 6}, mergeSortedArray.merge(new int[] {1, 2, 3, 0, 0, 0}, 3, new int[] {2, 5, 6}, 3));
    }

}
