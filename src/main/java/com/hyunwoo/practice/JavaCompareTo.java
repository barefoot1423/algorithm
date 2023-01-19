package com.hyunwoo.practice;

import java.math.BigDecimal;

public class JavaCompareTo {

    public BigDecimal calculate(BigDecimal payment, BigDecimal currentBal, BigDecimal collectionBalance){
        return null;
    }

    public static void main(String[] args) {
        BigDecimal a = new BigDecimal(-100);
        BigDecimal b = new BigDecimal(0);

        System.out.println(a.compareTo(b));

        if (a.compareTo(b) == -1) {
            System.out.println("-11");
        } else if (a.compareTo(b) == 1) {
            System.out.println("11");
        } else {
            System.out.println("0");
        }
    }

}
