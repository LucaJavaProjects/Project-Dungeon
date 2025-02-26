package me.game;

import me.game.movement.Keys;
import me.game.movement.MovePlayer;
import me.game.movement.Tick;
import me.game.objects.creatures.Creature;
import me.game.objects.creatures.Player;

import javax.swing.*;
import java.awt.*;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Game extends JFrame {

    static Dimension dim = Toolkit.getDefaultToolkit().getScreenSize(); //Gets ScreenSize

    public final Display display;
    private final GameMap map;
    public final Player player;
    private final Keys keys = new Keys() {};
    private final Tick tick = new Tick(this);

    public final MovePlayer movePlayer = new MovePlayer(this);

    public Game() {
        super("me.Game");

        display = new Display(this);
        map = new GameMap(40);
        player = new Player(this, 1, getSpeed());


        addKeyListener(keys);

        //GUI

        int screen_Height = dim.height;
        int screen_Width = dim.width;
        setSize(screen_Width, screen_Height);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setExtendedState(Frame.MAXIMIZED_BOTH);
        setLocationRelativeTo(null);
        setUndecorated(true);
        setResizable(false);
        setVisible(true);

        //GameLoop

        startGameLoop();

        //System.out

        System.out.println("Display loaded");
        System.out.println("Map loaded");
        System.out.println("Player loaded");
        System.out.println("KeyListener added");
        System.out.println("Width: " + screen_Width + ", Height: " + screen_Height);
        System.out.println("TileSize: " + map.getTileSize());
        System.out.println("PlayerLook: " + player.getCenterX() + ", " + player.getCenterY() + ", " + player.getRadius());
        System.out.println("PlayerAttributes: Attack: " + player.getAttack() + ", Defense: " + player.getDefense() + ", Health: " + player.getHealth() + ", MaxHealth: " + player.getMax_health() + ", Speed: " + player.getSpeed());
        System.out.println("Undecorated: " + isUndecorated());
        System.out.println("Resizable: " + isResizable());
        System.out.println("GameLoop: " + startGameLoop());
    }

    private void tick() {
        tick.tick();
    }

    private boolean startGameLoop() {
        Executors.newSingleThreadScheduledExecutor().scheduleAtFixedRate(() -> {
            tick();
            display.repaint();
        }, 0L, 1000L / 144L, TimeUnit.MILLISECONDS);
        return true;
    }

    //Main

    public static void main(String[] args) {
        new Game();
    }
    
    //Getter

    public GameMap getMap() {
        return map;
    }

    //Render

    public void render(Graphics2D g2) {
        g2.setColor(Color.BLACK);
        g2.fillRect(0, 0, getWidth(), getHeight());

        map.render(g2, map.getTileSize());
        player.render(g2, map.getTileSize());
    }

    public double getSpeed() {
        return 0.12;
    }
}