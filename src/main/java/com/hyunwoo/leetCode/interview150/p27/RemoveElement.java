package com.hyunwoo.leetCode.interview150.p27;

import java.util.Arrays;

public class RemoveElement {
    public int removeElement(int[] nums, int val) {

        int ret = 0;

        nums = Arrays.stream(nums).filter(n -> n != val).toArray();
        Arrays.stream(nums).forEach(s -> System.out.println(s));
        ret = (int) Arrays.stream(nums).count();
        System.out.println(ret);
        return ret;
    }
}
