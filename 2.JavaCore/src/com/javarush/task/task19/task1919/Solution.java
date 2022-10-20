package com.javarush.task.task19.task1919;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.TreeMap;

/* 
Считаем зарплаты
*/

public class Solution {
    public static void main(String[] args) {
        TreeMap<String,Double> list = new TreeMap<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(args[0]))) {
            while (reader.ready()) {
                String[] strings = reader.readLine().split(" ");
                list.merge(strings[0], Double.parseDouble(strings[1]), Double::sum);
            }
            list.forEach((key, value) -> System.out.println(key + " " + value));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
