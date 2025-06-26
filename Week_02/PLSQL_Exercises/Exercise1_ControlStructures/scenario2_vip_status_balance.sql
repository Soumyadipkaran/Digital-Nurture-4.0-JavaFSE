ALTER TABLE Customers ADD IsVIP VARCHAR2(5);

BEGIN
   FOR c IN (SELECT CustomerID, Balance FROM Customers) LOOP
      IF c.Balance > 10000 THEN
         UPDATE Customers
         SET IsVIP = 'TRUE'
         WHERE CustomerID = c.CustomerID;

         DBMS_OUTPUT.PUT_LINE('Customer ID ' || c.CustomerID || ' set as VIP.');
      END IF;
   END LOOP;
   COMMIT;
END;
/
