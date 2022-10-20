package com.javarush.task.task13.task1318;

import java.io.*;
import java.util.Scanner;

/*
Чтение файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(scanner.nextLine()));
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        while(bufferedReader.ready()){
            System.out.println(bufferedReader.readLine());
        }
        bufferedReader.close();
        inputStreamReader.close();
    }
}