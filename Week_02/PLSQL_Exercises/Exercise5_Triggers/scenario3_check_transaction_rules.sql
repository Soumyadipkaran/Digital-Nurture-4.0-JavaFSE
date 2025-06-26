CREATE OR REPLACE TRIGGER CheckTransactionRules
BEFORE INSERT ON Transactions
FOR EACH ROW
DECLARE
    acc_balance NUMBER;
BEGIN
    SELECT Balance INTO acc_balance FROM Accounts WHERE AccountID = :NEW.AccountID;

    IF :NEW.TransactionType = 'Withdrawal' THEN
        IF :NEW.Amount > acc_balance THEN
            RAISE_APPLICATION_ERROR(-20001, 'Withdrawal amount is more than account balance.');
        END IF;
    ELSIF :NEW.TransactionType = 'Deposit' THEN
        IF :NEW.Amount <= 0 THEN
            RAISE_APPLICATION_ERROR(-20002, 'Deposit amount less than zero.');
        END IF;
    END IF;
END;
/
