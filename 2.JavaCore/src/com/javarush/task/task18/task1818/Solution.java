package com.javarush.task.task18.task1818;

import java.io.*;
import java.util.Scanner;

/* 
Два в одном
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file_1 = reader.readLine(); // "C:\\DiskD\\jav\\er3-2.txt"
        String file_2 = reader.readLine(); // "C:\\DiskD\\jav\\er3.txt"
        String file_3 = reader.readLine(); // "C:\\DiskD\\jav\\er3-3.txt"

        FileReader fileReader = new FileReader(file_2);
        FileReader fileReader1 = new FileReader(file_3);
        FileWriter fileWriter = new FileWriter(file_1, true);


        while (fileReader.ready()) {
            fileWriter.write(fileReader.read());
            fileWriter.flush();
        }
        fileReader.close();

        while (fileReader1.ready()) {
            fileWriter.write(fileReader1.read());
            fileWriter.flush();
        }
        fileReader1.close();
        fileWriter.close();
    }
}
