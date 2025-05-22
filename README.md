# Image Cache

A lightweight Java image caching system using `WeakHashMap` for automatic memory cleanup. This project demonstrates how cached images can be removed by the garbage collector when memory is tight or keys are no longer in use.

## 📌 Features

- In-memory image caching with `WeakHashMap`
- Automatic cleanup of unused entries via garbage collection
- Simple demo to showcase cache behavior before and after `System.gc()`

## 🚀 How It Works

- Images are loaded from disk and cached.
- If an image is requested again, it's retrieved from memory (cache hit).
- When keys are no longer referenced, they become eligible for garbage collection, and the cache is automatically cleaned.

## 🛠 Requirements

- Java 8 or higher


## ▶️ Usage

Run the `ImageCacheDemo` class. It will:
1. Load two images from disk
2. Cache them in memory
3. Suggest garbage collection
4. Reload an image to see if it was retained or evicted

## 📸 Sample Output
>Loading from disk: sample1.jpg <br>
>Loading from disk: sample2.jpg <br>
>Cache size after loading: 2 <br>
>Cache size after GC: 1 <br>
>Loading from disk: sample1.jpg

## 📝 License

This project is licensed under the MIT License - see the LICENSE file for details.

--- 

💡 Ideas to Extend
- Add LRU Caching (Least Recently Used)

- Add Manual Invalidation

- Support for More Image Formats

- Asynchronous Image Loading

- Disk-Based Cache Fallback

- Cache Statistics

- Verbose Logging Option

- JavaFX or Swing Image Viewer
