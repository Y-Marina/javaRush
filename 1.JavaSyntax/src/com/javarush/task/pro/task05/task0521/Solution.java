package com.javarush.task.pro.task05.task0521;

/* 
Выполнение фрагмента кода
*/

public class Solution {

    public static int result = 45967;

    public static void main(String[] args) {
        int s = 153;
        int hour = 0;
        int v1 = 10;
        int v2 = 3;

        while (s > 0){
            hour++;
            s = s - v1 - v2;
            System.out.println("часы: " + hour + "   скорость второго" + v2 + "    расстояние " + s);
            v2 += 5;
        }
        System.out.println("ответ: встретяться через " + hour + " часов");
    }
}

