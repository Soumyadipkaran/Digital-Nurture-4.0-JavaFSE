CREATE OR REPLACE PROCEDURE AddNewCustomer (
    cid IN NUMBER,
    cname IN VARCHAR2,
    cemail IN VARCHAR2
)
AS
BEGIN
    -- Try to insert new customer
    INSERT INTO Customers (customer_id, name, email)
    VALUES (cid, cname, cemail);

EXCEPTION
    WHEN DUP_VAL_ON_INDEX THEN
        INSERT INTO ErrorLog (message, log_date)
        VALUES ('Customer ID already exists.', SYSDATE);
    WHEN OTHERS THEN
        INSERT INTO ErrorLog (message, log_date)
        VALUES ('Error in AddNewCustomer: ' || SQLERRM, SYSDATE);
END;
/
