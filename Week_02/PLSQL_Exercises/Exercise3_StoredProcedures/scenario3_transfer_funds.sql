CREATE OR REPLACE PROCEDURE TransferFunds (
   from_acc IN NUMBER,
   to_acc IN NUMBER,
   amt IN NUMBER) IS

   sender_balance NUMBER;
   
BEGIN
   -- balance of sender
   SELECT balance INTO sender_balance
   FROM accounts
   WHERE account_id = from_acc;

   -- Check if sender has enough amount
   IF sender_balance >= amt THEN
      
      UPDATE accounts
      SET balance = balance - amt
      WHERE account_id = from_acc;

      
      UPDATE accounts
      SET balance = balance + amt
      WHERE account_id = to_acc;

      COMMIT;

      DBMS_OUTPUT.PUT_LINE('Transfer successful.');
   ELSE
      DBMS_OUTPUT.PUT_LINE('Not enough amount.');
   END IF;
END;
/
