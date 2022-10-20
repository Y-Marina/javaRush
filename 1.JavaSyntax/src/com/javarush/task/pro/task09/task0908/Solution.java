package com.javarush.task.pro.task09.task0908;

import java.util.regex.Pattern;

/* 
Двоично-шестнадцатеричный конвертер
*/

public class Solution {

    public static void main(String[] args) {
        String binaryNumber = "100111010000";
        System.out.println("Двоичное число " + binaryNumber + " равно шестнадцатеричному числу " + toHex(binaryNumber));
        String hexNumber = "9d0";
        System.out.println("Шестнадцатеричное число " + hexNumber + " равно двоичному числу " + toBinary(hexNumber));
        
    }

    public static String toHex(String binaryNumber) {
        //напишите тут ваш код
        String hexN = "";
        if (binaryNumber == null || binaryNumber.isEmpty()) return hexN;
        String[] array = binaryNumber.split("");

        for (int i = 0; i < array.length; i++) {
            String a = binaryNumber.substring(i, i + 1);
            if (a.matches("[^0-1]+")){
                return "";
            }
        }
        if (binaryNumber.length() % 4 != 0) {
            int count = 4 - (binaryNumber.length() % 4);
            for (int i = 0; i < count; i++) {
                binaryNumber = "0" + binaryNumber;
            }
        }
        for (int i = 0; i < binaryNumber.length(); i+=4) {
            String s = binaryNumber.substring(i, i + 4);
            if (s.equals("0000")){
                hexN = hexN + "0";
            }
            if (s.equals("0001")){
                hexN = hexN + "1";
            }
            if (s.equals("0010")){
                hexN = hexN + "2";
            }
            if (s.equals("0011")){
                hexN = hexN + "3";
            }
            if (s.equals("0100")){
                hexN = hexN + "4";
            }
            if (s.equals("0101")){
                hexN = hexN + "5";
            }
            if (s.equals("0110")){
                hexN = hexN + "6";
            }
            if (s.equals("0111")){
                hexN = hexN + "7";
            }
            if (s.equals("1000")){
                hexN = hexN + "8";
            }
            if (s.equals("1001")){
                hexN = hexN + "9";
            }
            if (s.equals("1010")){
                hexN = hexN + "a";
            }
            if (s.equals("1011")){
                hexN = hexN + "b";
            }
            if (s.equals("1100")){
                hexN = hexN + "c";
            }
            if (s.equals("1101")){
                hexN = hexN + "d";
            }
            if (s.equals("1110")){
                hexN = hexN + "e";
            }
            if (s.equals("1111")){
                hexN = hexN + "f";
            }

        }
        return hexN;
    }

    public static String toBinary(String hexNumber) {
        //напишите тут ваш код
        String binaryN = "";
        if (hexNumber == null || hexNumber.isEmpty()) return binaryN;
        for (int i = 0; i < hexNumber.length(); i++) {
            String s = hexNumber.substring(i, i+1);
            if (s.matches("[^0-9^a-f]+")) {
                return binaryN;
            }
        }

        for (int i = 0; i < hexNumber.length(); i++) {
            String s = hexNumber.substring(i, i+1);
            if (s.equals("0")){
                binaryN = binaryN + "0000";
            }
            if (s.equals("1")){
                binaryN = binaryN + "0001";
            }
            if (s.equals("2")){
                binaryN = binaryN + "0010";
            }
            if (s.equals("3")){
                binaryN = binaryN + "0011";
            }
            if (s.equals("4")){
                binaryN = binaryN + "0100";
            }
            if (s.equals("5")){
                binaryN = binaryN + "0101";
            }
            if (s.equals("6")){
                binaryN = binaryN + "0110";
            }
            if (s.equals("7")){
                binaryN = binaryN + "0111";
            }
            if (s.equals("8")){
                binaryN = binaryN + "1000";
            }
            if (s.equals("9")){
                binaryN = binaryN + "1001";
            }
            if (s.equals("a")){
                binaryN = binaryN + "1010";
            }
            if (s.equals("b")){
                binaryN = binaryN + "1011";
            }
            if (s.equals("c")){
                binaryN = binaryN + "1100";
            }
            if (s.equals("d")){
                binaryN = binaryN + "1101";
            }
            if (s.equals("e")){
                binaryN = binaryN + "1110";
            }
            if (s.equals("f")){
                binaryN = binaryN + "1111";
            }
        }

        return binaryN;
    }
}
