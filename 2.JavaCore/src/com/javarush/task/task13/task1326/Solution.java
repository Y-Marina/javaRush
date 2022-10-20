package com.javarush.task.task13.task1326;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/* 
Сортировка четных чисел из файла
*/

public class Solution {
    public static void main(String[] args) throws FileNotFoundException {
        // напишите тут ваш код
        try (BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
             Scanner readFromFile = new Scanner (new FileInputStream(console.readLine()))) {

            List <Integer> list = new ArrayList<>();
            int real;
            while (readFromFile.hasNextInt()){
                real = readFromFile.nextInt();
                if(real % 2 == 0)
                    list.add(real);
            }
            Collections.sort(list);
            for (int i: list) {
                System.out.println(i);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (IOException e) {
            System.out.println("Что-то пошло не так");
        } catch (Exception e) {
            e.getStackTrace();
        }
    }
}
