package com.hyunwoo.leetCode.twosum;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class TwoSumSolutionTest {

    @Test
    public void twoSum() {
        Assert.assertEquals(Arrays.equals(TwoSumSolution.twoSum(new int[] {2, 7, 11, 15}, 9), new int[] {0, 1}), true);
    }

}
