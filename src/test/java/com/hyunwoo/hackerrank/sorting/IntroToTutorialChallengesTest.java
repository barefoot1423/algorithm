package com.hyunwoo.hackerrank.sorting;

import org.junit.Test;

import static org.junit.Assert.*;

public class IntroToTutorialChallengesTest {

    @Test
    public void introTutorial() {
        IntroToTutorialChallenges intro = new IntroToTutorialChallenges();
        assertEquals(1, intro.introTutorial(4, new int[] {1, 4, 5, 7, 9, 12}));
    }

}
