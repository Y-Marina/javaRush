package com.javarush.task.pro.task16.task1602;

import java.time.LocalDate;
import java.util.*;

/* 
Подчищаем хвосты
*/

public class Solution {

    public static void main(String[] args) {
        List<Date> dateList = new ArrayList<>();
        dateList.add(new Date(1, 0, 25, 20, 40));
        dateList.add(new Date("July 20, 1969"));
        dateList.add(new Date(2001, 11, 9));
        dateList.add(new Date("January 1, 2000"));
        dateList.add(new Date(0, 0, 1, 0, 0));

        System.out.println("before fixes:");
        dateList.forEach(System.out::println);

        fixDate(dateList);

        System.out.println("after fixes:");
        dateList.forEach(System.out::println);
    }

    static void fixDate(List<Date> brokenDates) {
        //напишите тут ваш код
        Date currentDate = new Date();
        Date startDate = new Date(0, 0, 1, 0, 0);
        for (int i = 0; i < brokenDates.size(); i++) {
            Date date = brokenDates.get(i);
            if (date.after(currentDate)) {
               Calendar calendar = new GregorianCalendar(
                       date.getYear(),
                       date.getMonth(),
                       date.getDay(),
                       date.getHours(),
                       date.getMinutes(),
                       date.getSeconds()
               );
               calendar.add(Calendar.YEAR, -1900);
               brokenDates.remove(i);
               brokenDates.add(i, calendar.getTime());
            }

        }

    }
}
