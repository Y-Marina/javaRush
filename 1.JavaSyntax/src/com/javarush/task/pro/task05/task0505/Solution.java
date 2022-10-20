package com.javarush.task.pro.task05.task0505;

import java.util.Scanner;

/* 
Reverse
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        if (n <= 0) {
            return;
        }
        int[] nambers = new int[n];
        for (int i = 0; i < nambers.length; i++) {
            nambers[i] = s.nextInt();
        }
        if (n % 2 == 0) {
            for (int i = nambers.length; i > 0 ; i--) {
                System.out.println(nambers[i - 1]);
            }
        }else {
            for (int i = 0; i < nambers.length; i++) {
                System.out.println(nambers[i]);
            }
        }
    }
}
