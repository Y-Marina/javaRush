package com.javarush.task.pro.task14.task1415;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* 
Стек в домашних условиях
*/


public class MyStack {

    public static void main(String[] args) {
        MyStack myStack = new MyStack();
        myStack.push("a");
        myStack.push("b");
        System.out.println(myStack.storage.size());
        for (int i = 0; i < myStack.storage.size(); i++) {
            System.out.println(i + " " + myStack.storage.get(i));
        }
    }

    private final List<String> storage = new ArrayList<>();

    public void push(String s) {
        //напишите тут ваш код
        storage.add(0, s);
    }

    public String pop() {
        //напишите тут ваш код
        return storage.remove(0);
    }

    public String peek() {
        return storage.get(0);
    }

    public boolean empty() {
        //напишите тут ваш код
        return storage.isEmpty();
    }

    public int search(String s) {
        //напишите тут ваш код
        for (int i = 0; i < storage.size(); i++) {
            if (s.equals(storage.get(i))) {
                return i;
            }
        }
        return -1;
    }
}
