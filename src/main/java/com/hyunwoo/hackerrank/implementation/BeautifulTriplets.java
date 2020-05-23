package com.hyunwoo.hackerrank.implementation;

// https://www.hackerrank.com/challenges/beautiful-triplets/problem

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class BeautifulTriplets {
    public int beautifulTriplets(int d, int[] arr) {
        int ret = 0;

        List<Integer> integerList = Arrays.stream(arr).boxed().collect(Collectors.toList());

        for (int num : integerList) {
            if (integerList.contains(num + d) && integerList.contains(num + 2 * d)) {
                ret++;
            }
        }

        return ret;
    }
}
