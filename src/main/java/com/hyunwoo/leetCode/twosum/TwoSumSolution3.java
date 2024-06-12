package com.hyunwoo.leetCode.twosum;

import java.util.HashMap;

public class TwoSumSolution3 {

    public static int[] TwoSum(int[] nums, int target) {
        int[] res = new int[] {0, 0};
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i]) && map.get(target - nums[i]) != i) {
                res[0] = i;
                res[1] = map.get(target - nums[i]);
                return res;
            }
        }

        return res;
    }

}
