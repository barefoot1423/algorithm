//https://leetcode.com/problems/remove-duplicates-from-sorted-array/
package com.hyunwoo.leetCode.RemoveDuplicatesFromSortedArray;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesFromSortedArray {

    public int removeDuplicates(int[] nums) {

        Set set = new HashSet<Integer>();

        for (int i = 0; i < nums.length; i++) {
            if (!set.contains(nums[i])) {
                set.add(nums[i]);
            }
        }

        return set.size();
    }

}
