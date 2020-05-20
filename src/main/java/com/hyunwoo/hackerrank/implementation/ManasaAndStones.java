package com.hyunwoo.hackerrank.implementation;

// https://www.hackerrank.com/challenges/manasa-and-stones/problem

import java.util.HashSet;
import java.util.Set;

// I think this is a good question.
public class ManasaAndStones {
    public int[] stones(int n, int a, int b) {

        Set<Integer> retStone = new HashSet<>();

        for (int i = 0; i < n; i++) {
            int sum = (i * a) + ((n - 1 - i) * b);
            retStone.add(sum);
        }

        return retStone.stream().mapToInt(Number::intValue).sorted().toArray();
    }
}
