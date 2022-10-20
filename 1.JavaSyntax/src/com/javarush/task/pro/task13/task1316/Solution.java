package com.javarush.task.pro.task13.task1316;

public class Solution {

    public static void main(String[] args) {
        //напишите тут ваш код
        JavarushQuest[] javarushQuests = JavarushQuest.values();

        for (JavarushQuest jq: javarushQuests) {
            System.out.println(jq.ordinal());
        }
//        System.out.println(JavarushQuest.JAVA_SYNTAX.ordinal());
//        System.out.println(JavarushQuest.JAVA_CORE.ordinal());
//        System.out.println(JavarushQuest.JAVA_MULTITHREADING.ordinal());
//        System.out.println(JavarushQuest.JAVA_COLLECTIONS.ordinal());
//        System.out.println(JavarushQuest.CS_50.ordinal());
//        System.out.println(JavarushQuest.ANDROID.ordinal());
//        System.out.println(JavarushQuest.GAMES.ordinal());
    }
}
