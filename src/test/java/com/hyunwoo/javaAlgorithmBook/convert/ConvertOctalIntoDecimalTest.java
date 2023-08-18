package com.hyunwoo.javaAlgorithmBook.convert;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConvertOctalIntoDecimalTest {

    @Test
    void convertToDecimal() {
        var solution = new ConvertOctalIntoDecimal();

        assertEquals(15, solution.convertToDecimal("17"));
        assertEquals(30101, solution.convertToDecimal("72625"));
        assertEquals(156, solution.convertToDecimal("234"));
    }

}
