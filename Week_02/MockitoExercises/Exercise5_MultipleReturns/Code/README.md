## Exercise 5: Mocking and Stubbing with Multiple Returns

## Overview
This exercise shows how to stub a mock method to return different values on consecutive calls. This is useful when a method is called multiple times in a single test and needs to behave differently each time.


## What I Did

1. Created an interface `WeatherApi` with a method `getForecast()`.
2. Built a service class `WeatherService` that calls `getForecast()` three times.
3. Wrote a test using Mockito to:
    - Mock `WeatherApi`
    - Stub it to return `"Sunny"`, `"Cloudy"`, and `"Rainy"` on consecutive calls
    - Verify that `WeatherService` returned the correct sequence


### Folder Structure

```
Exercise5_MultipleReturns/
├── src/
│   ├── main/
│   │   └── java/
│   │       └── com/example/
│   │           ├── WeatherApi.java
│   │           └── WeatherService.java
│   └── test/
│       └── java/
│           └── com/example/
│               └── WeatherServiceTest.java
├── README.md
└── pom.xml
```