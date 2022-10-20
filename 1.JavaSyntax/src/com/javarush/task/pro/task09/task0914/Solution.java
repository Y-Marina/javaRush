package com.javarush.task.pro.task09.task0914;

/* 
Обновление пути
*/

import java.util.Locale;

public class Solution {
    public static void main(String[] args) {
        String path = "/usr/java/jdk1.8/bin/";

        String jdk13 = "jdk-13";
        System.out.println(changePath(path, jdk13));
    }

    public static String changePath(String path, String jdk) {
        //напишите тут ваш код
//        String[] array = path.split("/");
//        for (int i = 0; i < array.length; i++) {
//            if (array[i].toLowerCase(Locale.ROOT).contains("jdk")){
//                array[i] = jdk;
//                break;
//            }
//        }
//        StringBuilder sb = new StringBuilder();
//        for (int i = 0; i < array.length; i++) {
//            sb.append(array[i]).append("/");
//        }
//        return sb.toString();

        int index1 = path.indexOf("jdk");
        int index2 = path.indexOf("/",index1);
        String partofString = path.substring(index1,index2);

        String transformed = path.replace(partofString,jdk);

        return transformed;
    }
}
