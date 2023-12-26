package com.hyunwoo.leetCode.interview150.p27;

import java.util.Arrays;

public class RemoveElement {
    public int removeElement(int[] nums, int val) {

        int ret = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
            } else {
                nums[ret] = nums[i];
                ret++;
            }
        }

        return ret;
    }
}
