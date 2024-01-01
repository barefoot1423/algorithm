package com.hyunwoo.leetCode.interview150.p125;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidPalindromeTest {

    @Test
    void isPalindrome() {
        ValidPalindrome validPalindrome = new ValidPalindrome();

//        assertEquals(true, validPalindrome.isPalindrome("A man, a plan, a canal: Panama"));
        assertEquals(false, validPalindrome.isPalindrome("09P"));
    }

}
