package com.hyunwoo.leetCode.interview150.p1;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(nums[i])) {
                map.put(nums[i], i);
            }
        }

        for (int i = 0; i < nums.length; i++) {
            int findNum = target - nums[i];
            if (map.containsKey(findNum) && map.get(findNum) != i) {
                System.out.println(i + " " + map.get(findNum));
                return new int[] {i, map.get(findNum)};
            }
        }

        return null;
    }

}
