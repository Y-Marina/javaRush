package com.javarush.task.task17.task1710;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD
*/

public class Solution {
    public static List<Person> allPeople = new ArrayList<Person>();
    public static SimpleDateFormat formatBD = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);


    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) {
        switch (args[0]) {
            case "-c":
                addPeople(args[1], args[2], args[3]);
                break;
            case "-r":
                printInfo(args[1]);
                break;
            case "-u":
                update(args[1], args[2], args[3], args[4]);
                break;
            case "-d":
                deletePeople(args[1]);
                break;
        }
    }

    public static void addPeople(String name, String sex, String bDay) {
        Date bd = null;
        try {
            bd = formatBD.parse(bDay);
        } catch (ParseException exception) {
            exception.printStackTrace();
        }
        Person person = null;
//Birth day добавляется определенным видом, поэтому, для того, чтобы добавить дату, необходимо распарсить аргумент
        if (sex.equals("м")) {
            person = Person.createMale(name, bd);
        } else if (sex.equals("ж")) {
            person = Person.createFemale(name, bd);
        }
        allPeople.add(person);

        System.out.println(allPeople.indexOf(person));//Выводит id добавленного человека
    }

    public static void printInfo(String index) {
        SimpleDateFormat bdFormat = new SimpleDateFormat("dd-MMM-YYYY", Locale.ENGLISH);
        int id = Integer.parseInt(index);
        Person person = allPeople.get(id);
        String name = person.getName();
        String sex = person.getSex().equals(Sex.MALE) ? "м" : "ж";
        String bd = bdFormat.format(person.getBirthDate());
        System.out.printf("%s %s %s", name, sex, bd);
    }

    public static void update(String index, String name, String sex, String bDay) {
        int id = Integer.parseInt(index);
        Date bd = null;
        try {
            bd = formatBD.parse(bDay);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        Person person = allPeople.get(id);
        person.setName(name);
        if (sex.equals("м"))
            person.setSex(Sex.MALE);
        else if (sex.equals("ж"))
            person.setSex(Sex.FEMALE);
        person.setBirthDate(bd);
    }

    public static void deletePeople(String index) {
        int id = Integer.parseInt(index);
        Person person = allPeople.get(id);
        person.setBirthDate(null);
        person.setSex(null);
        person.setName(null);
    }
}
