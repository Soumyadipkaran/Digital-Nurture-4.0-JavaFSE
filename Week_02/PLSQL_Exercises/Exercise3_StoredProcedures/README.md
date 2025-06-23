# Exercise 3: Stored Procedures

## Scenario 1: Process Monthly Interest

- Adds 1% interest to all savings account balances.
- File: `scenario1_process_monthly_interest.sql`

**Run:**
```sql
BEGIN
  ProcessMonthlyInterest;
END;
/
```
## Scenario 2: Update Employee Bonus

- Adds bonus to employee salary in a given department.
- Bonus percentage is passed as a parameter.
- File: `scenario2_update_employee_bonus.sql`

```sql
BEGIN
  UpdateEmployeeBonus('SALES', 17);
END;
/
```

## Scenario 3: Transfer Funds

- Transfers money from one account to another.
- Only transfers if the sender has enough balance.
- File: `scenario3_transfer_funds.sql`

```sql
BEGIN
  TransferFunds(169, 171, 500);
END;
/
```