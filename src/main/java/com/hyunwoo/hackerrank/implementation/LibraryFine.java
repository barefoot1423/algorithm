package com.hyunwoo.hackerrank.implementation;


import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

// https://www.hackerrank.com/challenges/library-fine/problem
public class LibraryFine {
    public int libraryFine(int d1, int m1, int y1, int d2, int m2, int y2) {

        LocalDate returnedDate = LocalDate.of(y1, m1, d1);
        LocalDate dueDate = LocalDate.of(y2, m2, d2);

        if (returnedDate.isBefore(dueDate) || returnedDate.isEqual(dueDate)) {
            return 0;
        } else {
            if (returnedDate.getYear() == dueDate.getYear() && returnedDate.getMonthValue() == dueDate.getMonthValue()) {
                return (int) Math.abs(ChronoUnit.DAYS.between(returnedDate, dueDate) * 15);
            } else if (returnedDate.getYear() == dueDate.getYear()) {
                return Math.abs(returnedDate.getMonthValue() - dueDate.getMonthValue()) * 500;
            } else {
                return 10000;
            }
        }
    }
}
