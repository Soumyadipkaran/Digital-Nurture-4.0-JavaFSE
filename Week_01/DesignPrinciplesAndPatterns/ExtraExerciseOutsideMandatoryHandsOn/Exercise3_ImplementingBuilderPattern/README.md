# Exercise 3: Implementing the Builder Pattern

This exercise shows how to use the Builder Pattern to create different types of `Computer` objects with optional parts like CPU, RAM, and Storage.

## What I Did

- Created a `Computer` class with fields: cpu, ram, and storage.
- Used a static nested `Builder` class inside `Computer`.
- Builder has methods to set each part and a `build()` method to return the final object.
- The main class shows how to build different configurations using method chaining.