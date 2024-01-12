package com.hyunwoo.leetCode.interview150.p219;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContainsDuplicateTest {

    @Test
    void containsNearbyDuplicate() {
        ContainsDuplicate containsDuplicate = new ContainsDuplicate();

        assertEquals(true, containsDuplicate.containsNearbyDuplicate(new int[] {1, 2, 3, 1}, 3));
        assertEquals(true, containsDuplicate.containsNearbyDuplicate(new int[] {1, 0, 0, 1}, 1));
        assertEquals(false, containsDuplicate.containsNearbyDuplicate(new int[] {1, 2, 3, 1, 2, 3}, 2));
    }

}
