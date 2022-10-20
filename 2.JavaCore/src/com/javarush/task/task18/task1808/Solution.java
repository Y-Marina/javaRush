package com.javarush.task.task18.task1808;

import java.io.*;

/* 
Разделение файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = consoleReader.readLine();
        String file2 = consoleReader.readLine();
        String file3 = consoleReader.readLine();
        FileInputStream input = new FileInputStream(file1);
        FileOutputStream output2 = new FileOutputStream(file2);
        FileOutputStream output3 = new FileOutputStream(file3);

        int length = input.available();

        if (!(length % 2 == 0)) {
            while(input.available()>= length-length/2){
                output2.write(input.read());
            }
            while(input.available()>0){
                output3.write(input.read());
            }
        } else{
            while (input.available()>length/2){
                output2.write(input.read());
            }
            while (input.available()>0){
                output3.write(input.read());
            }
        }
        input.close();
        output2.close();
        output3.close();
    }
}
