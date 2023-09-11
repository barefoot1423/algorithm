//https://leetcode.com/problems/plus-one/
package com.hyunwoo.leetCode.plusOne;

import java.util.Arrays;

public class PlusOne {

    public int[] plusOne(int[] digits) {
        StringBuilder num = new StringBuilder();
        Arrays.stream(digits).forEach(s -> num.append(s));
        String returnNum = String.valueOf(Long.parseLong(num.toString()) + 1);
        String[] stringReturn = returnNum.split("");
        System.out.println(Arrays.toString(stringReturn));
        int[] array = Arrays.stream(stringReturn).mapToInt(s -> Integer.parseInt(s)).toArray();



        System.out.println(Arrays.toString(array));
        return array;
    }

}
