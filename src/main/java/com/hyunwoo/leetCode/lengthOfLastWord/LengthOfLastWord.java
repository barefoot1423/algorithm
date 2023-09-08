//https://leetcode.com/problems/length-of-last-word/
package com.hyunwoo.leetCode.lengthOfLastWord;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        List<String> list = Arrays.stream(s.split(" ")).filter( a -> a != "").map(a -> a.trim()).toList();
        return list.get(list.size() - 1).length();
    }
}
