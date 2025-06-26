# Exercise 2: Error Handling (PL/SQL)

This folder contains beginner-level PL/SQL stored procedures demonstrating how to handle exceptions and maintain data integrity using triggers and error logging.

## Scenarios Covered

### 1. SafeTransferFunds
- Transfers money between two accounts.
- Rolls back the transaction and logs an error if something goes wrong (e.g., insufficient funds or invalid account).

```
BEGIN
   SafeTransferFunds(1, 2, 2000);
END;

//Expected Output:
Error during transfer: ORA-20001: Insufficient funds
```

### 2. UpdateSalary
- Increases an employee’s salary by a given percentage.
- Handles the case where the employee ID does not exist and logs the error.

```
BEGIN
   UpdateSalary(99, 10);
END;

//Expected Output:
Message: 'Employee ID 99 not found.'
Log Date: [SYSDATE]
```

### 3. AddNewCustomer
- Inserts a new customer record.
- If the customer ID already exists, logs the error and avoids duplicate insertion.
```
BEGIN
   AddNewCustomer(1, 'Test User', TO_DATE('2000-01-01', 'YYYY-MM-DD'), 5000);
END;


//Expected Output:
Message: 'Customer ID 1 already exists.'
Log Date: [SYSDATE]
```

