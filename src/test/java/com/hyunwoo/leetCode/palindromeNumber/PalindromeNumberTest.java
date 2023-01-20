package com.hyunwoo.leetCode.palindromeNumber;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeNumberTest {

    @Test
    void isPalindrome() {
        var parlindromeNumber = new PalindromeNumber();

        assertEquals(true, parlindromeNumber.isPalindrome(333));
        assertEquals(false, parlindromeNumber.isPalindrome(123));
        assertEquals(false, parlindromeNumber.isPalindrome(-123));
        assertEquals(true, parlindromeNumber.isPalindrome(1001));

    }

}
