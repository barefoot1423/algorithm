package com.hyunwoo.hackerrank.implementation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ACMICPCTeamTest {

    @Test
    public void acmTeam() {
        ACMICPCTeam acmicpcTeam = new ACMICPCTeam();

        String[] strings = new String[] {"10101", "11100", "11010", "00101"};

        assertArrayEquals(new int[]{5, 2}, acmicpcTeam.acmTeam(strings));
    }

}
