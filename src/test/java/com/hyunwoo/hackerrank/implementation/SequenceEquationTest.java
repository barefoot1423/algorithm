package com.hyunwoo.hackerrank.implementation;

import org.junit.Test;

import static org.junit.Assert.*;

public class SequenceEquationTest {

    @Test
    public void permutationEquation() {
        SequenceEquation sequenceEquation = new SequenceEquation();
        assertArrayEquals(new int[] {1, 3, 5, 4, 2}, sequenceEquation.permutationEquation(new int[] {4, 3, 5, 1, 2}));
    }

}
