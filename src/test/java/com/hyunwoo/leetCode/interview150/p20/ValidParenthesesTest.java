package com.hyunwoo.leetCode.interview150.p20;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidParenthesesTest {

    @Test
    void isValid() {
        var validParentheses = new ValidParentheses();

        assertEquals(true, validParentheses.isValid("()[]{}"));
        assertEquals(false, validParentheses.isValid("[}"));
        assertEquals(true, validParentheses.isValid("()"));
    }

}
