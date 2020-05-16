package com.hyunwoo.hackerrank.implementation;

// https://www.hackerrank.com/challenges/repeated-string/problem

public class RepeatedString {
    public long repeatedString(String s, long n) {

        long length = s.length();
        long divide = (n / length);
        int d = (int) (n % length);

        return s.chars().filter(value -> value == 'a').count() * divide + s.substring(0,d).chars().filter(value -> value == 'a').count();
    }
}
