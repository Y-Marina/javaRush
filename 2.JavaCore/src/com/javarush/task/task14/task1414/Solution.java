package com.javarush.task.task14.task1414;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
MovieFactory
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //ввести с консоли несколько ключей (строк), пункт 7
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        boolean trigger = false;
        String key;
        while(!trigger){
            trigger = true;
            key = reader.readLine();
            if("cartoon".equals(key) || "thriller".equals(key) || "soapOpera".equals(key)){
                trigger = false;
                Movie movie = MovieFactory.getMovie(key);
                System.out.println(movie.getClass().getSimpleName());
            }
            else{
                MovieFactory.getMovie(key);
            }
        }
    }

    static class MovieFactory {

        static Movie getMovie(String key) {
            Movie movie = null;

            //создание объекта SoapOpera (мыльная опера) для ключа "soapOpera"
            if ("soapOpera".equals(key)) {
                movie = new SoapOpera();
            }

            //напишите тут ваш код, пункты 5,6
            else if ("cartoon".equals(key)){
                movie = new Cartoon();
            }
            else if("thriller".equals(key)){
                movie = new Thriller();
            }

            return movie;
        }
    }

    static abstract class Movie {
    }

    static class SoapOpera extends Movie {
    }

    //Напишите тут ваши классы, пункт 3
    //Добавить классы Cartoon, Thriller.
    static class Cartoon extends Movie{

    }
    static class Thriller extends Movie{

    }
}
