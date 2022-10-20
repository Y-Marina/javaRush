package com.javarush.task.task18.task1804;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* 
Самые редкие байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String fileName = scanner.nextLine();
        List<Integer> byteList = new ArrayList<>();
        int[] amountBytes = new int[255];
        int min = Integer.MAX_VALUE;
        try (FileInputStream file = new FileInputStream(fileName)) {
            boolean eof = false;
            while (file.available()>0) {
                int byteValue = file.read();
                byteList.add(byteValue);
                if (byteValue == -1) {
                    eof = true;
                    byteList.remove(byteList.size() - 1);
                }
            }
        }

        for (Integer numberByte :
                byteList) {
            amountBytes[numberByte] ++;
        }

        for (int i = 0; i < amountBytes.length; i++) {
            if (amountBytes[i] > 0 && amountBytes[i] < min) {
                min = amountBytes[i];
            }
        }

        for (int i = 0; i < amountBytes.length; i++) {
            if (amountBytes[i] == min) {
                System.out.print(i + " ");
            }
        }
    }
}
