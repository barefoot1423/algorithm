package com.hyunwoo.leetCode.singleNumber;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SingleNumber {

    public int singleNumber(int[] nums) {

        int ret = 0;

        for (int num : nums) {
            ret ^= num;
        }

        return ret;
    }

}
