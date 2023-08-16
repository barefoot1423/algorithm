package com.hyunwoo.javaAlgorithmBook.convert;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConvertToDecimalTest {

    @Test
    void convertToDecimal() {
        var solution = new ConvertToDecimal();

        assertEquals(22, solution.convertToDecimal("10110"));
    }

}
