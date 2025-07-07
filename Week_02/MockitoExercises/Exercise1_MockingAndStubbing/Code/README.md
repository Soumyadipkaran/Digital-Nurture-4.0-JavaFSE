## Exercise 1: Mocking and Stubbing (Mockito)

### Objective
To test a service class that depends on an external API by mocking the external dependency and controlling its behavior using Mockito.

### What I Did
1. Created an interface `ExternalApi` to represent an external service dependency.
2. Developed a class `MyService` that relies on the `ExternalApi` interface to fetch data.
3. Wrote a unit test class `MyServiceTest` using JUnit 4 and Mockito.
4. Used `Mockito.mock()` to create a mock object of the `ExternalApi`.
5. Stubbed the `getData()` method to return `"Mock Data"` when called.
6. Injected the mock into `MyService` and verified the returned result with an assertion.

### Folder Structure
```
MockitoExercises/
    └── Exercise1_MockingAndStubbing/
        ├── src/
        │   ├── main/
        │   │   └── java/
        │   │       └── com/
        │   │           └── example/
        │   │               ├── ExternalApi.java
        │   │               └── MyService.java
        │   └── test/
        │       └── java/
        │           └── com/
        │               └── example/
        │                   └── MyServiceTest.java
        ├── pom.xml
        └── README.md
```

