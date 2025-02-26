package me.game.objects.tiles;

import me.game.objects.Images.Images;

import javax.swing.*;
import java.awt.*;
import java.util.Objects;

public class Block extends Tile{

    public Block(int x, int y) {
        super(x, y);
    }

    @Override
    public void render(Graphics2D g, int tileSize) {
        g.drawImage(new ImageIcon(Objects.requireNonNull(getClass().getClassLoader().getResource(new Images().getBlockImage()))).getImage(), x * tileSize, y * tileSize, tileSize, tileSize, null);
    }
}