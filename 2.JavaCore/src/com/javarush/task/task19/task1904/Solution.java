package com.javarush.task.task19.task1904;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

/* 
И еще один адаптер
*/

public class Solution {

    public static void main(String[] args) {

    }

    public static class PersonScannerAdapter implements PersonScanner{
        private final Scanner fileScanner;

        public PersonScannerAdapter(Scanner fileScanner) {
            this.fileScanner = fileScanner;
        }

        @Override
        public Person read() throws IOException {
            String s = this.fileScanner.nextLine();
            String[] b = s.split(" ");
            String date = b[3] + "/" + b[4] + "/" + b[5];
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyy");
            Date datte = null;
            try {
                datte = simpleDateFormat.parse(date);
            } catch (ParseException e) {
                e.printStackTrace();
            }
            Person person = new Person(b[1], b[2], b[0],datte);

            return person;
        }

        @Override
        public void close() throws IOException {
            fileScanner.close();
        }
    }
}
