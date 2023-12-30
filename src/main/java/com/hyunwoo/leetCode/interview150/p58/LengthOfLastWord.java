package com.hyunwoo.leetCode.interview150.p58;

import java.util.Arrays;
import java.util.List;

public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {

        List<String> list = Arrays.stream(s.split(" ")).map(String::trim).toList();

        return list.get(list.size() - 1).length();
    }
}
