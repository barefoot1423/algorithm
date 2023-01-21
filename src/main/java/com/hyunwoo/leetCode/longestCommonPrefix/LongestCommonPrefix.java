//https://leetcode.com/problems/longest-common-prefix/description/
package com.hyunwoo.leetCode.longestCommonPrefix;

import java.util.Arrays;
import java.util.Comparator;

public class LongestCommonPrefix {

    public String longestCommonPrefix(String[] strs) {
        StringBuilder commonPrefix = new StringBuilder();

        int shortestLength = Arrays.stream(strs).min(Comparator.comparing(String::length)).get().length();

        for (int i = 0; i < shortestLength; i++) {
            String commonChar = null;
            for (int j = 0; j < strs.length; j++) {
                if (commonChar == null) {
                    commonChar = String.valueOf(strs[j].charAt(i));
                } else {
                    if (!commonChar.equals(String.valueOf(strs[j].charAt(i)))) {
                        return commonPrefix.toString();
                    }
                }
            }
            commonPrefix.append(commonChar);
        }
        return commonPrefix.toString();
    }

}
