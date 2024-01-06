package com.hyunwoo.leetCode.interview150.p242;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidAnagramTest {

    @Test
    void isAnagram() {
        ValidAnagram validAnagram = new ValidAnagram();
        assertEquals(true, validAnagram.isAnagram("anagram", "nagaram"));
        assertEquals(false, validAnagram.isAnagram("rat", "car"));
    }

}
