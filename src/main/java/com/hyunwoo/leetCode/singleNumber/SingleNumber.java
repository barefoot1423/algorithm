package com.hyunwoo.leetCode.singleNumber;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SingleNumber {

    public int singleNumber(int[] nums) {

        Map<Integer, Integer> map = new HashMap<>();
        Arrays.stream(nums).forEach(i ->
            map.put(i, map.getOrDefault(i, 0) + 1)
        );

        for (int i : nums) {
            if (map.get(i).equals(1)) {
                return i;
            }
        }

        return 0;
    }

}
