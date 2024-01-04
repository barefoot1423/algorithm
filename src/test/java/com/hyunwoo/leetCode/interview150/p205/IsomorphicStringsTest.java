package com.hyunwoo.leetCode.interview150.p205;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IsomorphicStringsTest {

    @Test
    void isIsomorphic() {
        IsomorphicStrings isomorphicStrings = new IsomorphicStrings();

        assertEquals(true, isomorphicStrings.isIsomorphic("egg", "add"));
        assertEquals(false, isomorphicStrings.isIsomorphic("foo", "bar"));
        assertEquals(true, isomorphicStrings.isIsomorphic("paper", "title"));
    }

}
