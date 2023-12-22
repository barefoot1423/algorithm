package com.hyunwoo.leetCode.majorityElements;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MajorityElementsTest {

    @Test
    void majorityElement() {
        MajorityElements m = new MajorityElements();
        assertEquals(3, m.majorityElement(new int[] {3, 2, 3}));
        assertEquals(2, m.majorityElement(new int[] {2, 2, 1, 1, 1, 2, 2}));
    }

}
