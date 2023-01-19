//https://leetcode.com/problems/two-sum/
package com.hyunwoo.leetCode.twosum;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSumSolution {

    public static int[] twoSumNSquare(int[] nums, int target) {

        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] {i, j};
                }
            }
        }

        return null;
    }

    public int[] twoSumHash(int[] nums, int target) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(nums[i])) {
                map.put(nums[i], i);
            }
        }

        for (int j = 0; j < nums.length; j++) {
            int key = target - nums[j];
            if (map.containsKey(key) && map.get(key) != j) {
                return Arrays.stream(new int[] {j, map.get(key)}).sorted().toArray();
//                return new int[] {j, map.get(key)};
            }
        }

        return null;


    }

}
