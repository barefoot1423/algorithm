package com.hyunwoo.leetCode.interview150.p242;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {
    public boolean isAnagram(String s, String t) {

        char[] sCharArray = s.toCharArray();
        char[] tCharArray = t.toCharArray();

        Map<Character, Integer> map = new HashMap<>();

        if (sCharArray.length != tCharArray.length) {
            return false;
        }

        for (int i = 0; i < sCharArray.length; i++) {
            if (!map.containsKey(sCharArray[i])) {
                map.put(sCharArray[i], 1);
            } else {
                map.put(sCharArray[i], map.get(sCharArray[i]) + 1);
            }
        }

        for (int i = 0; i < tCharArray.length; i++) {
            if (map.containsKey(tCharArray[i])) {
                map.put(tCharArray[i], map.get(tCharArray[i]) - 1);
            }
        }

        return !map.values().stream().anyMatch(v -> v != 0);
    }

    public boolean isAnagram_1(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        char[] str1 = s.toCharArray();
        char[] str2 = t.toCharArray();
        Arrays.sort(str1);
        Arrays.sort(str2);

        return Arrays.equals(str1, str2);
    }
}
