## Exercise 2: Verifying Interactions using Mockito

### Objective
To verify whether a method in a mock object was called with specific arguments.

### What I Did
1. Defined an `ExternalApi` interface with a method `getData()`.
2. Implemented `MyService` class that uses `ExternalApi` to fetch data.
3. In the test class `MyServiceTest`:
    - Created a mock of `ExternalApi` using Mockito.
    - Passed the mock into the service.
    - Called the `fetchData()` method.
    - Used `verify()` to ensure `getData()` was actually called.

### Folder Structure

```
Exercise2_VerifyingInteractions/
    ├── src/
    │   ├── main/
    │   │   └── java/
    │   │       └── com/example/
    │   │           ├── ExternalApi.java
    │   │           └── MyService.java
    │   └── test/
    │       └── java/
    │           └── com/example/
    │               └── MyServiceTest.java
    ├── pom.xml
    └── README.md
```