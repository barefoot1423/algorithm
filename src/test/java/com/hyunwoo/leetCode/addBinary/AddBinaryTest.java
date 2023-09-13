package com.hyunwoo.leetCode.addBinary;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddBinaryTest {

    @Test
    void addBinary() {
        AddBinary addBinary = new AddBinary();
        assertEquals("100", addBinary.addBinary("11", "1"));
    }

}
