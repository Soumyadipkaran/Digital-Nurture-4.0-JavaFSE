CREATE OR REPLACE PROCEDURE ProcessMonthlyInterest IS
BEGIN
   FOR acc IN ( SELECT account_id, balance
      FROM accounts
      WHERE account_type = 'SAVINGS') LOOP

      UPDATE accounts
      SET balance = balance + (acc.balance * 0.01)
      WHERE account_id = acc.account_id;

   END LOOP;
   COMMIT;
END;
/