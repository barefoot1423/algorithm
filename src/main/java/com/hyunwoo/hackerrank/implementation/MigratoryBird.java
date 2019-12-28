package com.hyunwoo.hackerrank.implementation;

//https://www.hackerrank.com/challenges/migratory-birds/problem

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MigratoryBird {
    public int migratoryBirds(List<Integer> arr) {

        Map<Integer, Long> counted = arr.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        return counted.entrySet().stream().max((entry1, entry2) -> entry1.getValue() >= entry2.getValue() ? 1 : -1).get().getKey();
    }
}
