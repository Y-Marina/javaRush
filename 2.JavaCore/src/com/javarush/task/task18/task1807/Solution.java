package com.javarush.task.task18.task1807;

import java.io.*;

/* 
Подсчет запятых
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file = reader.readLine();

        FileInputStream fileInputStream = new FileInputStream(file);
        //ArrayList<Character> symbols = new ArrayList<>();

        int ch;
        int count = 0;

        while (fileInputStream.available()>0){

            if (fileInputStream.read() == 44)
            {
                count++;
            }
        }

        System.out.println(count);
        fileInputStream.close();
    }
}
