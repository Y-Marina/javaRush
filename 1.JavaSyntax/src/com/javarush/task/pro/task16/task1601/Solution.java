package com.javarush.task.pro.task16.task1601;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/* 
Лишь бы не в понедельник :)
*/

public class Solution {

    static Date birthDate = new Date(106, 5, 11);

    public static void main(String[] args) {
        System.out.println(getDayOfWeek(birthDate));
    }

    static String getDayOfWeek(Date date) {
        //напишите тут ваш код
//        int d = date.getDay();
        SimpleDateFormat formatter = new SimpleDateFormat("EEEEE год YY", Locale.forLanguageTag("ru"));
//        switch (d) {
//            case (1):
//                return "понедельник";
//                break;
//            case (2):
//                return
//        }
        return formatter.format(date);
    }
}
