package com.javarush.task.task15.task1523;

/* 
Перегрузка конструкторов
*/

public class Solution {
    String s;
    int i;
    double d;

     Solution(String s) {
        this.s = s;
    }

    public Solution(int i) {
        this.i = i;
    }

   protected Solution(String s, int i) {
        this.s = s;
        this.i = i;
   }

   private Solution(String s, int i, double d) {
        this.s = s;
        this.i = i;
        this.d = d;
   }

    public static void main(String[] args) {

    }
}

