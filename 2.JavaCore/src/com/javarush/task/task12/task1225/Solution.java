package com.javarush.task.task12.task1225;

/* 
Посетители
*/

import java.util.HashMap;

public class Solution {
    public static void main(String[] args) {
        System.out.println(getObjectType(new Cat()));
        System.out.println(getObjectType(new Tiger()));
        System.out.println(getObjectType(new Lion()));
        System.out.println(getObjectType(new Bull()));
        System.out.println(getObjectType(new Cow()));
        System.out.println(getObjectType(new Animal()));
    }

    public static String getObjectType(Object o) {
        //напишите тут ваш код
        HashMap<String, String> map = new HashMap<>();
        map.put("Cat", "Кот");
        map.put("Tiger", "Тигр");
        map.put("Lion", "Лев");
        map.put("Bull", "Бык");
        map.put("Cow", "Корова");

        String nameO = o.getClass().getSimpleName();
        if (map.get(nameO) != null) {
            return map.get(nameO).toString();
        } else {
            return "Животное";
        }

    }

    public static class Cat extends Animal   //<--Классы наследуются!!
    {
    }

    public static class Tiger extends Cat {
    }

    public static class Lion extends Cat {
    }

    public static class Bull extends Animal {
    }

    public static class Cow extends Animal {
    }

    public static class Animal {
    }
}
