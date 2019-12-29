package com.hyunwoo.hackerrank.implementation;

import org.junit.Test;

import static org.junit.Assert.*;

public class DayOfTheProgrammerTest {

    @Test
    public void dayOfProgrammer() {
        DayOfTheProgrammer dayOfTheProgrammer = new DayOfTheProgrammer();
        assertEquals("12.09.2016", dayOfTheProgrammer.dayOfProgrammer(2016));
        assertEquals("12.09.1800", dayOfTheProgrammer.dayOfProgrammer(1800));
        assertEquals("13.09.1917", dayOfTheProgrammer.dayOfProgrammer(1917));
        assertEquals("12.09.2000", dayOfTheProgrammer.dayOfProgrammer(2000));
        assertEquals("13.09.2100", dayOfTheProgrammer.dayOfProgrammer(2100));
        assertEquals("26.09.1918", dayOfTheProgrammer.dayOfProgrammer(1918));

    }
}
