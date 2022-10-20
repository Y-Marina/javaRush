package com.javarush.task.pro.task13.task1309;

import java.util.HashMap;

/* 
Успеваемость студентов
*/

public class Solution {
    public static HashMap<String, Double> grades = new HashMap<>();

    public static void main(String[] args) {
        addStudents();
        System.out.println(grades);
    }

    public static void addStudents() {
        //напишите тут ваш код
        grades.put("1", 5.0);
        grades.put("2", 4.3);
        grades.put("3", 4.5);
        grades.put("4", 5.8);
        grades.put("5", 4.7);
    }
}
