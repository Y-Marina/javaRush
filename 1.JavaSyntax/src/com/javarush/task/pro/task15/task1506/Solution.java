package com.javarush.task.pro.task15.task1506;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* 
Фейсконтроль
*/

public class Solution {
    public static void main(String[] args) throws FileNotFoundException {
        //напишите тут ваш код
        try ( Scanner s = new Scanner(System.in); ) {
            String charline = s.nextLine();
            Path path = Paths.get(charline);
            List<String> list = new ArrayList<>(Files.readAllLines(path));
            for (int i = 0; i < list.size(); i++) {
                for (int j = 0; j < list.get(i).length(); j++) {
                    if ((list.get(i).charAt(j) != ' ') && (list.get(i).charAt(j) != '.') && (list.get(i).charAt(j) != ',')){
                        System.out.print(list.get(i).charAt(j));
                    }
                }

            }
        } catch (Exception e) {
            System.out.print(e);
        }
    }
}

