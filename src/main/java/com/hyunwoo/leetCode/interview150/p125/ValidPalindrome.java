package com.hyunwoo.leetCode.interview150.p125;

import java.util.List;

public class ValidPalindrome {
    public boolean isPalindrome(String s) {

        List<Integer> list = s.toLowerCase().chars().boxed().filter(c -> (c.intValue() >= 97 && c.intValue() <= 122) || (c.intValue() >= 48 && c.intValue() <= 57)).toList();

        if (list.size() == 1 || list.size() == 0) {
            return true;
        }

        for (int i = 0; i < list.size() / 2; i++) {
            if (!list.get(i).equals(list.get(list.size() - 1 - i))) {
                return false;
            }
        }

        return true;
    }
}
