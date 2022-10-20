package com.javarush.games.minigames.mini01;

import com.javarush.engine.cell.Color;
import com.javarush.engine.cell.Game;

public class FirstGame extends Game {

    @Override
    public void initialize() {
        super.initialize();
        setScreenSize(5, 7);
        showShip();
    }

    public static final int[][] SHIP = new int[][]{
            {0, 0, 7, 0, 0},
            {0, 7, 7, 7, 0},
            {0, 7, 0, 7, 0},
            {0, 7, 7, 7, 0},
            {0, 7, 0, 7, 0},
            {7, 7, 7, 7, 7},
            {7, 0, 7, 0, 7},
    };

    //напишите тут ваш код

    public void showShip() {
        for (int i = 0; i < SHIP.length; i++) {
            for (int j = 0; j < SHIP[0].length; j++) {
                setCellColor(j, i, Color.values()[SHIP[i][j]]);
            }
        }
    }
}
