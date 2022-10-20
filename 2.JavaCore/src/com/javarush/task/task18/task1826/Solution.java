package com.javarush.task.task18.task1826;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/* 
Шифровка
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        FileInputStream input = new FileInputStream(args[1]);
        FileOutputStream output =new FileOutputStream(args[2]);
        switch (args[0]) {
            case "-e" : {
                while (input.available() > 0) output.write(input.read()+1);
                break;
            }
            case "-d" : {
                while (input.available() > 0) output.write(input.read()-1);
                break;
            }
        }
        input.close();
        output.close();
    }

}
