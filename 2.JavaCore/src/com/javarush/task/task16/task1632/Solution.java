package com.javarush.task.task16.task1632;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Клубок
*/

public class Solution {
    public static List<Thread> threads = new ArrayList<>(5);
    static Thread4 thread4 = new Thread4();

    static {
        threads.add(new Thread1());
        threads.add(new Thread2());
        threads.add(new Thread3());
        threads.add(thread4);
        threads.add(new Thread5());
    }

    public static void main(String[] args) throws InterruptedException {
        for (Thread thread : threads) {
            thread.start();
        }
        Thread.sleep(3000);
        if (thread4.isAlive()) {
            thread4.showWarning();
        }


    }


    public static class Thread1 extends Thread {

        @Override
        public void run() {
            while (true) {
                try {
                    Thread.sleep(10000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(1);
            }
        }
    }


    public static class Thread2 extends Thread {
        @Override
        public void run() {
            try {
                throw new InterruptedException();
            } catch (InterruptedException e) {
                System.out.println("InterruptedException");
            }
        }
    }


    public static class Thread3 extends Thread {

        @Override
        public void run() {
            while (true) {
                System.out.println("Ура");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }


    public static class Thread4 extends Thread implements Message {
        @Override
        public void showWarning() {
            this.interrupt();
        }

        @Override
        public void run() {
            while (!this.isInterrupted()) {
//                System.out.println("я работаю");
            }
        }
    }


    public static class Thread5 extends Thread {
        int i;

        @Override
        public void run() {
            BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
            try {

                while (true) {

                    String s = sc.readLine();
                    if (s.equals("N")) {
                        break;
                    } else i += Integer.valueOf(s);
                }
                sc.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println(i);
        }
    }
}