//https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/
package com.hyunwoo.leetCode.findTheIndexOfTheFirstOccurrenceInaString;

public class FindTheIndex {

    public int strStr(String haystack, String needle) {

        char[] haystackCharArray = haystack.toCharArray();
        char[] needleCharArray = needle.toCharArray();
        int ret = -1;
        for (int i = 0; i < haystackCharArray.length; i++) {
            for (int j = 0; j < needleCharArray.length || i < haystackCharArray.length;) {
                if (haystackCharArray[i] == needleCharArray[j]) {
                    ret = i;
                    j++;
                    i++;
                    if (j == needleCharArray.length) {
                        return ret;
                    }
                } else {
                    j = 0;
                    i++;
                    break;
                }
            }
        }

        return -1;
    }

}
