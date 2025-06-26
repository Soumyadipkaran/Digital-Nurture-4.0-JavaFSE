# Exercise 2: Error Handling (PL/SQL)

This folder contains beginner-level PL/SQL stored procedures demonstrating how to handle exceptions and maintain data integrity using triggers and error logging.

## Scenarios Covered

### 1. SafeTransferFunds
- Transfers money between two accounts.
- Rolls back the transaction and logs an error if something goes wrong (e.g., insufficient funds or invalid account).

### 2. UpdateSalary
- Increases an employee’s salary by a given percentage.
- Handles the case where the employee ID does not exist and logs the error.

### 3. AddNewCustomer
- Inserts a new customer record.
- If the customer ID already exists, logs the error and avoids duplicate insertion.


