package com.hyunwoo.javaAlgorithmBook.convert;

public class ConvertOctalIntoDecimal {

    public int convertToDecimal(String octal) {
        int conversion = 1;
        int ret = 0;

        for (int i = 1; i <= octal.length(); i++) {
            if (octal.charAt(octal.length() - i) != '0') {
                int num = Integer.parseInt(String.valueOf(octal.charAt(octal.length() - i)));
                ret += conversion * num;
            }
            conversion *= 8;
        }

        return ret;
    }
}
