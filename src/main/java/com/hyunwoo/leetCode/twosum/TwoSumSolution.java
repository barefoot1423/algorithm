package com.hyunwoo.leetCode.twosum;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TwoSumSolution {

    public static int[] twoSum(int[] nums, int target) {

        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] {i, j};
                }
            }
        }

        return null;
    }

}
