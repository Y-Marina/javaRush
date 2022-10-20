package com.javarush.task.task18.task1809;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* 
Реверс файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader= new BufferedReader(new InputStreamReader(System.in));
        FileInputStream is = new FileInputStream(reader.readLine());
        FileOutputStream os = new FileOutputStream(reader.readLine());

        int length = is.available();
        byte[] bytes = new byte[length];
        int ch = -1;
        while (length > 0) {
            bytes[--length] = (byte) is.read();
        }
        for(byte x: bytes){
            os.write(x);
        }
        reader.close();
        is.close();
        os.close();
    }
    }
