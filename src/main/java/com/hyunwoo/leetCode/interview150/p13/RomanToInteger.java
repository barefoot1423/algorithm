package com.hyunwoo.leetCode.interview150.p13;

import java.util.Arrays;

public class RomanToInteger {

    public int romanToInt(String s) {

        int ret = 0;
        s.chars().forEach(a -> {
            if (a == 'V') {
                ret += 1;
            }
        });


        return 0;
    }

}
