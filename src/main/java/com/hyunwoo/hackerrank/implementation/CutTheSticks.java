package com.hyunwoo.hackerrank.implementation;

// https://www.hackerrank.com/challenges/cut-the-sticks/problem

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CutTheSticks {

    public int[] cutTheSticks(int[] arr) {

        List<Integer> sticks = Arrays.stream(arr).boxed().sorted().collect(Collectors.toList());
        List<Integer> ret = new ArrayList<>();

        do {
            ret.add(sticks.size());
            if (sticks.contains(sticks.get(0))) {
                Integer removalNumber = sticks.get(0);
                sticks.removeAll(Arrays.asList(removalNumber));
                sticks.replaceAll(integer -> integer - removalNumber);
            }

        } while (sticks.size() > 0);

        int[] ints = ret.stream().mapToInt(i -> i).toArray();
        return ints;
    }

}
