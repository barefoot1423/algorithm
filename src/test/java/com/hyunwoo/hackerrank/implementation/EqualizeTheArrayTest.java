package com.hyunwoo.hackerrank.implementation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EqualizeTheArrayTest {

    @Test
    public void equalizeArray() {
        EqualizeTheArray equalizeTheArray = new EqualizeTheArray();

        assertEquals(2, equalizeTheArray.equalizeArray(new int[] {3, 3, 2, 1, 3}));
        assertEquals(4, equalizeTheArray.equalizeArray(new int[] {1, 2, 3, 1, 2, 3, 3, 3}));
    }
}
