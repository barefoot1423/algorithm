package com.hyunwoo.leetCode.removeDuplicatesFromSortedArray;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveDuplicatesFromSortedArrayTest {

    @Test
    void removeDuplicates() {
        RemoveDuplicatesFromSortedArray removeDuplicatesFromSortedArray = new RemoveDuplicatesFromSortedArray();

        assertEquals(4, removeDuplicatesFromSortedArray.removeDuplicates(new int[] {1, 2, 3, 3, 4}));
        assertEquals(4, removeDuplicatesFromSortedArray.removeDuplicates(new int[] {1, 2, 3, 3, 3, 3, 4}));
        assertEquals(2, removeDuplicatesFromSortedArray.removeDuplicates(new int[] {1, 1, 2}));
    }

}
