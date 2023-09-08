package com.hyunwoo.leetCode.lengthOfLastWord;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LengthOfLastWordTest {

    @Test
    void lengthOfLastWord() {
        LengthOfLastWord lengthOfLastWord = new LengthOfLastWord();
        assertEquals(5, lengthOfLastWord.lengthOfLastWord("Hello World"));
        assertEquals(4, lengthOfLastWord.lengthOfLastWord("AS  DDFS "));
    }

}
