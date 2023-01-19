package com.hyunwoo.hackerrank.implementation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class CavityMapTest {

    @Test
    public void cavityMap() {
        CavityMap cavityMap = new CavityMap();
        assertArrayEquals(new String[]{"1112", "1X12", "18X2", "1234"}, cavityMap.cavityMap(new String[]{"1112", "1912", "1892", "1234"}));
    }

}
