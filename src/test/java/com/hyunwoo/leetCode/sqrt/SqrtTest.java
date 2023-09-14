package com.hyunwoo.leetCode.sqrt;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SqrtTest {

    @Test
    void mySqrt() {
        Sqrt sqrt = new Sqrt();
        assertEquals(2, sqrt.mySqrt(4));
        assertEquals(2, sqrt.mySqrt(8));
    }

}
