Singleton Pattern – Simple Concept

This design pattern is used when we want to make sure that only one object of a class is created and used in the entire program.

Why we use it:
- Some classes should only have one instance. For example:
  → Logger (for printing logs)
  → Database connection
  → Configuration manager
- It saves memory and avoids issues from multiple objects doing the same job.

How it works (in simple steps):
1. The constructor is made private – so we can't create object from outside.
2. I create a private static variable that will store the single object.
3. A public static method is used to give that single object whenever needed.
   → If the object doesn’t exist, it creates one.
   → If it already exists, it gives the existing one.

This way, no matter how many times we call it, we always get the same single object.
