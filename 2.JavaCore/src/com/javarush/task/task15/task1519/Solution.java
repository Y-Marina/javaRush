package com.javarush.task.task15.task1519;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Разные методы для разных типов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напиште тут ваш код
       Scanner scanner = new Scanner(System.in);
       while (true) {
           String s = scanner.nextLine();
           if (s.equals("exit")) {
               break;
           }
           try {
               if (s.contains(".")) {
                   print(Double.parseDouble(s));
               } else {
                   int intNum = Integer.parseInt(s);
                   if (intNum > 0 && intNum < 128) {
                       print((short) intNum);
                   } else {
                       print(intNum);
                   }
               }
           } catch (NumberFormatException e){
               print(s);
           }
       }
       scanner.close();
    }

    public static void print(Double value) {
        System.out.println("Это тип Double, значение " + value);
    }

    public static void print(String value) {
        System.out.println("Это тип String, значение " + value);
    }

    public static void print(short value) {
        System.out.println("Это тип short, значение " + value);
    }

    public static void print(Integer value) {
        System.out.println("Это тип Integer, значение " + value);
    }
}
