//https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/
package com.hyunwoo.leetCode.findTheIndexOfTheFirstOccurrenceInaString;

public class FindTheIndex {

    public int strStr(String haystack, String needle) {
        if (haystack.contains(needle)) {
            return haystack.indexOf(needle);
        } else {
            return -1;
        }
    }
}
