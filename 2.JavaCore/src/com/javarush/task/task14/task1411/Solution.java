package com.javarush.task.task14.task1411;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
User, Loser, Coder and Proger
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Person person = null;
        String key = null;

        //тут цикл по чтению ключей, пункт 1
        List<String> keys = new ArrayList<>();
        List<Person> persons = new ArrayList<>();

        while(((key = reader.readLine()).equals("user"))
                ||(key.equals("loser"))
                ||(key.equals("coder"))
                ||(key.equals("proger"))){
            keys.add(key);
        }
        for(String key1 : keys){
            switch (key1){
                case "user": persons.add(new Person.User());
                break;
                case "loser": persons.add(new Person.Loser());
                break;
                case "coder": persons.add(new Person.Coder());
                break;
                case "proger": persons.add(new Person.Proger());
                break;
            }
        }
        for(Person person1 : persons){
            doWork(person1);
        }

//            doWork(person); //вызываем doWork
    }

    public static void doWork(Person person) {
        // пункт 3
        if (person instanceof Person.User) {
            Person.User user = (Person.User) person;
            user.live();
        } else if (person instanceof Person.Loser) {
            Person.Loser loser = (Person.Loser) person;
            loser.doNothing();
        } else if (person instanceof Person.Coder) {
            Person.Coder coder = (Person.Coder) person;
            coder.writeCode();
        } else if (person instanceof Person.Proger) {
            Person.Proger proger = (Person.Proger) person;
            proger.enjoy();
        }
    }
}
