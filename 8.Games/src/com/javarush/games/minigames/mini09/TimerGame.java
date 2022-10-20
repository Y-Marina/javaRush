package com.javarush.games.minigames.mini09;

import com.javarush.engine.cell.Color;
import com.javarush.engine.cell.Game;

/* 
Таймер
*/

public class TimerGame extends Game {

//    Color[] colors = Color.values();
//    int colorNumber = 0;

    @Override
    public void initialize() {
        setScreenSize(3, 3);
        setTurnTimer(1000);
    }

    //напишите тут ваш код

    @Override
    public void onTurn(int step) {
        if (step % 2 == 1) {
            // Если данный такт нечётный, установить клетке красный фон
            fillColor(Color.ORANGE);
        } else {
            // если данный такт чётный, установить клетке синий фон
            fillColor(Color.GREEN);
        }
        setCellNumber(1, 1, step);
//        fillNextColor();
    }

    private void fillColor(Color color) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                setCellColor(j, i, color);
            }
        }
    }

//    private void fillNextColor() {
//        if (colorNumber >= colors.length) colorNumber = 0;
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 3; j++) {
//                setCellColor(j, i, colors[colorNumber]);
//            }
//        }
//        colorNumber++;
//    }
}
