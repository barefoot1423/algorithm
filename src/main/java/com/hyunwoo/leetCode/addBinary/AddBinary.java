//https://leetcode.com/problems/add-binary/
package com.hyunwoo.leetCode.addBinary;

import java.math.BigInteger;

public class AddBinary {
    public String addBinary(String a, String b) {
        return new BigInteger(a, 2).add(new BigInteger(b, 2)).toString(2);
    }
}
