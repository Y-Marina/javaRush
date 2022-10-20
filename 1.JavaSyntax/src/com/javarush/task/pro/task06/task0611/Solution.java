package com.javarush.task.pro.task06.task0611;

/* 
Анализ массивов
*/

public class Solution {
    public static void main(String[] args) {

        try {
            getMaxValue();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void getMaxValue() throws Exception {

            System.out.println(3 / 0);


    }

    public static int getMinValue(int[] array) {
        int min = Integer.MAX_VALUE;
        for (int value : array) {
            if (value < min) {
                min = value;
            }
        }
        return min;
    }

    public static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
