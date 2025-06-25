# Exercise 4: Handling Void Methods in Mockito

## Overview
This exercise demonstrates how to test a `void` method using Mockito. Void methods don't return anything, so we can't assert their result. Instead, we focus on verifying whether the method was called and what arguments it received.

## Scenario
We have a class called `UserManager` that registers a user and sends them a welcome email through an external `EmailService`. The `sendEmail()` method in `EmailService` is a `void` method.

## What I Did
- Defined the EmailService interface. This includes a `void sendEmail(String to, String subject, String body)` method.
- Created the UserManager class. This class takes an `EmailService` dependency via constructor. When a user registers, it calls `sendEmail()` with a welcome message.
- Wrote a unit test using Mockito. Created a mock of `EmailService`. Called `registerUser()` on `UserManager`. Used `verify()` to ensure that `sendEmail()` was called with the correct arguments.

## Why This Matters
Void methods are common in real applications — especially for tasks like logging, sending notifications, or saving data. While they don't return anything, it’s important to ensure they are triggered at the right time and with the right values.

### Folder Structure

```
Exercise4_HandlingVoidMethods/
├── src/
│   ├── main/
│   │   └── java/
│   │       └── com/example/
│   │           ├── EmailService.java
│   │           └── UserManager.java
│   └── test/
│       └── java/
│           └── com/example/
│               └── UserManagerTest.java
├── UserManagerTest_Output.png
├── README.md
└── pom.xml
```