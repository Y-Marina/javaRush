package com.javarush.task.task21.task2113;

import java.util.*;

public class Hippodrome {

    private List<Horse> horses;

    public List<Horse> getHorses() {
        return horses;
    }

    static Hippodrome game;

    public Hippodrome(List<Horse> horses) {
        this.horses = horses;
    }

    public static void main(String[] args) throws InterruptedException {
        ArrayList<Horse> horses = new ArrayList<>();

        horses.add(new Horse("Clever", 3, 0));
        horses.add(new Horse("Lucky", 3, 0));
        horses.add(new Horse("Seven", 3, 0));

        game = new Hippodrome(horses);

        game.run();

        game.printWinner();
    }

    void run() throws InterruptedException {
        for (int i = 0; i < 100; i++) {
            move();
            print();
            Thread.sleep(200);
        }
    }

    void move() {
       for (Horse horse: horses) {
           horse.move();
       }
    }

    void print() {
        for (Horse horse: horses) {
            horse.print();
        }
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
    }

    public Horse getWinner() {
        Horse result = horses.get(0);
        for (Horse horse: horses) {
            if (horse.getDistance() > result.getDistance())
                result = horse;
        }
        return result;
    }

    public void printWinner() {
        System.out.println("Winner is " + getWinner().getName() + "!");
    }
}
