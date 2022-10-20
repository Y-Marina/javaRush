package com.javarush.task.task13.task1319;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Писатель в файл с консоли
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        // напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        String outputFileName = scanner.nextLine();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter wr = new BufferedWriter(new FileWriter("C:\\Users\\noname\\Desktop\\copy.txt"));
        String s;
        while (true) {
            s = reader.readLine();
            wr.write(s + "\n");
            if (s.equals("exit")) break;


        }
        wr.close();
    }
    }
