package com.javarush.task.task12.task1204;

/* 
То ли птица, то ли лампа
*/

public class Solution {
    public static void main(String[] args) {
        printObjectType(new Cat());
        printObjectType(new Bird());
        printObjectType(new Lamp());
        printObjectType(new Cat());
        printObjectType(new Dog());
    }

    public static void printObjectType(Object o) {
        //Напишите тут ваше решение
        String name = "";
        if (o instanceof Cat) {
            name = "Кошка";
        } else if (o instanceof Dog) {
            name = "Собака";
        } else if (o instanceof Bird) {
            name = "Птица";
        } else if (o instanceof Lamp) {
            name = "Лампа";
        }
        System.out.println(name);
    }

    public static class Cat {
    }

    public static class Dog {
    }

    public static class Bird {
    }

    public static class Lamp {
    }
}
