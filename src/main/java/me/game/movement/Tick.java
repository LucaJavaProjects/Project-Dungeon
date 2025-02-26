package me.game.movement;

import me.game.Game;

public class Tick {

    protected final Game game;

    protected double centerX;
    protected double centerY;

    protected double speed;

    protected int preferredDirectionX;
    protected int preferredDirectionY;
    protected int movingDirectionX;
    protected int movingDirectionY;


    public Tick(Game game) {
        this.game = game;
    }

    public void tick() {
        game.movePlayer.move();
        game.display.repaint();
        game.display.revalidate();
    }

}
