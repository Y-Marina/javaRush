package com.javarush.task.task14.task1420;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
НОД
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = new Integer(br.readLine());
        int b = new Integer(br.readLine());
        br.close();
        for(int i = a; i>0; i--) {
            if((a%i==0)&&(b%i==0)) {
                System.out.println(i);
                break;
            }
        }
    }
}
