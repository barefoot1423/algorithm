//https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/
package com.hyunwoo.leetCode.findTheIndexOfTheFirstOccurrenceInaString;

public class FindTheIndex {

    public int strStr(String haystack, String needle) {

        char[] haystackCharArray = haystack.toCharArray();
        char[] needleCharArray = needle.toCharArray();
        int ret = -1;
        if (haystackCharArray.length < needleCharArray.length) {
            return -1;
        }

        for (int i = 0; i < haystackCharArray.length; ) {
            for (int j = 0; j < needleCharArray.length && i < haystackCharArray.length; j++) {
                if (haystackCharArray[i] == needleCharArray[j]) {
                    if (ret == -1) {
                        ret = i;
                    }
                    i++;
                } else {
                    if (ret != -1) {
                        i = ret + 1;
                    } else {
                        i++;
                    }
                    ret = -1;
                    break;
                }
                if (j == needleCharArray.length - 1) {
                    return ret;
                }
            }
        }

        return -1;
    }

}
