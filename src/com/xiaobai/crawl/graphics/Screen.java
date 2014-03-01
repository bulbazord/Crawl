package com.xiaobai.crawl.graphics;

import java.util.Random;

public class Screen {
    private int width, height;
    public int[] pixels;
    public int[] tiles = new int[64 * 64];
    private Random rand;

    public Screen(int w, int h) {
        width = w;
        height = h;
        pixels = new int[width * height];
        rand = new Random();
        for (int i = 0; i < tiles.length; i++) {
            tiles[i] = random.nextInt(0x1000000);
        }

    }

    public void clear() {
        for (int i = 0; i < pixels.length; i++) {
            pixels[i] = 0x000000;
        }
    }

    public void render() {
        for (int y = 0; y < height; y++) {
            if (y < 0 || y >= height) break;
            for (int x = 0; x < width; x++) { 
                if (x < 0 || x >= width) break;
                pixels[x + y * width] = 0xFF00FF;
            }
        }
    }
}
