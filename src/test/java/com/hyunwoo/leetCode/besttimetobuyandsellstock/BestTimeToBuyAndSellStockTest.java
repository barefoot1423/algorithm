package com.hyunwoo.leetCode.besttimetobuyandsellstock;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BestTimeToBuyAndSellStockTest {

    @Test
    void maxProfit() {
        BestTimeToBuyAndSellStock bestTimeToBuyAndSellStock = new BestTimeToBuyAndSellStock();
        assertEquals(5, bestTimeToBuyAndSellStock.maxProfit(new int[] {7, 1, 5, 3, 6, 4}));
        assertEquals(0, bestTimeToBuyAndSellStock.maxProfit(new int[] {7, 6, 4, 3, 1}));
        assertEquals(3, bestTimeToBuyAndSellStock.maxProfit(new int[] {1, 2, 4}));
        assertEquals(2, bestTimeToBuyAndSellStock.maxProfit(new int[] {2, 4, 1}));
    }

}
