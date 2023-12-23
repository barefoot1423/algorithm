package com.hyunwoo.leetCode.interview150.p88;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MergeSortedArray {

    public void merge(int[] nums1, int m, int[] nums2, int n) {

        List<Integer> num1List = Arrays.stream(nums1).boxed().collect(Collectors.toList()).subList(0, m);
        List<Integer> num2List = Arrays.stream(nums2).boxed().collect(Collectors.toList()).subList(0, n);

        num1List.addAll(num2List);
        num1List.sort(Comparator.comparing(Integer::intValue));
        for (int i = 0; i < num1List.size(); i++) {
            nums1[i] = num1List.get(i);
        }

        Arrays.stream(nums1).forEach(s -> System.out.println(s));
    }

}
