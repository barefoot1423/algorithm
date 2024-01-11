package com.hyunwoo.leetCode.interview150.p202;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class HappyNumber {
    public boolean isHappy(int n) {

        int sum = 0;

        List<Integer> collect = String.valueOf(n).chars().map(Character::getNumericValue).boxed().collect(Collectors.toList());
        Set<Integer> valueSet = new HashSet<>();

        while (!valueSet.contains(sum)) {

            for (Integer num : collect) {
                sum += Math.pow(num, 2);
            }

            collect = String.valueOf(sum).chars().map(Character::getNumericValue).boxed().collect(Collectors.toList());
            if (collect.stream().mapToInt(Integer::intValue).sum() == 1) {
                return true;
            } else {
                if (!valueSet.contains(sum)) {
                    valueSet.add(sum);
                } else {
                    return false;
                }
            }
            sum = 0;
        }

        return false;
    }
}
