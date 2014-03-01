package com.xiaobai.crawl.gfx;

import java.awt.image.BufferedImage;

public class SpriteSheet {
    public int width, height;
    public int[] pixels;

    public SpriteSheet(BufferedImage image) {
        width = image.getWidth();
        height = image.getHeight();
    }
}
