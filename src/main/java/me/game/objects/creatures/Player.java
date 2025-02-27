package me.game.objects.creatures;

import me.game.Game;
import me.game.objects.Images.Images;
import me.game.objects.tiles.Air;
import me.game.objects.tiles.Dot;

import javax.swing.*;
import java.awt.*;
import java.util.Objects;


public class Player extends Creature {


    public Player(Game game, double radius, double speed) {
        super(game, game.movePlayer.centerX, game.movePlayer.centerY, radius, speed, Color.YELLOW, 100, 100, 10, 2);
    }


   private void DotCollision() {
        int x = (int) centerX;
        int y = (int) centerY;

        if (game.getMap().getTile(x, y) instanceof Dot dot) {
            double dx = dot.getCenterX() - centerX;
            double dy = dot.getCenterY() - centerY;
            double r = dot.getRadius() + radius;

            if (dx * dx + dy * dy < r + r) {
                game.getMap().setTile(x, y, new Air(x, y));
            }
        }
    }

    @Override
    public void render(Graphics2D g, int tileSize) {
        double centerXOnScreen = game.movePlayer.centerX * tileSize;
        double centerYOnScreen = game.movePlayer.centerY * tileSize;
        double radiusOnScreen = radius * tileSize;
        double diameterOnScreen = radiusOnScreen * 2.0;


        g.drawImage(new ImageIcon(Objects.requireNonNull(getClass().getClassLoader().getResource(new Images().getPlayerImage()))).getImage(), (int) (centerXOnScreen - radiusOnScreen), (int) (centerYOnScreen - radiusOnScreen), (int) diameterOnScreen, (int) diameterOnScreen, null);
    }
}