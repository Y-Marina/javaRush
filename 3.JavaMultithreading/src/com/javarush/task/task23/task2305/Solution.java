package com.javarush.task.task23.task2305;

/* 
Inner
*/

public class Solution {
    public InnerClass[] innerClasses = new InnerClass[2];

    public class InnerClass {
    }

    public static Solution[] getTwoSolutions() {
         Solution[] solutions = new Solution[2];
         Solution a = new Solution();
         a.innerClasses[0]  = a.new InnerClass();
         a.innerClasses[1]  = a.new InnerClass();
         solutions[0] = a;
         solutions[1] = a;
        return solutions;
    }

    public static void main(String[] args) {

    }
}
