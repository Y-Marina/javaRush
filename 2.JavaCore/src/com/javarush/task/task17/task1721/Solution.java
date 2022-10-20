package com.javarush.task.task17.task1721;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* 
Транзакционность
*/

public class Solution {
    public static List<String> allLines = new ArrayList<String>();
    public static List<String> forRemoveLines = new ArrayList<String>();
    public static String firstFileName;
    public static String secondFileName;

    static {
        try (BufferedReader in = new BufferedReader(new InputStreamReader(System.in))) //   D:new/box.txt
        {
            firstFileName = in.readLine();
            secondFileName = in.readLine();

        } catch (Exception e) {

        }
    }

    public static void main(String[] args) {
        readFirstFile(firstFileName);
        readSecondFile(secondFileName);
        try {
            new Solution().joinData();
        } catch (CorruptedDataException e) {
            e.printStackTrace();
        }
    }
    private synchronized static void readFirstFile(String file) {
        try (BufferedReader in = new BufferedReader(new FileReader(file)))
        {
            String box = in.readLine();
            while (box != null) {
                allLines.add(box);
                box = in.readLine();
                if (box == null) {
                    break;
                }
            }
        } catch (Exception e) {

        }
    }
    private synchronized static void readSecondFile(String file) {
        try (BufferedReader in = new BufferedReader(new FileReader(file)))
        {
            String box = in.readLine();
            while (box != null) {
                forRemoveLines.add(box);
                box = in.readLine();
                if (box == null) {
                    break;
                }
            }
        } catch (Exception e) {

        }
    }


    public void joinData() throws CorruptedDataException {

        Collections.sort(allLines);
        Collections.sort(forRemoveLines);
        boolean b;
        for (String q: forRemoveLines) {
            b = allLines.remove(q);
            if (b != true) {
                allLines.clear();
                throw new CorruptedDataException();
            }
        }
    }
}
