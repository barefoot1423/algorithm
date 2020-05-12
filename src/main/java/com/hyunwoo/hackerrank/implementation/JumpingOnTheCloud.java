package com.hyunwoo.hackerrank.implementation;

//https://www.hackerrank.com/challenges/jumping-on-the-clouds/problem

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JumpingOnTheCloud {

    static int jumpingOnClouds(int[] list) {

        int numOfJump = 0;

        for (int i = 0; i <= list.length - 1; ) {
            if (i + 2 <= list.length - 1 && list[i + 2] == 0) {
                i += 2;
                numOfJump++;
            } else if (i + 1 <= list.length - 1 && list[i + 1] == 0) {
                i++;
                numOfJump++;
            } else {
                i++;
            }
        }

        return numOfJump;
    }

}
