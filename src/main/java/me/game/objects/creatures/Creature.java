package me.game.objects.creatures;

import me.game.Game;
import me.game.GameMap;
import me.game.objects.GameObject;

import java.awt.*;

public abstract class Creature extends GameObject {

    protected final Game game;

    protected double centerX;
    protected double centerY;
    protected final double radius;

    protected double speed;
    protected double max_health;
    protected double health;
    protected double defense;
    protected double attack;

    protected Color color;

    public Creature(Game game, double centerX, double centerY, double radius, double speed, Color color, double max_health, double health, double defense, double attack) {
        this.game = game;
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
        this.speed = speed;
        this.color = color;
        this.max_health = max_health;
        this.health = health;
        this.defense = defense;
        this.attack = attack;
    }

    public double getCenterX() {
        return centerX;
    }
    public double getCenterY() {
        return centerY;
    }
    public double getRadius() {
        return radius;
    }
    public double getMax_health() {
        return max_health;
    }
    public double getHealth() {
        return health;
    }
    public double getSpeed() {
        return speed;
    }
    public double getDefense() {
        return defense;
    }
    public double getAttack() {
        return attack;
    }
    public Game getGame() {
        return this.game;
    }
}
