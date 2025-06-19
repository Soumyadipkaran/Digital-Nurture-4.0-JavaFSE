# Exercise 1 : Singleton Pattern - Logger Utility

## Problem Statement

We are asked to build a logging utility using the Singleton Pattern.

The goal is to make sure that:
- Only **one object (instance)** of the Logger class is created.
- The same instance is used everywhere in the application.
- This helps in keeping the logging consistent and avoids creating multiple logger objects.


## What I Understood

### What is the Singleton Pattern?

The Singleton Pattern ensures that only **one object** of a class is created and gives a **global access point** to it.

We use this when:
- We want to control object creation.
- We need only one instance for tasks like logging, configuration, cache, etc.

### Key Concepts:
- Make the constructor `private` so no one can create objects from outside.
- Use a `static` variable to hold the single instance.
- Provide a `static method` (usually `getInstance()`) to return that single object.


## How I Implemented It

### Step 1: Logger Class

- I created a class `Logger` inside my main class.
- I made the constructor `private` so it cannot be called from outside.
- I added a static field `instance` that holds the only Logger object.

### Step 2: Singleton Logic

- The method `getInstance()` checks if the instance is already created.
- If not, it creates the object.
- If yes, it returns the existing one.

### Step 3: Test the Singleton

- I created two Logger objects: `logger1` and `logger2` using `getInstance()`.
- Then I checked if both point to the same object using `==`.
- I also added logging messages using the `log()` method.