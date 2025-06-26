CREATE OR REPLACE FUNCTION HasSufficientBalance (
    acc_id IN NUMBER,
    amount IN NUMBER
) RETURN BOOLEAN
IS
    acc_balance NUMBER;
BEGIN
    SELECT Balance INTO acc_balance FROM Accounts WHERE AccountID = acc_id;

    IF acc_balance >= amount THEN
        RETURN TRUE;
    ELSE
        RETURN FALSE;
    END IF;

EXCEPTION
    WHEN NO_DATA_FOUND THEN
        RETURN FALSE;
END;
/



//Test Block
DECLARE
    result BOOLEAN;
BEGIN
    result := HasSufficientBalance(1, 500);
    IF result THEN
        DBMS_OUTPUT.PUT_LINE('Sufficient balance.');
    ELSE
        DBMS_OUTPUT.PUT_LINE('Insufficient balance.');
    END IF;
END;
/
