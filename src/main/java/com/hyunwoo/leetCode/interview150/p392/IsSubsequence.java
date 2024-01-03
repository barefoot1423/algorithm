package com.hyunwoo.leetCode.interview150.p392;

public class IsSubsequence {
    public boolean isSubsequence(String s, String t) {

        int subCount = s.length();
        int subIdx = 0;

        char[] sCharArray = s.toCharArray();
        char[] tCharArray = t.toCharArray();

        for (int i = 0; i <=  t.length() -1 && subIdx <= s.length() - 1;) {

            if (sCharArray[subIdx] == tCharArray[i]) {
                subIdx++;
                i++;
            } else {
                i++;
            }
        }

        return subIdx == subCount ? true: false;
    }

}
