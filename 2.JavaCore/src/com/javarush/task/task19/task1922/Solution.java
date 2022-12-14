package com.javarush.task.task19.task1922;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Ищем нужные строки
*/

public class Solution {
    public static List<String> words = new ArrayList<String>();

    static {
        words.add("файл");
        words.add("вид");
        words.add("В");
    }

    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String path = bufferedReader.readLine();
        bufferedReader.close();

        BufferedReader reader = new BufferedReader(new FileReader(path));

        while (reader.ready()) {
            String s = reader.readLine();
            String[] array = s.split(" ");
            int count = 0;

            for (String w: array) {
                if (words.contains(w)) count++;
            }

            if (count == 2) {
                System.out.println(s);
            }
        }
        reader.close();
    }
}
