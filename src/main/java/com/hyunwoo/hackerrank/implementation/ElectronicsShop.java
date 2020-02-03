package com.hyunwoo.hackerrank.implementation;

// https://www.hackerrank.com/challenges/electronics-shop/problem


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ElectronicsShop {

    public int getMoneySpent(int[] keyboards, int[] drives, int b) {

        List<Integer> keyboardList = Arrays.stream(keyboards).boxed().sorted().collect(Collectors.toList());
        List<Integer> driveList = Arrays.stream(drives).boxed().collect(Collectors.toList());
        int max = -1;

        for (Integer keyboard : keyboardList) {
            for (Integer drive : driveList) {
                int sum = keyboard + drive;
                if (sum <= b && sum > max) {
                    max = sum;
                }
            }
        }

        return max;
    }

}

