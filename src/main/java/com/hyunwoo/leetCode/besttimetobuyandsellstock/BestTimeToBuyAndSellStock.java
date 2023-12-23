//https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
package com.hyunwoo.leetCode.besttimetobuyandsellstock;

public class BestTimeToBuyAndSellStock {

    public int maxProfit(int[] prices) {

        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int price : prices) {
            if (minPrice > price) {
                minPrice = price;
            } else if (price - minPrice > maxProfit) {
                maxProfit = price - minPrice;
            }
        }

        return maxProfit;
    }

}
