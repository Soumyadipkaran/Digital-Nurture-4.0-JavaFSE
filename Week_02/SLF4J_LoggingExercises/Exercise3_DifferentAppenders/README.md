# Exercise 3: Using Different Appenders

## Objective
Demonstrate how to configure and use multiple logging outputs (appenders) using SLF4J with Logback.

## What I Did
- Added SLF4J and Logback dependencies to the project using `pom.xml`.
- Created a `logback.xml` configuration file to define
- Used SLF4J in a Java class to log informational, warning, and error messages.

## Folder Structure

```
Exercise3_DifferentAppenders/
├── pom.xml
├── README.md
├── AppenderExample_Output.png
├── src/
    └── main/
        ├── java/
        │   └── com/
        │       └── example/
        │           └── AppenderExample.java
        └── resources/
            └── logback.xml
```