package com.hyunwoo.leetCode.interview150.p219;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ContainsDuplicate {

    public boolean containsNearbyDuplicate(int[] nums, int k) {

        Map<Integer, List<Integer>> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int n = nums[i];
            if (!map.containsKey(n)) {
                map.put(n, new ArrayList<>(5));
                map.get(n).add(i);
            } else {
                map.get(n).add((i));
            }
        }

        List<Map.Entry<Integer, List<Integer>>> collect = map.entrySet().stream().filter(m -> m.getValue().size() > 1).collect(Collectors.toList());

        for (int i = 0; i < collect.size(); i++) {
            List<Integer> value = collect.get(i).getValue();
            for (int j = 0; j < value.size() - 1; j++) {
                if (Math.abs(value.get(j) - value.get(j + 1)) <= k) {
                    return true;
                }
            }

        }
        return false;
    }

}
