package com.javarush.task.pro.task05.task0524;

/* 
Взлом Кибердракона
*/

public class Solution {
    public static int[] coordinates;

    public static void main(String[] args) {
        //напишите тут ваш код
        coordinates = new int[200];
        int step = 10;
        int k = 0;
        for (int i = 0; i < coordinates.length; i+=2) {
            coordinates[i] = k;
            coordinates[i + 1] = k + 1;
            k = k + step;
        }

    }
}