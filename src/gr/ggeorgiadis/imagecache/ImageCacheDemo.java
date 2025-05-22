package gr.ggeorgiadis.imagecache;

import java.io.File;
import java.io.IOException;

public class ImageCacheDemo {
    public static void main(String[] args) throws IOException, InterruptedException {
        ImageCache cache = new ImageCache();

        File image1 = new File("sample1.jpg");
        File image2 = new File("sample2.jpg");

        cache.loadImage(image1);
        cache.loadImage(image2);
        System.out.println("Cache size after loading: " + cache.cacheSize());

        System.gc();
        Thread.sleep(10000);

        System.out.println("Cache size after GC: " + cache.cacheSize());

        cache.loadImage(image1);
    }
}
