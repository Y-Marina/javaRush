package com.javarush.games.spaceinvaders.gameobjects;

import com.javarush.engine.cell.Game;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ship extends GameObject {
    public boolean isAlive = true;
    private List<int[][]> frames;
    private int frameIndex;
    private boolean loopAnimation = false;

    public Ship(double x, double y) {
        super(x, y);
    }

    public void setStaticView(int[][] viewFrame) {
        setMatrix(viewFrame);
        frames = new ArrayList<>();
        frames.add(viewFrame);
        frameIndex = 0;
    }

    public Bullet fire() {
        return null;
    }

    public void kill() {
        isAlive = false;
    }

//    public void setAnimatedView(int[][]... viewFrames) {
//        setMatrix(viewFrames[0]);
//        frames = Arrays.asList(viewFrames);
//        frameIndex = 0;
//    }

    public void nextFrame() {
        frameIndex++;

        if (frameIndex >= frames.size()) {
            if (loopAnimation) {
                frameIndex = 0;
            } else {
                return;
            }
        }

        matrix = frames.get(frameIndex);
        if (frameIndex >= frames.size() && !loopAnimation) return;
        if (frameIndex >= frames.size() && loopAnimation) frameIndex = 0;
    }

    @Override
    public void draw(Game game) {
        super.draw(game);
        nextFrame();
    }

    public boolean isVisible() {
        if (!isAlive && frameIndex >= frames.size()) {
            return false;
        } else return true;
    }

    public void setAnimatedView(boolean isLoopAnimation, int[][]... viewFrames) {
        loopAnimation = isLoopAnimation;
    }
}
