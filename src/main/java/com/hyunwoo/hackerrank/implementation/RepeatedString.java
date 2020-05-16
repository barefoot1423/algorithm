package com.hyunwoo.hackerrank.implementation;

// https://www.hackerrank.com/challenges/repeated-string/problem

import java.util.Collections;

public class RepeatedString {
    public long repeatedString(String s, long n) {

        long length = s.length();

        long divide = (n / length);
        int d = (int) (n % length);

        String multiple = String.format("%0" + divide + "d", 0).replace("0", s).concat(s.substring(0, d));

        char[] chars = multiple.toCharArray();

        long ret = 0;
        for (char c : chars) {
            if (c == 'a') {
                ret++;
            }
        }

        return ret;
    }
}
