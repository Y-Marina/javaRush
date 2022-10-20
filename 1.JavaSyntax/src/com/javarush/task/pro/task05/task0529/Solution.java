package com.javarush.task.pro.task05.task0529;

import java.util.Arrays;

/* 
Галаксианские роботанки (1)
*/

public class Solution {
    public static String robotank = "☖";
    public static String empty = "_";
    public static String hit = "🎯";
    public static int width = 30;
    public static int height = 10;
    public static String[][] field = new String[height][width];
    public static int[][] bombs = new int[height][width];

    public static void main(String[] args) {
        //напишите тут ваш код

        for (String[] strings : field) {
            Arrays.fill(strings, empty);
        }
        for (int i = 0; i < field.length; i++) {
            int x = (int) (Math.random() * field[i].length);
            field[i][x] = robotank;
        }
        for (int i = 0; i < bombs.length; i++) {
            int count = 0;
            while (count < 10) {
                int x = (int) (Math.random() * bombs[i].length);
                if (bombs[i][x] != 1) {
                    bombs[i][x] = 1;
                    count++;
                }
            }
        }
        for (int i = 0; i < bombs.length; i++) {
            for (int j = 0; j < bombs[i].length; j++) {
                if (bombs[i][j] == 1 && field[i][j].equals(robotank)) {
                    field[i][j] = hit;
                }
            }
        }
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                if (field[i][j].equals(robotank)) {
                    field[i][j] = hit;
                }
            }
        }


        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                System.out.print(field[i][j]);
            }
            System.out.println();
        }

    }
}
