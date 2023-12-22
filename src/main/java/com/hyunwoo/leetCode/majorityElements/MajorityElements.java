//https://leetcode.com/problems/majority-element
package com.hyunwoo.leetCode.majorityElements;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MajorityElements {
    public int majorityElement(int[] nums) {

        Map<Integer, Long> map = IntStream.of(nums).boxed().collect(Collectors.groupingBy(e -> e, Collectors.counting()));
        Integer key = map.entrySet().stream().max((o1, o2) -> o1.getValue() > o2.getValue() ? 1 : -1).get().getKey();

        return key.intValue();
    }
}
