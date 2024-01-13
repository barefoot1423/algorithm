package com.hyunwoo.leetCode.interview150.p228;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SummaryRangesTest {

    @Test
    void summaryRanges() {
        SummaryRanges summaryRanges = new SummaryRanges();
        List<String> list1 = new ArrayList<>();
        list1.add("0->2");
        list1.add("4->5");
        list1.add("7");
        assertEquals(list1, summaryRanges.summaryRanges(new int[] {0, 1, 2, 4, 5, 7}));

        List<String> list2 = new ArrayList<>();
        list2.add("0");
        list2.add("2->4");
        list2.add("6");
        list2.add("8->9");
        assertEquals(list2, summaryRanges.summaryRanges(new int[] {0, 2, 3, 4, 6, 8, 9}));

        List<String> list3 = new ArrayList<>();
        assertEquals(list3, summaryRanges.summaryRanges(new int[] {}));
    }

}
