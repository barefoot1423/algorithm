package com.hyunwoo.leetCode.interview150.p209;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WordPatternTest {

    @Test
    void wordPattern() {
        WordPattern wordPattern = new WordPattern();

        assertEquals(true, wordPattern.wordPattern("abba", "dog cat cat dog"));
        assertEquals(false, wordPattern.wordPattern("abba", "dog cat cat fish"));
        assertEquals(false, wordPattern.wordPattern("aaaa", "dog cat cat dog"));
    }

}
