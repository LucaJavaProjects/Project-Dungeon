package me.game.movement;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public abstract class Keys implements KeyListener {

    boolean W = false;
    boolean A = false;
    boolean S = false;
    boolean D = false;

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()) {
            case KeyEvent.VK_W -> {
                boolean W = true;
                System.out.println("W");
            }
            case KeyEvent.VK_A -> {
                boolean A = true;
                System.out.println("A");
            }
            case KeyEvent.VK_S -> {
                boolean S = true;
                System.out.println("S");
            }
            case KeyEvent.VK_D -> {
                boolean D = true;
                System.out.println("D");
            }
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        switch (e.getKeyCode()) {
            case KeyEvent.VK_W -> {
                boolean W = false;
                System.out.println("WStop");
            }
            case KeyEvent.VK_A -> {
                boolean A = false;
                System.out.println("AStop");
            }
            case KeyEvent.VK_S -> {
                boolean S = false;
                System.out.println("SStop");
            }
            case KeyEvent.VK_D -> {
                boolean D = false;
                System.out.println("DStop");
            }
        }
    }

    public boolean isW() {
        return W;
    }
    public boolean isA() {
        return A;
    }
    public boolean isS() {
        return S;
    }
    public boolean isD() {
        return D;
    }
}
