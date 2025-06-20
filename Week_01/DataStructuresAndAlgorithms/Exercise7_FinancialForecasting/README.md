# Exercise 7: Financial Forecasting

## Key Concept: Recursion

Recursion means a function calls itself until a base case is met.  
In this case, we multiply the value each year by `(1 + growth rate)` until years become 0.

## Steps Followed

- Defined a recursive method `futureValue(currentValue, growthRate, years)`
- Base case: if `years == 0`, return `currentValue`
- Recursive case: call the function again with `years - 1` and updated value

### Core Logic

```java
if (years == 0) {
    return currentValue;
}
return futureValue(currentValue * (1 + growthRate), growthRate, years - 1);
