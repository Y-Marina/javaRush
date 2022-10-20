package com.javarush.task.pro.task15.task1512;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

/* 
Задом наперед
*/

public class Solution {
    public static ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    public static PrintStream stream = new PrintStream(outputStream);

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        printSomething(scanner.nextLine());
        String result = outputStream.toString();
        //напишите тут ваш код
//        System.out.println(result);
        outputStream.reset();
        printSomething(revers(result));
        String result2 = outputStream.toString();
//        printSomething(result2);
        System.out.println(result2);
    }



    public static String revers(String s) {
        StringBuilder tmp = new StringBuilder("");
        String[] arr = s.split("");
        for (int i = arr.length - 1; i >= 0; i--) {
            tmp.append(arr[i]);
        }
        return tmp.toString();
    }

    public static void printSomething(String str) {
        stream.print(str);
    }
}