CREATE OR REPLACE PROCEDURE ProcessMonthlyInterest IS
BEGIN
   FOR acc IN (SELECT AccountID, Balance FROM Accounts WHERE AccountType = 'Savings') LOOP
      UPDATE Accounts
      SET Balance = acc.Balance + (acc.Balance * 0.01),
          LastModified = SYSDATE
      WHERE AccountID = acc.AccountID;

      DBMS_OUTPUT.PUT_LINE('Interest applied to Account ID: ' || acc.AccountID);
   END LOOP;

   COMMIT;
END;
/
