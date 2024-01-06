package com.hyunwoo.leetCode.interview150.p209;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WordPattern {
    public boolean wordPattern(String pattern, String s) {

        char[] patternCharArray = pattern.toCharArray();
        List<String> sList = Arrays.stream(s.split(" ")).toList();

        Map<Character, Integer> patternMap = new HashMap<>();
        Map<String, Integer> sMap = new HashMap<>();

        StringBuilder pString = new StringBuilder();
        for (int i = 0; i < patternCharArray.length; i++) {
            char pChar = patternCharArray[i];
            if (!patternMap.containsKey(pChar)) {
                patternMap.put(pChar, i);
                pString.append(i);
            } else {
                pString.append(patternMap.get(pChar)).append("#");
            }
        }

        StringBuilder sString = new StringBuilder();
        for (int i = 0; i < sList.size(); i++) {
            if (!sMap.containsKey(sList.get(i))) {
                sMap.put(sList.get(i), i);
                sString.append(i);
            } else {
                sString.append(sMap.get(sList.get(i))).append("#");
            }
        }

        return pString.toString().equals(sString.toString());
    }
}
