//https://leetcode.com/problems/remove-element/

package com.hyunwoo.leetCode.RemoveElement;

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

        System.out.println(Arrays.toString(nums));

        return ret;
    }
}
