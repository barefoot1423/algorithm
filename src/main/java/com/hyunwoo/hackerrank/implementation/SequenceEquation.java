package com.hyunwoo.hackerrank.implementation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SequenceEquation {
    public int[] permutationEquation(int[] p) {

        List<Integer> collect = Arrays.stream(p).boxed().collect(Collectors.toList());
        List<Integer> ret = new ArrayList<>();

        for (int i = 1; i <= collect.size(); i++) {
            ret.add(collect.indexOf(collect.indexOf(i) + 1) + 1);
        }

        return ret.stream().mapToInt(i -> i).toArray();
    }

}
