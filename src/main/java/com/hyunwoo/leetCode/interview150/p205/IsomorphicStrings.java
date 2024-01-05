package com.hyunwoo.leetCode.interview150.p205;

import java.util.HashMap;
import java.util.Map;

public class IsomorphicStrings {
    public boolean isIsomorphic(String s, String t) {

        char[] sCharArray = s.toCharArray();
        char[] tCharArray = t.toCharArray();

        Map<Character, Integer> smap = new HashMap<>();
        Map<Character, Integer> tmap = new HashMap<>();

        return returnString(sCharArray, smap).equals(returnString(tCharArray, tmap));
    }

    private String returnString(char[] sCharArray, Map<Character, Integer> smap) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < sCharArray.length; i++) {
            char sc = sCharArray[i];
            if (!smap.containsKey(sc)) {
                smap.put(sc, i);
                sb.append(i);
            } else {
                sb.append(smap.get(sc)).append(",");
            }
        }

        System.out.println(sb);

        return sb.toString();
    }

}
