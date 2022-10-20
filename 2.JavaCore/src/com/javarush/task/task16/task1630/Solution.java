package com.javarush.task.task16.task1630;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Последовательный вывод файлов
*/

public class Solution {
    public static String firstFileName;
    public static String secondFileName;

    //напишите тут ваш код
    static {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            firstFileName = br.readLine();
            secondFileName = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        systemOutPrintln(firstFileName);
        systemOutPrintln(secondFileName);
    }

    public static void systemOutPrintln(String fileName) throws InterruptedException {
        ReadFileInterface f = new ReadFileThread();
        f.setFileName(fileName);
        f.start();
        f.join();
        System.out.println(f.getFileContent());
    }

    public interface ReadFileInterface {
        void setFileName(String fullFileName);

        String getFileContent();

        void join() throws InterruptedException;

        void start();
    }

    public static class ReadFileThread extends Thread implements ReadFileInterface {
        public String filename;
        public String content = "";

        public void setFileName(String fullFileName) {
            this.filename = fullFileName;
        }

        public String getFileContent() {
            return content;
        }

        public void run() {
            String line;
            try {
                BufferedReader reader = new BufferedReader(new FileReader((filename)));
                while ((line = reader.readLine()) != null) {
                    content += line + " ";
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
}
