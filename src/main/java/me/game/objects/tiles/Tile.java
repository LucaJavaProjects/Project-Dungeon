package me.game.objects.tiles;

import me.game.objects.GameObject;

public abstract class Tile extends GameObject {

    protected final int x;

    protected final int y;

    public Tile(int x, int y) {
        super();
        this.x = x;
        this.y = y;
    }
}
