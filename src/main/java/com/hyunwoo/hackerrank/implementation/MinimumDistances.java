package com.hyunwoo.hackerrank.implementation;

//https://www.hackerrank.com/challenges/minimum-distances/problem

import java.util.HashMap;
import java.util.Map;

public class MinimumDistances {

    public int minimumDistances(int[] a) {

        Map<Integer, Integer> arrayMap = new HashMap<>();
        int minimumDistance = a.length;

        for (int i = 0; i < a.length; i++) {
            if (arrayMap.containsKey(a[i])) {
                if (Math.abs(i - arrayMap.get(a[i])) < minimumDistance) {
                    minimumDistance = i - arrayMap.get(a[i]);
                }
            }
            arrayMap.put(a[i], i);
        }

        return minimumDistance == a.length ? -1 : minimumDistance;
    }

}
