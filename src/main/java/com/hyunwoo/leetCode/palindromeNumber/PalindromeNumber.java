//https://leetcode.com/problems/palindrome-number/
package com.hyunwoo.leetCode.palindromeNumber;

import java.util.ArrayList;
import java.util.List;

public class PalindromeNumber {

    public boolean isPalindrome(int x) {

        String numString = Integer.toString(x);
        List<Character> numStringList = new ArrayList<>();

        for (int i = 0; i < numString.length(); i++) {
            numStringList.add(numString.charAt(i));
        }

        for (int i = 0, j = numStringList.size() - 1; i < numStringList.size() && i != j; i++, j--) {
            if (!numStringList.get(i).equals(numStringList.get(j))) {
                return false;
            }
        }

        return true;
    }

}
