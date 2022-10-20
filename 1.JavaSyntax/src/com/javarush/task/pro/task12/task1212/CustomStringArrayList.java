package com.javarush.task.pro.task12.task1212;

/* 
Создаем свой список
*/

import java.util.Arrays;

public class CustomStringArrayList {

    private int size;
    private int capacity;
    private String[] elements;

    public CustomStringArrayList() {
        capacity = 10;
        size = 0;
        elements = new String[capacity];
    }

    public void add(String element) {
        if (size == capacity) {
            grow();
        }
        elements[size] = element;
        size++;
    }

    private void grow() {
        //напишите тут ваш код
        String[] temp;
        capacity *= 1.5;
        temp = Arrays.copyOf(elements, capacity);
        elements = temp;
//        System.out.println(Arrays.toString(elements));

        for (int i = 0; i < temp.length; i++) {
            elements[i] = temp[i];
        }
    }

}
