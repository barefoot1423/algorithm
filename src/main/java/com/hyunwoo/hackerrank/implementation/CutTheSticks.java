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

        List<Integer> ii = new ArrayList<>();


        return null;
    }

}
