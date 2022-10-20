package com.javarush.task.pro.task18.task1802;

/*
Сортировка по возрасту
*/

import java.util.Comparator;

public class AgeComparator implements Comparator<Student> {
    //напишите тут ваш код

    @Override
    public int compare(Student student1, Student student2) {
        if (student1.getAge() > student2.getAge()) {
            return -1;
        } else if(student1.getAge() < student2.getAge()) {
            return 1;
        } else {
            return 0;
        }
    }
}
