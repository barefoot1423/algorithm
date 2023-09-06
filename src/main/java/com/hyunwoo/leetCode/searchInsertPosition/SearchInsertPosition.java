//https://leetcode.com/problems/search-insert-position/
package com.hyunwoo.leetCode.searchInsertPosition;

public class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        int end = nums.length - 1;
        int start = 0;

        while (start <= end) {
            int mid = (end - start) / 2 + start;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                int foundIndex = checkIndex(nums, target, mid);
                if (foundIndex != -1) {
                    return foundIndex;
                }
                end = mid - 1;
            } else {
                int foundIndex = checkIndex(nums, target, mid);
                if (foundIndex != -1) {
                    return foundIndex;
                }
                start = mid + 1;
            }
        }

        if (nums[nums.length - 1] < target) {
            return nums.length;
        }

        return 0;
    }

    private static int checkIndex(int[] nums, int target, int mid) {
        if (mid - 1 >= 0 && mid + 1 <= nums.length) {
            if (nums[mid -1] < target && nums[mid] > target) {
                return mid ;
            }
        }
        return -1;
    }

}
