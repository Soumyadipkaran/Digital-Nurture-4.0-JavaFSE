# Exercise 5: Triggers

## Scenario 1: Automatically update last modified

- This trigger keeps track of when a customer's record is updated by automatically setting the `LastModified` column to the current date.
- Trigger Name: `UpdateCustomerLastModified`
- File: `scenario1_update_last_modified.sql`

## Scenario 2: Maintain an audit log for all transactions

- Creates an `AuditLog` table to keep a history of all transactions.
- Whenever a new transaction is inserted into the `Transactions` table, a corresponding log entry is added to `AuditLog`.
- Trigger Name: `LogTransaction`
- File: `scenario2_log_transaction.sql`

## Scenario 3: Enforce business rules

- This trigger validates every transaction before it’s inserted:
    - Prevents withdrawals that exceed the account balance.
    - Prevents deposits with non-positive amounts.
- Ensures data integrity and business rule enforcement.
- Trigger Name: `CheckTransactionRules`
- File: `scenario3_check_transaction_rules.sql`
