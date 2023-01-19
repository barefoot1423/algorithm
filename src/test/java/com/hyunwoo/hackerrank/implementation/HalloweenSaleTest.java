package com.hyunwoo.hackerrank.implementation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HalloweenSaleTest {

    @Test
    public void howManyGames() {
        HalloweenSale halloweenSale = new HalloweenSale();
//        assertEquals(6, halloweenSale.howManyGames(20, 3, 6, 80));
        assertEquals(7, halloweenSale.howManyGames(20, 3, 6, 85));
    }
}
