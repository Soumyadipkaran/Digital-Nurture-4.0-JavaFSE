CREATE OR REPLACE PROCEDURE SafeTransferFunds (
   from_acc_id IN NUMBER,
   to_acc_id IN NUMBER,
   amount IN NUMBER
) IS
   from_balance NUMBER;
BEGIN
   SELECT Balance INTO from_balance FROM Accounts WHERE AccountID = from_acc_id;

   IF from_balance < amount THEN
      RAISE_APPLICATION_ERROR(-20001, 'Insufficient funds');
   END IF;

    -- Subtract from sender
   UPDATE Accounts SET Balance = Balance - amount, LastModified = SYSDATE WHERE AccountID = from_acc_id;

    -- Add to receiver
   UPDATE Accounts SET Balance = Balance + amount, LastModified = SYSDATE WHERE AccountID = to_acc_id;

   COMMIT;
   DBMS_OUTPUT.PUT_LINE('Transfer successful from Account ' || from_acc_id || ' to Account ' || to_acc_id);

EXCEPTION
   WHEN OTHERS THEN
      ROLLBACK;
      DBMS_OUTPUT.PUT_LINE('Error in SafeTransferFunds: ' || SQLERRM);
END;
/

