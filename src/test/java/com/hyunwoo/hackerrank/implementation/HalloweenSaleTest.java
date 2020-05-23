package com.hyunwoo.hackerrank.implementation;

import org.junit.Test;

import static org.junit.Assert.*;

public class HalloweenSaleTest {

    @Test
    public void howManyGames() {
        HalloweenSale halloweenSale = new HalloweenSale();
        assertEquals(6, halloweenSale.howManyGames(20, 3, 6, 80));
    }
}
