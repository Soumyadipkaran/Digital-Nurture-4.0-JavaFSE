# Exercise 3: Argument Matching in Mockito

## Overview
In this exercise, I tested whether a mocked method was called with specific arguments. Mockito's `ArgumentMatchers` made it easy to verify just the parts I care about.

## What I Built
- I created an interface `Notifier` to simulate a notification service.
- The `AlertService` class uses this notifier to send messages.
- In the test, I mocked the `Notifier`, called `sendAlert()` on `AlertService`, and then verified that:
    - The correct user ID (`"user_101"`) was used.
    - The message passed to `send()` contained the word `"expire"`.

### Folder Structure
```
Exercise3_ArgumentMatching/
    ├── src/
    │   ├── main/
    │   │   └── java/
    │   │       └── com/example/
    │   │           ├── Notifier.java
    │   │           └── AlertService.java
    │   └── test/
    │       └── java/
    │           └── com/example/
    │               └── AlertServiceTest.java
    ├── pom.xml
    └── README.md