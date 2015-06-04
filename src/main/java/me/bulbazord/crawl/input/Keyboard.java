package me.bulbazord.crawl.input;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.List;
import java.util.ArrayList;

import me.bulbazord.crawl.input.Key;

public class Keyboard implements KeyListener {
    public List<Key> keys = new ArrayList<Key>();

    public Key up = new Key(keys);
    public Key down = new Key(keys);
    public Key left = new Key(keys);
    public Key right = new Key(keys);

    public void toggle(KeyEvent ke, boolean pressed) {
        if (ke.getKeyCode() == KeyEvent.VK_W) up.toggle(pressed);
        if (ke.getKeyCode() == KeyEvent.VK_S) down.toggle(pressed);
        if (ke.getKeyCode() == KeyEvent.VK_A) left.toggle(pressed);
        if (ke.getKeyCode() == KeyEvent.VK_D) right.toggle(pressed);
    }

    public void keyPressed(KeyEvent ke) {
        toggle(ke, true);
    }

    public void keyReleased(KeyEvent ke) {
        toggle(ke, false);
    }

    public void keyTyped(KeyEvent ke) {
    }
}
