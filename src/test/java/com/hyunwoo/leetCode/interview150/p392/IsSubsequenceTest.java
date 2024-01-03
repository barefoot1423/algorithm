package com.hyunwoo.leetCode.interview150.p392;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IsSubsequenceTest {

    @Test
    void isSubsequence() {
        IsSubsequence isSubsequence = new IsSubsequence();

        assertEquals(true, isSubsequence.isSubsequence("abc", "ahbgdc"));
        assertEquals(false, isSubsequence.isSubsequence("axc", "ahbgdc"));
    }

}
