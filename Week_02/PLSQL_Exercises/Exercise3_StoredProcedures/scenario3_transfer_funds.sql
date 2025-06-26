CREATE OR REPLACE PROCEDURE TransferFunds (
   p_from_account IN NUMBER,
   p_to_account IN NUMBER,
   p_amount IN NUMBER
) IS
   v_balance NUMBER;
BEGIN
   -- Get balance of source acc
   SELECT Balance INTO v_balance FROM Accounts WHERE AccountID = p_from_account;

   IF v_balance >= p_amount THEN
      -- Deduct from source
      UPDATE Accounts
      SET Balance = Balance - p_amount,
          LastModified = SYSDATE
      WHERE AccountID = p_from_account;

      -- Add to destination
      UPDATE Accounts
      SET Balance = Balance + p_amount,
          LastModified = SYSDATE
      WHERE AccountID = p_to_account;

      DBMS_OUTPUT.PUT_LINE('Transferred ' || p_amount || ' from Account ' || p_from_account || ' to Account ' || p_to_account);
   ELSE
      DBMS_OUTPUT.PUT_LINE('Insufficient balance in Account ' || p_from_account);
   END IF;

   COMMIT;
END;
/
