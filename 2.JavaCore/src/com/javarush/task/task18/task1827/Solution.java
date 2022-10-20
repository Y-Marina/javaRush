package com.javarush.task.task18.task1827;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* 
Прайсы
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        if (args.length == 0) return;
        File file = new File(s);
        FileReader reader = new FileReader(file);
        FileWriter writer = new FileWriter(file);

    }
}
