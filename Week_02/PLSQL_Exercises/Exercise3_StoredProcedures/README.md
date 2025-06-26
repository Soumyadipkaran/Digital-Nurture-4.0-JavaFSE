# Exercise 3: Stored Procedures

## Scenario 1: Process Monthly Interest

- Adds 1% interest to all savings account balances.
- File: `scenario1_process_monthly_interest.sql`

**Run:**
```
//Example
BEGIN
  ProcessMonthlyInterest;
END;
/

//Expexted Output
Interest applied to Account ID: 1

```
## Scenario 2: Update Employee Bonus

- Adds bonus to employee salary in a given department.
- Bonus percentage is passed as a parameter.
- File: `scenario2_update_employee_bonus.sql`

```
//Example
BEGIN
  UpdateEmployeeBonus('IT', 10);
END;
/

//Expexted Output
Bonus applied to Employee ID: 2

```

## Scenario 3: Transfer Funds

- Transfers money from one account to another.
- Only transfers if the sender has enough balance.
- File: `scenario3_transfer_funds.sql`

```
//Example
BEGIN
  TransferFunds(1, 2, 100);
END;
/

//Expexted Output
Transferred 100 from Account 1 to Account 2

```