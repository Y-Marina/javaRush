package com.javarush.task.task15.task1531;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.Scanner;

/* 
Факториал
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int input = Integer.parseInt(reader.readLine());
        reader.close();

        System.out.println(factorial(input));
    }

    public static String factorial(int n) {
        //add your code here
        if (n>0){
            BigDecimal start = new BigDecimal("1");
            BigDecimal one = new BigDecimal("1");
            BigDecimal plusplus = new BigDecimal("1");
            for (int j = 1 ; j<=n ; j++)
            {
                start=start.multiply(one);
                one=one.add(plusplus);
            }
            return String.valueOf(start);
        }
        else if(n==0)return "1";
        else {return "0";}

//        return "";
    }
}
