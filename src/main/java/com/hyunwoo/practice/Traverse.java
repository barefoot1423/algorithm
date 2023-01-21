package com.hyunwoo.practice;

import java.util.Arrays;
import java.util.Comparator;

public class Traverse {

    public static void main(String[] args) {

        String[] strings = new String[] {"ABC", "DEFG", "HIJ", "JKL"};

        int shortestLength = Arrays.stream(strings).min(Comparator.comparing(String::length)).get().length();

        for (int i = 0; i < shortestLength; i++) {
            for (int j = 0; j < strings.length; j++) {
                System.out.println(strings[j].charAt(i));
            }
        }
    }

}
