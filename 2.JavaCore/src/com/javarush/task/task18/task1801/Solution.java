package com.javarush.task.task18.task1801;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Максимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = bufferedReader.readLine();
        bufferedReader.close();
        FileInputStream fileInputStream = new FileInputStream(fileName);
        int max = fileInputStream.read();
        while (fileInputStream.available() > 0) {
            int data = fileInputStream.read();
            if (data > max) {
                max = data;
            }
        }
            fileInputStream.close();
        System.out.println(max);
    }
}
