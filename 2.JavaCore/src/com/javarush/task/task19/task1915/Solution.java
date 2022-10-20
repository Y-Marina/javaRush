package com.javarush.task.task19.task1915;

import java.io.*;

/* 
Дублируем текст
*/

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) throws Exception {
        String filename;
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){
            filename = reader.readLine();
        }
        PrintStream system = System.out;
        ByteArrayOutputStream byteStream = new ByteArrayOutputStream();
        PrintStream newStream = new PrintStream(byteStream);
        System.setOut(newStream);
        testString.printSomething();
        FileOutputStream outputStream = new FileOutputStream(filename);
        outputStream.write(byteStream.toByteArray());
        outputStream.close();
        System.setOut(system);
        System.out.println(byteStream.toString());
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("it's a text for testing");
        }
    }
}

