# Exercise 1 : Singleton Pattern - Logger Utility

## What I Understood

### What is the Singleton Pattern?

The Singleton Pattern ensures that only ***one object*** of a class is created and gives a ***global access point*** to it.

### Key Concepts:
- Make the constructor `private` so no one can create objects from outside.
- Use a `static` variable to hold the single instance.
- Provide a `static method` (usually `getInstance()`) to return that single object.


## How I Implemented It

### Logger Class

- I created a class `Logger` inside my main class.
- I made the constructor `private` so it cannot be called from outside.
- I added a static field `instance` that holds the only Logger object.

### Singleton Logic

- The method `getInstance()` checks if the instance is already created.
- If not, it creates the object.
- If yes, it returns the existing one.

### Test the Singleton

- I created two Logger objects: `logger1` and `logger2` using `getInstance()`.
- Then I checked if both point to the same object using `==`.
- I also added logging messages using the `log()` method.