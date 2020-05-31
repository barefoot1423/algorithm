package com.hyunwoo.hackerrank.string;

// https://www.hackerrank.com/challenges/beautiful-binary-string/problem

public class BeautifulBinaryString {

    public int beautifulBinaryString(String b) {

        char[] chars = b.toCharArray();

        int ret = 0;
        for (int i = 0; i < chars.length - 2; i++) {
            if (chars[i] == '0' && chars[i + 1] == '1' && chars[i + 2] == '0') {
                ret++;
                chars[i + 2] = '1';
            }
        }

        return ret;
    }

}
