package me.game.movement;

import me.game.Game;

public class MovePlayer extends Keys {

    protected Game game;

    public double centerX = 23.5;
    public double centerY = 25.5;
    double speed;

    public MovePlayer(Game game) {
        this.game = game;
        this.speed = game.getSpeed();

    }

    public void move() {
        if (W) {
            centerY += 1 * speed;
        }
        if (A) {
            centerX -= 1 * speed;
        }
        if (S) {
            centerY -= 1 * speed;
        }
        if (D) {
            centerX += 1 * speed;
        }


    }
}
