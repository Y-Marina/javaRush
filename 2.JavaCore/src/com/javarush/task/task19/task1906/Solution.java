package com.javarush.task.task19.task1906;

import java.io.*;
import java.util.ArrayList;

/* 
Четные символы
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine();
        String file2 = reader.readLine();
        reader.close();

        FileReader fileReader = new FileReader(file1);
        FileWriter fileWriter = new FileWriter(file2);

        String line = "";
        int bit;
        while((bit = fileReader.read()) != -1) {
            line += (char)bit;
        }
        fileReader.close();
        char [] c = line.toCharArray();
        for(int i = 1; i < line.length(); i += 2) {
            fileWriter.write(c[i]);
        }
        fileWriter.close();
    }
}
