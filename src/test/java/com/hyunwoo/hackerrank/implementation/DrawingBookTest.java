package com.hyunwoo.hackerrank.implementation;

import org.junit.Test;

import static org.junit.Assert.*;

public class DrawingBookTest {

    @Test
    public void pageCount() {
        DrawingBook drawingBook = new DrawingBook();
        assertEquals(1, drawingBook.pageCount(6, 2));
        assertEquals(0, drawingBook.pageCount(5, 4));
    }

}
