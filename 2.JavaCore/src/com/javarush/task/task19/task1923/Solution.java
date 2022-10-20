package com.javarush.task.task19.task1923;

import java.io.*;

/* 
Слова с цифрами
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(args[0]));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(args[1]));
        StringBuilder stringBuilder = new StringBuilder();
        while (bufferedReader.ready()) {
            String line = bufferedReader.readLine();
            String[] array = line.split(" ");
            for (String s : array) {
                for (char ch: s.toCharArray()) {
                    if (Character.isDigit(ch)) {
                        stringBuilder.append(s);
                        stringBuilder.append(" ");
                        break;
                    }
                }
            }
            bufferedWriter.append(stringBuilder);
            stringBuilder = new StringBuilder();
        }
        bufferedWriter.flush();
        bufferedReader.close();
        bufferedWriter.close();
    }
}
