## Exercise 2: Writing Basic JUnit Tests

### Objective
Write unit tests for a simple Java class using JUnit 4.

### What I Did
1. Created a class named `TemperatureConverter` with two methods:
    - `toFahrenheit(double celsius)` – converts Celsius to Fahrenheit
    - `toCelsius(double fahrenheit)` – converts Fahrenheit to Celsius

2. Wrote a test class `TemperatureConverterTest` using JUnit.
3. Added two test methods to verify both conversions.
4. Used `assertEquals` with a delta value to check floating-point results.

## Folder Structure

```
Exercise2_BasicJUnitTest/
├── pom.xml
├── README.md
├── TemperatureConverterTest_Output.png
└── src/
    ├── main/
    │   └── java/
    │       └── com/
    │           └── example/
    │               └── TemperatureConverter.java
    └── test/
        └── java/
            └── com/
                └── example/
                    └── TemperatureConverterTest.java
```