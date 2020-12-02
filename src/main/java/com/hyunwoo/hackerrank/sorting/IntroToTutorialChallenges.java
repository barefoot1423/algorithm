package com.hyunwoo.hackerrank.sorting;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class IntroToTutorialChallenges {

    static int introTutorial(int v, int[] arr) {
        List<Integer> collect = Arrays.stream(arr).boxed().collect(Collectors.toList());

        return IntStream.range(0, collect.size())
            .filter(i -> Integer.valueOf(v).equals(collect.get(i)))
            .findFirst()
            .getAsInt();
    }

}
