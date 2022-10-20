package com.javarush.task.task19.task1907;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Считаем слово
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String s = bufferedReader.readLine();
        bufferedReader.close();
        BufferedReader reader = new BufferedReader(new FileReader(s));
        int count = 0;
        while (reader.ready())
        {
            String line = reader.readLine();
            String tmpS = line.toLowerCase().replaceAll("\\bworld\\b", "aaaa");
            count += ((line.length()-tmpS.length()));
        }
        reader.close();
        System.out.println(count);
    }
}
