package com.hyunwoo.hackerrank.implementation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LibraryFineTest {

    @Test
    public void libraryFine() {
        LibraryFine libraryFine = new LibraryFine();
        assertEquals(45, libraryFine.libraryFine(9, 6, 2015, 6, 6, 2015));
        assertEquals(10000, libraryFine.libraryFine(9, 6, 2016, 6, 6, 2015));
        assertEquals(10000, libraryFine.libraryFine(1, 1, 2018, 31, 12, 2017));
        assertEquals(15, libraryFine.libraryFine(31, 12, 2017, 30, 12, 2017));
        assertEquals(0, libraryFine.libraryFine(30, 12, 2017, 30, 12, 2017));
        assertEquals(3000, libraryFine.libraryFine(2, 7, 1014, 1, 1, 1014));
        assertEquals(1500, libraryFine.libraryFine(5, 5, 2014, 23, 2, 2014));
    }
}
