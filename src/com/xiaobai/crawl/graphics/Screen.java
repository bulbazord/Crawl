package com.xiaobai.crawl.graphics;

import java.util.Random;

public class Screen {
    public static int TILE_SIZE = 32;
    public final int MAP_SIZE = 64;
    public final int MAP_SIZE_MASK = MAP_SIZE - 1;

    private int width, height;
    public int[] pixels;
    public int[] tiles;
    private Random rand;

    public Screen(int w, int h) {
        width = w;
        height = h;
        pixels = new int[width * height];
        rand = new Random();
        tiles = new int[MAP_SIZE * MAP_SIZE];
        for (int i = 0; i < tiles.length; i++) {
            tiles[i] = rand.nextInt(0xFFFFFF);
        }

    }

    public void clear() {
        for (int i = 0; i < pixels.length; i++) {
            pixels[i] = 0x000000;
        }
    }

    public void render(int xOffset, int yOffset) {
        for (int y = 0; y < height; y++) {
            int yy = y + yOffset;
            for (int x = 0; x < width; x++) { 
                int xx = x + xOffset; 
                int tileIndex = ((xx >> 5) & MAP_SIZE_MASK) + ((yy >> 5) & MAP_SIZE_MASK) * MAP_SIZE;
                pixels[x + y * width] = tiles[tileIndex];
            }
        }
    }
}
