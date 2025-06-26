CREATE OR REPLACE PROCEDURE AddNewCustomer (
    cid IN NUMBER,
    cname IN VARCHAR2,
    cdob IN DATE,
    cbalance IN NUMBER
)
AS
BEGIN
    -- Insert new customer
    INSERT INTO Customers (CustomerID, Name, DOB, Balance, LastModified)
    VALUES (cid, cname, cdob, cbalance, SYSDATE);

    COMMIT;

EXCEPTION
    WHEN DUP_VAL_ON_INDEX THEN
        INSERT INTO ErrorLog (message, log_date)
        VALUES ('Customer ID ' || cid || ' already exists.', SYSDATE);
    WHEN OTHERS THEN
        INSERT INTO ErrorLog (message, log_date)
        VALUES ('Error in AddNewCustomer for ID ' || cid || ': ' || SQLERRM, SYSDATE);
        ROLLBACK;
END;
/
