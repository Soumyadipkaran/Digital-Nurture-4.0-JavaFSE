## Exercise 6: Proxy Pattern – Lazy Image Loader

### What Was the Task

Build a simple image viewer system where images are loaded from a remote server.  
Use the Proxy Pattern to delay image loading until needed, and reuse it without reloading.

### What I Learned

### Proxy Pattern

The Proxy Pattern provides a placeholder for another object to control access to it.

- Only creates the real object when needed (lazy loading)
- Caches and reuses the object to avoid reloading

### Real Use Case Example
- Just like in a photo app:
- When the image is needed, it loads.
- When viewed again, it doesn’t reload — it just displays it from memory (cache).