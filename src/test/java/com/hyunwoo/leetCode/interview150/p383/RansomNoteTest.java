package com.hyunwoo.leetCode.interview150.p383;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RansomNoteTest {

    @Test
    void canConstruct() {

        RansomNote ransomNote = new RansomNote();

        assertEquals(false, ransomNote.canConstruct("a", "b"));
        assertEquals(false, ransomNote.canConstruct("aa", "ab"));
        assertEquals(true, ransomNote.canConstruct("aa", "aab"));
    }

}
