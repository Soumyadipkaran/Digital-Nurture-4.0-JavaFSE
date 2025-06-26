# Exercise 4: Functions

## Scenario 1: Calculate Age
- Returns a customer's age in years based on their date of birth.
- Function Name: `CalculateAge`
- File: `scenario1_calculate_age.sql`

### Example:
```
SELECT CalculateAge(TO_DATE('1985-05-15', '2025-06-26')) AS Age_John FROM dual;
SELECT CalculateAge(TO_DATE('1990-07-20', '2025-06-26')) AS Age_Jane FROM dual;
Age_John = 40
Age_Jane = 34
```
## Scenario 2: Calculate Monthly Installment
- Calculates monthly EMI based on loan amount, interest rate, and duration.
- Uses simple interest formula.
- Function Name: `CalculateMonthlyInstallment`
- File: `scenario2_calculate_emi.sql`

### Example:
```
SELECT CalculateMonthlyInstallment(5000, 5, 5) AS EMI FROM dual;
EMI = 104.17
```

## Scenario 3: Check Sufficient Balance
- Checks if an account has at least a certain balance.
- Returns TRUE or FALSE.
- Function Name: `HasSufficientBalance`
- File: `scenario3_check_balance.sql`

### Example:
```
DECLARE
    result BOOLEAN;
BEGIN
    result := HasSufficientBalance(1, 500);
    IF result THEN
        DBMS_OUTPUT.PUT_LINE('Sufficient balance.');
    ELSE
        DBMS_OUTPUT.PUT_LINE('Insufficient balance.');
    END IF;
END;
/


Sufficient balance.
```
