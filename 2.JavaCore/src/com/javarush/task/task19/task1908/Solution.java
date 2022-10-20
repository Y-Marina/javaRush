package com.javarush.task.task19.task1908;

import java.io.*;
import java.util.ArrayList;

/* 
Выделяем числа
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader r1 = new BufferedReader(new InputStreamReader(System.in));

        String fileName1 = r1.readLine();
        String fileName2 = r1.readLine();

        FileReader fr = new FileReader(fileName1);
        FileWriter fw = new FileWriter(fileName2);

        BufferedReader reader = new BufferedReader(fr);
        BufferedWriter writer = new BufferedWriter(fw);



        while(reader.ready()){
            String line = reader.readLine();
            String [] arrayLine = line.split(" ");

            for (String s : arrayLine){
                try{
                    writer.write(Integer.parseInt(s) + " ");
                } catch (NumberFormatException e){

                }
            }
        }

        r1.close();
        reader.close();
        writer.close();
        fr.close();
        fw.close();
    }
}
