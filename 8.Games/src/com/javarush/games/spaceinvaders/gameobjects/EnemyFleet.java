package com.javarush.games.spaceinvaders.gameobjects;

import com.javarush.engine.cell.Game;
import com.javarush.games.spaceinvaders.Direction;
import com.javarush.games.spaceinvaders.ShapeMatrix;
import com.javarush.games.spaceinvaders.SpaceInvadersGame;

import java.util.ArrayList;
import java.util.List;

public class EnemyFleet {
    private static final int ROWS_COUNT = 3;
    private static final int COLUMNS_COUNT = 10;
    private static final int STEP = ShapeMatrix.ENEMY.length + 1;
    private List<EnemyShip> ships;
    private Direction direction = Direction.RIGHT;

    private void createShips() {
        ships = new ArrayList<>();
        for (int y = 0; y < ROWS_COUNT; y++) {
            for (int x = 0; x < COLUMNS_COUNT; x++) {
                ships.add(new EnemyShip(x * STEP, y * STEP + 12));
            }
        }
        Boss boss = new Boss(STEP * COLUMNS_COUNT / 2 - ShapeMatrix.BOSS_ANIMATION_FIRST.length / 2 - 1, 5);
        ships.add(boss);
    }

    public EnemyFleet() {
        createShips();
    }

    public void draw(Game game) {
        for (EnemyShip ship : ships) {
            ship.draw((SpaceInvadersGame) game);
        }
    }

    private double getLeftBorder() {
        double minX = ships.get(0).x;
        for (EnemyShip ship : ships) {
            if (ship.x < minX) {
                minX = ship.x;
            }
        }
        return minX;
    }

    private double getRightBorder() {
        double maxX = ships.get(0).x + ships.get(0).width;
        for (EnemyShip ship : ships) {
            if (ship.x + ship.width > maxX) {
                maxX = ship.x + ship.width;
            }
        }
        return maxX;
    }

    private double getSpeed() {
        return Math.min(2.0, 3.0 / ships.size());
    }

    public void move() {
        if (ships.isEmpty()) return;
        boolean isChange = false;
        if (direction == Direction.LEFT & getLeftBorder() < 0) {
            direction = Direction.RIGHT;
            isChange = true;
        }
        if (direction == Direction.RIGHT & getRightBorder() > SpaceInvadersGame.WIDTH) {
            direction = Direction.LEFT;
            isChange = true;
        }
        double speed = getSpeed();
        if (isChange) {
            for (EnemyShip ship : ships) {
                ship.move(Direction.DOWN, speed);
            }
        } else {
            for (EnemyShip ship : ships) {
                ship.move(direction, speed);
            }
        }
    }

    public Bullet fire(Game game) {
        if (ships.isEmpty()) return null;
        int v = game.getRandomNumber(100 / SpaceInvadersGame.COMPLEXITY);
        if (v > 0) return null;
        EnemyShip ship = ships.get(game.getRandomNumber(ships.size()));

        for (EnemyShip s : ships) {
            if (s.x == ship.x && s.y > ship.y) {
                ship = s;
            }
        }

        return ship.fire();
    }

//    public void verifyHit(List<Bullet> bullets) {
//        for (Bullet bullet :
//                bullets) {
//            for (EnemyShip ship :
//                    ships) {
//                if (ship.isAlive && bullet.isAlive && ship.isCollision(bullet)) {
//                    ship.kill();
//                    bullet.kill();
//                }
//            }
//        }
//    }

    public void deleteHiddenShips() {
        for (EnemyShip ship :
                new ArrayList<>(ships)) {
            if (!ship.isVisible()) {
                ships.remove(ship);
            }
        }
    }

    public double getBottomBorder() {
        double bottom = 0;
        for (GameObject ship : ships) {
            if (ship.y + ship.height > bottom) {
                bottom = ship.y + ship.height;
            }
        }
        return bottom;
    }

    public int getShipsCount() {
        return ships.size();
    }

    public int verifyHit(List<Bullet> bullets) {
        if (bullets.isEmpty()) return 0;
        int score = 0;
        for (Bullet bullet : bullets) {
            for (EnemyShip ship : ships) {
                if (ship.isAlive && bullet.isAlive && ship.isCollision(bullet)) {
                    ship.kill();
                    bullet.kill();
                    score += ship.score;
                }
            }
        }
        return score;
    }
}
