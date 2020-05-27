package com.hyunwoo.hackerrank.implementation;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

// https://www.hackerrank.com/challenges/acm-icpc-team/problem
public class ACMICPCTeam {
    public int[] acmTeam(String[] topic) {

        // This is not my solution, but it is worth to keep and think about how other people resolve this issue.
        // I need to implement it again.
        int n = topic.length;
        BigInteger[] bi = new BigInteger[n];

        for (int i = 0; i < n; i++) {
            bi[i] = new BigInteger(topic[i], 2);
        }

        int maxTopic = 0;
        int teamCount = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                BigInteger iuj = bi[i].or(bi[j]);
                int bitCount = iuj.bitCount();
                if (bitCount > maxTopic) {
                    maxTopic = bitCount;
                    teamCount = 1;
                } else if (bitCount == maxTopic) {
                    teamCount++;
                }
            }
        }

        int result[] = {maxTopic, teamCount};
        return result;
    }

}
