package com.hyunwoo.leetCode.interview150.p27;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveElementTest {

    @Test
    void removeElement() {
        RemoveElement removeElement = new RemoveElement();

        removeElement.removeElement(new int[] {3,2,2,3}, 3);
        System.out.println();
        removeElement.removeElement(new int[] {0,1,2,2,3,0,4,2}, 2);
    }

}
