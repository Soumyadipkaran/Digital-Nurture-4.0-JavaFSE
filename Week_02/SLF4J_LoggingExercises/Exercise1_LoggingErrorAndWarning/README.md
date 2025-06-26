# Exercise 1: Logging Error and Warning using SLF4J

### Objective
Demonstrate how to use SLF4J with Logback to log error and warning messages in a Java application.

### What I Did
- Added `slf4j-api` and `logback-classic` dependencies to `pom.xml`.
- Created a simple Java class `LoggingExample`.
- Used SLF4J’s `Logger` to log:
    - an error message using `logger.error()`
    - a warning message using `logger.warn()`
- Ran the application and observed log messages in the console.

### Folder Structure
```
Exercise1_LoggingErrorAndWarning/
├── pom.xml
├── README.md
├── LoggingExample_Output.java
└── src/
    └── main/
        └── java/
            └── com/
                └── example/
                    └── LoggingExample.java
```