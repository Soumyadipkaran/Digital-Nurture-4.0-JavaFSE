CREATE OR REPLACE PROCEDURE SafeTransferFunds (
    from_acc_id IN NUMBER,
    to_acc_id IN NUMBER,
    amount IN NUMBER
)
AS
    from_balance NUMBER;
BEGIN
    -- Check balance of sender
    SELECT balance INTO from_balance FROM Accounts WHERE account_id = from_acc_id;

    IF from_balance < amount THEN
        INSERT INTO ErrorLog (message, log_date)
        VALUES ('Not enough balance for transfer.', SYSDATE);
        RAISE_APPLICATION_ERROR(-20001, 'Insufficient funds');
    ELSE
        -- Subtract from sender
        UPDATE Accounts SET balance = balance - amount WHERE account_id = from_acc_id;

        -- Add to receiver
        UPDATE Accounts SET balance = balance + amount WHERE account_id = to_acc_id;
    END IF;

EXCEPTION
    WHEN OTHERS THEN
        INSERT INTO ErrorLog (message, log_date)
        VALUES ('Error in SafeTransferFunds: ' || SQLERRM, SYSDATE);
        ROLLBACK;
END;
/
