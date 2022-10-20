package com.javarush.task.pro.task05.task0508;

import java.util.Scanner;

/* 
Удаляем одинаковые строки
*/

public class Solution {
    public static String[] strings;

    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        strings = new String[6];
        boolean[] matches = new boolean[strings.length];
        for (int i = 0; i < strings.length; i++) {
            strings[i] = scanner.nextLine();
        }
        for (int i = 0; i < strings.length; i++) {
            for (int j = 0; j < strings.length; j++) {
                if (i == j) {
                    continue;
                }

                if (strings[i].equals(strings[j])) {
                    matches[i] = true;
                    matches[j] = true;
                }

            }
        }
        for (int i = 0; i < strings.length; i++) {
            if (matches[i]){
                strings[i] = null;
            }
        }

        for (int i = 0; i < strings.length; i++) {
            System.out.print(strings[i] + ", ");
        }
    }
}
