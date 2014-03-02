package com.xiaobai.crawl.graphics;

import java.util.Random;

public class Screen {
    private static int TILE_SIZE = 32;

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
            tiles[i] = rand.nextInt(0xFFFFFF);
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
                int tileIndex = (x / TILE_SIZE) + (y / TILE_SIZE) * 64;
                pixels[x + y * width] = tiles[tileIndex];
            }
        }
    }
}
