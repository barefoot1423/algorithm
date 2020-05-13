package com.hyunwoo.hackerrank.implementation;

// https://www.hackerrank.com/challenges/equality-in-a-array/problem

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class EqualizeTheArray {

    public int equalizeArray(int[] arr) {

        int i = Math.toIntExact(Arrays.stream(arr)
            .boxed()
            .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
            .entrySet()
            .stream()
            .max(Comparator.comparing(Map.Entry::getValue))
            .map(Map.Entry::getKey).orElse(null));

        return Math.toIntExact(Arrays.stream(arr).boxed().filter(integer1 -> i != integer1).count());

    }
}
