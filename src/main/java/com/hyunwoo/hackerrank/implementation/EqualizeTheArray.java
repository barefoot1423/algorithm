package com.hyunwoo.hackerrank.implementation;

// https://www.hackerrank.com/challenges/equality-in-a-array/problem

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class EqualizeTheArray {

    public int equalizeArray(int[] arr) {

        Integer integer = Arrays.stream(arr)
            .boxed()
            .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
            .entrySet()
            .stream()
            .collect(Collectors.groupingBy(Map.Entry::getValue, Collectors.mapping(Map.Entry::getKey, Collectors.toList())))
            .entrySet()
            .stream()
            .max(Comparator.comparing(Map.Entry::getKey))
            .map(Map.Entry::getValue).get().get(0);

        if (integer == null) {
            return 0;
        } else {
            return Math.toIntExact(Arrays.stream(arr).boxed().filter(integer1 -> integer != integer1).count());
        }
    }
}
