package com.javarush.task.task15.task1527;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URI;
import java.net.URL;

/* 
Парсер реквестов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        //напишите тут ваш код
        URL url = new URL(s);
        String queryString = url.getQuery();
        String[] arg = queryString.split("&");
        StringBuilder stringBuilder = new StringBuilder();
        String d = null;
        for (int i = 0; i < arg.length; i++) {
            String[] temp = arg[i].split("=");
            String result = temp[0];
            stringBuilder.append(result);
            if (result.equals("obj")) {
                d = temp[1];
            }
            if (i != arg.length - 1) {
                stringBuilder.append(" ");
            }

        }
        System.out.println(stringBuilder);
        if (d != null) {
            try {
                alert(Double.parseDouble(d));
            } catch (Exception e) {
                alert(d);
            }
        }
    }

    public static void alert(double value) {
        System.out.println("double: " + value);
    }

    public static void alert(String value) {
        System.out.println("String: " + value);
    }
}
