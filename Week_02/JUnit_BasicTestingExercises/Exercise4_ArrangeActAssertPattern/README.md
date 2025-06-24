## Exercise 4: Arrange-Act-Assert (AAA) Pattern, Test Fixtures, Setup and Teardown Methods in JUnit

## Objective
Organize JUnit tests using the Arrange-Act-Assert (AAA) pattern, and utilize setup and teardown methods to manage test state.

## What I did
1. Created a test class named `CalculatorTest` in the appropriate package.
2. Used the `@Before` annotation to define a `setUp()` method which initializes the `Calculator` object before each test.
3. Wrote a test method `testAddition()` that follows the AAA pattern:
    - **Arrange**: Performed in `@Before`
    - **Act**: Called the `add()` method on the `Calculator`
    - **Assert**: Used `assertEquals` to verify the result
4. Used the `@After` annotation to define a `tearDown()` method that resets the test environment by setting the object to null.
5. Ran the test and confirmed successful execution with setup and teardown messages.

## Folder Structure

```
Exercise4_ArrangeActAssertPattern/
├── pom.xml
├── README.md
├── CalculatorTest_Output.png
└── src/
    ├── main/
    │   └── java/
    │       └── com/
    │           └── example/
    │               └── Calculator.java
    └── test/
        └── java/
            └── com/
                └── example/
                    └── CalculatorTest.java
```