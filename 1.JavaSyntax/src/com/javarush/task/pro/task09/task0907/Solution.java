package com.javarush.task.pro.task09.task0907;

import java.util.regex.Pattern;

/* 
Шестнадцатеричный конвертер
*/

public class Solution {
    private static final String HEX = "0123456789abcdef";

    public static void main(String[] args) {
        int decimalNumber = 1256;
        System.out.println("Десятичное число " + decimalNumber + " равно шестнадцатеричному числу " + toHex(decimalNumber));
        String hexNumber = "4e8";
        System.out.println("Шестнадцатеричное число " + hexNumber + " равно десятичному числу " + toDecimal(hexNumber));
    }

    public static String toHex(int decimalNumber) {
        //напишите тут ваш код
        String hexN = "";
        if (decimalNumber <= 0) return "";
        while (decimalNumber != 0){
            hexN = HEX.charAt(decimalNumber % 16) + hexN;
            decimalNumber = decimalNumber / 16;
        }
        return hexN;
    }

    public static int toDecimal(String hexNumber) {
        //напишите тут ваш код
        int decimalN = 0;
        if (hexNumber == "" || hexNumber == null) return 0;
        for (int i = 0; i < hexNumber.length(); i++) {
            decimalN = 16 * decimalN + HEX.indexOf(hexNumber.charAt(i));
        }
        return decimalN;
    }
}
