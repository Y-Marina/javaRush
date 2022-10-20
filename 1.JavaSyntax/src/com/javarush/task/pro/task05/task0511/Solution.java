package com.javarush.task.pro.task05.task0511;

import java.util.Scanner;

/* 
Создаем двумерный массив
*/

public class Solution {
    public static int[][] multiArray;

    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        multiArray = new int[a][];
        for (int i = 0; i < multiArray.length; i++) {
            int b = s.nextInt();
            multiArray[i] = new int[b];
        }
    }
}
