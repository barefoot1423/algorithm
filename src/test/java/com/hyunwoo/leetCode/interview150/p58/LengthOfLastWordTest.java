package com.hyunwoo.leetCode.interview150.p58;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LengthOfLastWordTest {

    @Test
    void lengthOfLastWord() {
        LengthOfLastWord lengthOfLastWord = new LengthOfLastWord();

        assertEquals(5, lengthOfLastWord.lengthOfLastWord("Hello World"));
        assertEquals(4, lengthOfLastWord.lengthOfLastWord("   fly me   to   the moon  "));
        assertEquals(6, lengthOfLastWord.lengthOfLastWord("luffy is still joyboy"));

    }

}
