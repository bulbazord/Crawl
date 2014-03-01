package com.xiaobai.crawl.graphics;

public class Screen {
    private int width, height, time, counter;
    public int[] pixels;

    public Screen(int w, int h) {
        width = w;
        height = h;
        pixels = new int[width * height];
        counter = time = 0;
    }

    public void clear() {
        for (int i = 0; i < pixels.length; i++) {
            pixels[i] = 0;
        }
    }

    public void render() {
        counter++;
        if (counter % 10 == 0) {
            time++;
        }
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) { 
                pixels[time + time * width] = 0xFF00FF;
            }
        }
    }
}
