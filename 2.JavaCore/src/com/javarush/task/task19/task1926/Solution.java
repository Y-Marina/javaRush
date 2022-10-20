package com.javarush.task.task19.task1926;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/* 
Перевертыши
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String s = bufferedReader.readLine();
        bufferedReader.close();

        FileReader reader = new FileReader(s);
        BufferedReader fileReader = new BufferedReader(reader);

        while (fileReader.ready()) {
            String a = fileReader.readLine();
            StringBuilder sb = new StringBuilder(a);
            System.out.println(sb.reverse());
        }
        reader.close();
    }
}
