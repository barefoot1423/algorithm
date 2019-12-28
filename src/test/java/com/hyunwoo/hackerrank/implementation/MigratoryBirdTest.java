package com.hyunwoo.hackerrank.implementation;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class MigratoryBirdTest {

    @Test
    public void migratoryBirds() {
        Integer[] ints = { 1, 1, 2, 2, 3 };

        List<Integer> list = Arrays.asList(ints);

        MigratoryBird migratoryBird = new MigratoryBird();
        int i = migratoryBird.migratoryBirds(list);
        assertEquals(1, i);
    }
}
