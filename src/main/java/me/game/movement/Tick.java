package me.game.movement;

import me.game.Game;

public class Tick {

    protected final Game game;

    public Tick(Game game) {
        this.game = game;
    }

    public void tick() {
        game.movePlayer.move();
        game.display.repaint();
        game.display.revalidate();
    }

}
