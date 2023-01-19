package com.hyunwoo.hackerrank.implementation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class JumpingOnTheCloudTest {

    @Test
    public void jumpingOnClouds() {
        JumpingOnTheCloud jumpingOnTheCloud = new JumpingOnTheCloud();
        assertEquals(4, jumpingOnTheCloud.jumpingOnClouds(new int[] {0, 0, 1, 0, 0, 1, 0}));
        assertEquals(3, jumpingOnTheCloud.jumpingOnClouds(new int[] {0, 0, 0, 0, 1, 0}));
    }
}
