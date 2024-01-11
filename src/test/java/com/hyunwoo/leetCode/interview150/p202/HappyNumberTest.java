package com.hyunwoo.leetCode.interview150.p202;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HappyNumberTest {

    @Test
    void isHappy() {
        HappyNumber happyNumber = new HappyNumber();
//        assertEquals(true, happyNumber.isHappy(19));
//        assertEquals(false, happyNumber.isHappy(2));
        assertEquals(false, happyNumber.isHappy(7));
    }

}
