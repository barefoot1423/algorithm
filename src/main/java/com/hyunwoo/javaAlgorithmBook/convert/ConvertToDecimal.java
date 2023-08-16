package com.hyunwoo.javaAlgorithmBook.convert;

public class ConvertToDecimal {

    public int convertToDecimal(String binary) {
        int conversion = 1;
        int ret = 0;

        for (int i = 1; i <= binary.length(); i++) {
            if (binary.charAt(binary.length() - i) == '1') {
                ret += conversion;
            }
            conversion = 2 * conversion;
        }
        return ret;
    }

}
