package com.hyunwoo.hackerrank.implementation;

import java.time.LocalDate;
import java.time.Year;

public class DayOfTheProgrammer {

    public String dayOfProgrammer(int year) {
        LocalDate localDate;

        if (year == 1918) {
            localDate = Year.of(year).atDay(256 + 13);
        } else if (year % 100 == 0 && year < 1918) {
            localDate = Year.of(year).atDay(256 - 1);
        } else {
            localDate = Year.of(year).atDay(256);
        }

        String monthValue;
        if (String.valueOf(localDate.getMonthValue()).length() == 1) {
            monthValue = "0" + localDate.getMonthValue();
        } else {
            monthValue = String.valueOf(localDate.getMonthValue());
        }

        return localDate.getDayOfMonth() + "." + monthValue + "." + localDate.getYear();
    }
}
