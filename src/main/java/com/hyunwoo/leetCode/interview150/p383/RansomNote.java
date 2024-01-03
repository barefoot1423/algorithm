package com.hyunwoo.leetCode.interview150.p383;

import java.util.HashMap;
import java.util.Map;

public class RansomNote {
    public boolean canConstruct(String ransomNote, String magazine) {

        Map<Character, Integer> map = new HashMap<>();

        char[] ransomNoteCharArray = ransomNote.toCharArray();
        char[] magazineCharArray = magazine.toCharArray();

        for (char c : ransomNoteCharArray) {
            if (!map.containsKey(c)) {
                map.put(c, 1);
            } else {
                map.put(c, map.get(c) + 1);
            }
        }

        for (char c : magazineCharArray) {
            if (map.containsKey(c)) {
                map.replace(c, map.get(c) - 1);
            }
        }

        return map.values().stream().noneMatch(integer -> integer > 0);
    }

}
