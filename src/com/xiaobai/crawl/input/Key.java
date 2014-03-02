package com.xiaobai.crawl.input;

import java.util.List;

public class Key {
    public boolean down, movedAlready;
    public int presses;
    public Key(List<Key> keys) {
        keys.add(this);
    }

    public void toggle(boolean pressed) {
        if (pressed != down) {
            down = pressed;
        }
        if (pressed) {
            presses++;
        }
    }

    public boolean move() {
        if (down == true && movedAlready == false) {
            movedAlready = true;
            return true;
        } else if (down == false && movedAlready == true) {
            movedAlready = false;
            return false;
        }
        return false;
    }
}
