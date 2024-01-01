package com.hyunwoo.leetCode.interview150.p28;

import org.junit.jupiter.api.Test;

import java.util.DuplicateFormatFlagsException;

import static org.junit.jupiter.api.Assertions.*;

class FindTheIndexOfTheFirstOccurrenceInAStringTest {

    @Test
    void strStr() {
        FindTheIndexOfTheFirstOccurrenceInAString findTheIndexOfTheFirstOccurrenceInAString = new FindTheIndexOfTheFirstOccurrenceInAString();

        assertEquals(0, findTheIndexOfTheFirstOccurrenceInAString.strStr("sadbutsad", "sad"));
        assertEquals(-1, findTheIndexOfTheFirstOccurrenceInAString.strStr("leetcode", "leeto"));
    }

}
