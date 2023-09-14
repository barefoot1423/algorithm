package com.hyunwoo.leetCode.climbingStairs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClimbingStairsTest {

    @Test
    void climbStairs() {

        ClimbingStairs stairs = new ClimbingStairs();
        assertEquals(2, stairs.climbStairs(2));
        assertEquals(3, stairs.climbStairs(3));
    }

}
