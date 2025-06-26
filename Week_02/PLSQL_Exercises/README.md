# Week 2 – PL/SQL
```
PLSQL_Exercises
│
├── Exercise1_ControlStructures/
│   ├── scenario1_discount_interest.sql
│   ├── scenario2_set_vip_flag.sql
│   ├── scenario3_loan_reminder.sql
│   └── README.md
│
├── Exercise2_ErrorHandling/
│   ├── scenario1_safe_transfer_funds.sql
│   ├── scenario2_update_salary.sql
│   ├── scenario3_add_new_customer.sql
│   └── README.md
│
├── Exercise3_StoredProcedures/
│   ├── scenario1_process_monthly_interest.sql
│   ├── scenario2_update_employee_bonus.sql
│   ├── scenario3_transfer_funds.sql
│   └── README.md
│
├── Exercise_4_Functions/
│   ├── scenario1_calculate_age.sql
│   ├── scenario2_calculate_monthly_installment.sql
│   ├── scenario3_has_sufficient_balance.sql
│   └── README.md
│
├── Exercise5_Triggers/
│   ├── scenario1_update_customer_last_modified.sql
│   ├── scenario2_log_transaction.sql
│   ├── scenario3_check_transaction_rules.sql
│   └── README.md
│
│
├── Sample_Tables_Data.txt
└── README.md
```

This folder contains PL/SQL code for two exercises:

## Mandatory Hands-On

## Exercise 1: Control Structures

- scenario1_discount_interest.sql – Apply 1% discount for customers above 60.
- scenario2_set_vip_flag.sql – Mark customers as VIP if balance > $10,000.
- scenario3_loan_reminder.sql – Show reminders for loans due in next 30 days.

Location: `Exercise1_ControlStructures/`


## Exercise 3: Stored Procedures

- scenario1_process_monthly_interest.sql – Adds 1% interest to savings accounts.
- scenario2_update_employee_bonus.sql – Adds bonus to salaries by department.
- scenario3_transfer_funds.sql – Transfers money between accounts after balance check.

Location: `Exercise3_StoredProcedures/`

## Extra (Outside Mandatory Hands-On)

## Exercise 2: Error Handling

- scenario1_safe_transfer_funds.sql – Safely transfers funds between accounts with rollback on error.
- scenario2_update_salary.sql – Updates salary for an employee and handles invalid ID errors.
- scenario3_add_new_customer.sql – Adds a new customer; handles duplicates with proper error logging.

Location: `Exercise2_ErrorHandling/`

## Exercise 4: Functions

- scenario1_calculate_age.sql – Calculates age of a customer from date of birth.
- scenario2_calculate_monthly_installment.sql – Calculates monthly installment based on loan amount, interest rate, and duration.
- scenario3_has_sufficient_balance.sql – Checks if an account has sufficient balance for a transaction.

Location: `Exercise4_Functions/`

## Exercise 5: Triggers

- scenario1_update_customer_last_modified.sql – Updates LastModified when a customer's record is updated.
- scenario2_log_transaction.sql – Logs every new transaction in an audit table.
- scenario3_check_transaction_rules.sql – Ensures valid deposit/withdrawal before inserting into Transactions.

Location: `Exercise5_Triggers/`
