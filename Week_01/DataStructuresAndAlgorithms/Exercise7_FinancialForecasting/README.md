# Exercise 7: Financial Forecasting

## Problem Statement

We are asked to create a financial forecasting tool that predicts future values based on past data.  
The focus is on understanding and using **recursion** to solve the problem.

---

## What I Understood from the Question

### 1. What is Recursion?
Recursion means a function calling itself to solve smaller versions of a problem until it reaches a base case.  
It helps to write shorter and cleaner code, especially for problems that repeat in smaller steps.

Example:  
To find future value after 3 years, we can calculate:


We can solve this using recursion instead of repeating the formula manually.

---

### 2. What We Need to Do (Steps from the Question)

- Create a recursive function that takes:
  - Current value
  - Growth rate (like 10% = 0.10)
  - Number of years
- Multiply the value by `(1 + rate)` for each year using recursion.
- Stop when years = 0 (base case).
- Print the forecasted future value.
- Analyze how recursion works and how we can optimize it if needed.

---

## How I Implemented It

### Class: `FinancialForecast`

- I created a class with a method called `futureValue`.
- This method takes the current value, growth rate, and number of years.
- It calls itself recursively until the number of years becomes 0.

### Recursive Logic

```java
if (years == 0) {
    return currentValue; // Base case
}
return futureValue(currentValue * (1 + growthRate), growthRate, years - 1); // Recursive step
