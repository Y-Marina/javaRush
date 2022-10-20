package com.javarush.task.task17.task1711;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD 2
*/

public class Solution {
    public static volatile List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) {
        switch (args[0]) {
            case "-c":
                synchronized (allPeople) {
                    create(args);
                }
                break;
            case "-u":
                synchronized (allPeople) {
                    update(args);
                }
                break;
            case "-d":
                synchronized (allPeople) {
                    delete(args);
                }
                break;
            case "-i":
                synchronized (allPeople) {
                    information(args);
                }
                break;
        }
    }

    public synchronized static void create(String[] args) {
        SimpleDateFormat birthDayFormat = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
        for (int i = 1; i < args.length; i = i + 3) {
            String name = args[i];
            Sex sex = getSex(args[i + 1]);
            Date birthDayDate = parseDate(birthDayFormat, args[i + 2]);
            if (sex.equals(Sex.MALE)) {
                Person person = Person.createMale(name, birthDayDate);
                allPeople.add(person);
                System.out.println(allPeople.indexOf(person));
            } else if (sex.equals(Sex.FEMALE)) {
                Person person = Person.createFemale(name, birthDayDate);
                allPeople.add(person);
                System.out.println(allPeople.indexOf(person));
            }
        }
    }

    public static synchronized void update(String[] args) {
        SimpleDateFormat birthDayFormat = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
        for (int i = 1; i < args.length; i = i + 4) {
            Person person = allPeople.get(Integer.parseInt(args[i]));
            person.setName(args[i + 1]);
            person.setSex(getSex(args[i + 2]));
            person.setBirthDate(parseDate(birthDayFormat, args[i + 3]));
        }
    }

    public static synchronized void delete(String[] args) {
        for (int i = 1; i < args.length; i++) {
            Person person = allPeople.get(Integer.parseInt(args[i]));
            person.setName(null);
            person.setSex(null);
            person.setBirthDate(null);
        }
    }

    public static synchronized void information(String[] args) {
        SimpleDateFormat bdFormat = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
        for (int i = 1; i < args.length; i++) {
            Person person = allPeople.get(Integer.parseInt(args[i]));
            System.out.print(person.getName() + " ");
            System.out.print(getStringSex(person.getSex()) + " ");
            System.out.println(bdFormat.format(person.getBirthDate()));
        }
    }

    public static synchronized Date parseDate(SimpleDateFormat dateFormat, String date) {
        Date result = null;
        try {
            result = dateFormat.parse(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return result;
    }

    public static synchronized Sex getSex(String sexStr) {
        return sexStr.equals("м") ? Sex.MALE : Sex.FEMALE;
    }

    public static synchronized String getStringSex(Sex sex) {
        return sex.equals(Sex.MALE) ? "м" : "ж";
    }
}
