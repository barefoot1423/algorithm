package com.hyunwoo.leetCode.findTheIndexOfTheFirstOccurrenceInaString;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindTheIndexTest {

    @Test
    void strStr() {
        FindTheIndex findTheIndex = new FindTheIndex();
        assertEquals(0, findTheIndex.strStr("sadxxxxxx", "sad"));
        assertEquals(2, findTheIndex.strStr("abcddd", "cd"));
        assertEquals(-1, findTheIndex.strStr("leetcode", "leeto"));
        assertEquals(2, findTheIndex.strStr("hello", "ll"));
        assertEquals(1, findTheIndex.strStr("mississippi", "issi"));
        assertEquals(4, findTheIndex.strStr("mississippi", "issip"));
        assertEquals(-1, findTheIndex.strStr("mississippi", "issipi"));

    }

}
