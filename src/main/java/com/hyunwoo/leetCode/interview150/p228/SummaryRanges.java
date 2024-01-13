package com.hyunwoo.leetCode.interview150.p228;

import java.util.ArrayList;
import java.util.List;

public class SummaryRanges {

    public List<String> summaryRanges(int[] nums) {

        List<String> arrayList = new ArrayList<>();

        if (nums.length == 0) {
            return arrayList;
        }

        int lastNum = nums[nums.length - 1];

        boolean isConsecutive = false;
        StringBuilder ret = new StringBuilder();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != lastNum) {
                if (nums[i] + 1 == nums[i + 1] && !isConsecutive) {
                    ret.append(nums[i]);
                    isConsecutive = true;
                } else if (nums[i] + 1 != nums[i + 1] && !isConsecutive) {
                    ret.append(nums[i]);
                    arrayList.add(ret.toString());
                    ret = new StringBuilder();
                    isConsecutive = false;
                } else if (nums[i] + 1 != nums[i + 1] && isConsecutive) {
                    ret.append("->" + nums[i]);
                    arrayList.add(ret.toString());
                    ret = new StringBuilder();
                    isConsecutive = false;
                }
            } else {
                if (isConsecutive) {
                    ret.append("->" + nums[i]);
                    arrayList.add(ret.toString());
                } else {
                    ret.append(nums[i]);
                    arrayList.add(ret.toString());
                }
            }

        }

        return arrayList;
    }

}
