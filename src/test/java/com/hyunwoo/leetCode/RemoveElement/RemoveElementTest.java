package com.hyunwoo.leetCode.RemoveElement;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveElementTest {

    @Test
    void removeElement() {
        RemoveElement removeElement = new RemoveElement();
        assertEquals(5, removeElement.removeElement(new int[] {0, 1, 2, 2, 3, 0, 4, 2}, 2));
    }

}
