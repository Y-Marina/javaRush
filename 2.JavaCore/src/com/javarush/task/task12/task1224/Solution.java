package com.javarush.task.task12.task1224;

/* 
Неведома зверушка
*/

import java.util.HashMap;

public class Solution {
    public static void main(String[] args) {
        System.out.println(getObjectType(new Cat()));
        System.out.println(getObjectType(new Tiger()));
        System.out.println(getObjectType(new Lion()));
        System.out.println(getObjectType(new Bull()));
        System.out.println(getObjectType(new Pig()));
    }

    public static String getObjectType(Object o) {
        //напишите тут ваш код
        String name = "";

        HashMap<String, String> map = new HashMap<>();
        map.put("Cat", "Кот");
        map.put("Tiger", "Тигр");
        map.put("Lion", "Лев");
        map.put("Bull", "Бык");

        String nameO = o.getClass().getSimpleName();
        if (map.get(nameO) != null) {
            return map.get(nameO).toString();
        } else {
            return "Животное";
        }
    }

    public static class Cat {
    }

    public static class Tiger {
    }

    public static class Lion {
    }

    public static class Bull {
    }

    public static class Pig {
    }
}
