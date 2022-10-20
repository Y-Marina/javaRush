package com.javarush.task.task18.task1819;

import java.io.*;

import static java.lang.System.in;

/* 
Объединение файлов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name1 = reader.readLine();
        String name2 = reader.readLine();
        reader.close();

        FileInputStream file1 = new FileInputStream(name1);
        FileInputStream file2 = new FileInputStream(name2);

        byte[] content = new byte[file1.available() + file2.available()];
        int readBytes = file2.read(content);
        file1.read(content, readBytes, content.length - readBytes);
        file1.close();
        file2.close();

        FileOutputStream result = new FileOutputStream(name1);
        result.write(content);
        result.close();
    }
}
