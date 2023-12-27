package com.hyunwoo.leetCode.interview150.p26;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesFromSortedArray {

    public int removeDuplicates(int[] nums) {

        int ret = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] != nums[i]) {
                nums[ret] = nums[i];
                ret++;
            }
        }

        return ret;

    }

}
