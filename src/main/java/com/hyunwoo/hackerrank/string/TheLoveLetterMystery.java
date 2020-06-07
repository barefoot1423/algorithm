package com.hyunwoo.hackerrank.string;

// https://www.hackerrank.com/challenges/the-love-letter-mystery/problem

public class TheLoveLetterMystery {

    public int theLoveLetterMystery(String s) {

        char[] chars = s.toCharArray();
        int ret = 0;

        if (chars.length % 2 == 0) {
            for (int i = chars.length / 2; i < chars.length; i++) {
                char forwardChar = chars[i];
                char backwardChar = chars[chars.length - i - 1];
                ret += Math.abs(forwardChar - backwardChar);
            }
        } else {
            for (int i = chars.length / 2 + 1; i < chars.length; i++) {
                char forwardChar = chars[i];
                char backwardChar = chars[chars.length - i - 1];
                ret += Math.abs(forwardChar - backwardChar);
            }
        }

        return ret;
    }

}
