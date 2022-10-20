package com.javarush.task.task19.task1916;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Отслеживаем изменения
*/

public class Solution {
    public static List<LineItem> lines = new ArrayList<LineItem>();

    public static void main(String[] args) throws Exception {

        ArrayList<String>firstFileLines = new ArrayList<>();
        ArrayList<String>secondFileLines = new ArrayList<>();

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = bufferedReader.readLine();
//        String file1 = "d:\\1\\1.txt";
        String file2 = bufferedReader.readLine();
//        String file2 = "d:\\1\\2.txt";
        bufferedReader.close();

        BufferedReader reader1 = new BufferedReader(new FileReader(file1));
        while (reader1.ready()) {
            firstFileLines.add(reader1.readLine());
        }
        reader1.close();
        BufferedReader reader2 = new BufferedReader(new FileReader(file2));
        while (reader2.ready()) {
            secondFileLines.add(reader2.readLine());
        }
        reader2.close();

        while (firstFileLines.size() > 0 && secondFileLines.size() > 0) {
            if (firstFileLines.get(0).equals(secondFileLines.get(0))) {
                lines.add(new LineItem(Type.SAME, firstFileLines.get(0)));
                firstFileLines.remove(0);
                secondFileLines.remove(0);
            } else if (firstFileLines.get(1).equals(secondFileLines.get(0))) {
                lines.add(new LineItem(Type.REMOVED, firstFileLines.get(0)));
                firstFileLines.remove(0);
            } else if (firstFileLines.get(0).equals(secondFileLines.get(1))) {
                lines.add(new LineItem(Type.ADDED, secondFileLines.get(0)));
                secondFileLines.remove(0);
            }
        }

        for (String s : firstFileLines) {
            lines.add(new LineItem(Type.REMOVED, s));
        }
        for (String s : secondFileLines) {
            lines.add(new LineItem(Type.ADDED, s));
        }

        for (LineItem item: lines) {
            System.out.println(item.type + " " + item.line);
        }

    }


    public static enum Type {
        ADDED,        //добавлена новая строка
        REMOVED,      //удалена строка
        SAME          //без изменений
    }

    public static class LineItem {
        public Type type;
        public String line;

        public LineItem(Type type, String line) {
            this.type = type;
            this.line = line;
        }
    }
}
