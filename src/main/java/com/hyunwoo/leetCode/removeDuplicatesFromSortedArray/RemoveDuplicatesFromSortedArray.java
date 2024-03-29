//https://leetcode.com/problems/remove-duplicates-from-sorted-array/
package com.hyunwoo.leetCode.removeDuplicatesFromSortedArray;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesFromSortedArray {

    public int removeDuplicates(int[] nums) {

        Set<Integer> set = new HashSet<>();
        int j = 0;

        for (int i = 0; i < nums.length; i++) {
            if (!set.contains(nums[i])) {
                set.add(nums[i]);
                nums[j++] = nums[i];
            }
        }

        return set.size();
    }

}
