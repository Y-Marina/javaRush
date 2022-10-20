package com.javarush.task.task19.task1910;

import java.io.*;
import java.util.ArrayList;

/* 
Пунктуация
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String s1 = bufferedReader.readLine();
        String s2 = bufferedReader.readLine();

        bufferedReader.close();

        FileReader fr = new FileReader(s1);
        FileWriter fw = new FileWriter(s2);

        BufferedReader reader = new BufferedReader(fr);
        BufferedWriter writer = new BufferedWriter(fw);

        while (reader.ready()) {
            writer.write(reader.readLine().replaceAll("\\p{Punct}", ""));
        }

        reader.close();
        writer.close();
    }
}
