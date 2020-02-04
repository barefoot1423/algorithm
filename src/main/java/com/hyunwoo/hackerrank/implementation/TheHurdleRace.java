package com.hyunwoo.hackerrank.implementation;

// https://www.hackerrank.com/challenges/the-hurdle-race/problem

import java.util.Arrays;
import java.util.Optional;

public class TheHurdleRace {

    public int hurdleRace(int k, int[] height) {
        Optional<Integer> max = Arrays.stream(height).boxed().max(Integer::compareTo);

        return max.get() - k < 0 ? 0 : max.get() - k;
    }
}
