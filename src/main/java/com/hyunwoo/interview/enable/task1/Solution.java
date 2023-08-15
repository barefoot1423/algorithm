package com.hyunwoo.interview.enable.task1;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

// You can find the description for this task in Notion under Algorithm page
public class Solution {
    public String solution (String s) {

        // 1. insert each number into a hash table
        //    For example, "82388"
        //    key value
        //    2   1
        //    3   1
        //    8   3
        // 2. find the largest number containing 2 or more digits within the value
        // 3. place the large number with values 2 or more starting from the largest, at the font and the back.
        // 4. return the value
        HashMap<String, Integer> hash = new HashMap<>();
//        Arrays.stream(Arrays.asList(s.split("")).stream().mapToInt(Integer::parseInt).toArray()).collect(Collectors.toList());

        List<String> list = Arrays.asList(s.split(""));
//        Collections.sort(list.stream().mapToInt(Integer::valueOf).collect(Collectors.<Object>toList()));

        Arrays.stream(s.split("")).sorted(Comparator.reverseOrder()).forEach(a -> {
            if (!hash.containsKey(a)) {
                hash.put(a, 1);
            } else {
                hash.put(a, hash.get(a) + 1);
            }
        });





        return null;
    }
}
