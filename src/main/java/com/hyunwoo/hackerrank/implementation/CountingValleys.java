package com.hyunwoo.hackerrank.implementation;

//https://www.hackerrank.com/challenges/counting-valleys/problem

import org.omg.CORBA.INTERNAL;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CountingValleys {

    public int countingValleys(int n, String s) {

        int vallyCount = 0;
        int sum = 0;

        int[] ints = Stream.of(s.split("")).mapToInt(CountingValleys::parse).toArray();

        for (int i = 1; i < ints.length; i++) {
            sum += ints[i - 1];

            if (sum == 0 && ints[i - 1] == -1) {
                vallyCount++;
            }
        }


        return vallyCount;
    }

    private static Integer parse(String s) {
        if (s.equals("U")) {
            return 1;
        } else {
            return -1;
        }
    }

}
