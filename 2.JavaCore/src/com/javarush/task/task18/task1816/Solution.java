package com.javarush.task.task18.task1816;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* 
Английские буквы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        File file = new File(args[0]);
        FileReader reader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(reader);
        int symbol = bufferedReader.read();
        int count = 0;
        while (symbol != -1) {
            if (symbol >= 65 && symbol <= 90 || symbol >= 97 && symbol <= 122) {
                count++;
            }
            symbol = bufferedReader.read();
        }
        System.out.println(count);
        reader.close();
        bufferedReader.close();
    }
}
