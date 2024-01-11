package com.hyunwoo.leetCode.interview150.p202;

import java.util.List;
import java.util.stream.Collectors;

public class HappyNumber {
    public boolean isHappy(int n) {

        boolean ret = true;
        int sum = 0;

        if (n == 1 ) {
            return true;
        }

        List<Integer> collect = String.valueOf(n).chars().map(Character::getNumericValue).boxed().collect(Collectors.toList());

        while (collect.stream().mapToInt(Integer::intValue).sum() != 1) {

            for (Integer num : collect) {
                sum += Math.pow(num, 2);
            }
            System.out.println(sum);


            collect = String.valueOf(sum).chars().map(Character::getNumericValue).boxed().collect(Collectors.toList());
            sum = 0;
        }

        return ret;
    }
}
