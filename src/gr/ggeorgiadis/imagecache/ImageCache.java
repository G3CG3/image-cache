package gr.ggeorgiadis.imagecache;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.WeakHashMap;

public class ImageCache {
    private WeakHashMap<File, BufferedImage> cache = new WeakHashMap<>();

    public BufferedImage loadImage(File file) throws IOException {
        if (cache.containsKey(file)) {
            System.out.println("Loaded from cache: " + file.getName());
            return cache.get(file);
        } else {
            System.out.println("Loading from disk: " + file.getName());
            BufferedImage image = ImageIO.read(file);
            cache.put(file, image);
            return image;
        }
    }

    public int cacheSize() {
        return cache.size();
    }
}
