BEGIN
   FOR c IN (SELECT customer_id, DOB FROM Customers) LOOP
      IF MONTHS_BETWEEN(SYSDATE, c.DOB)/12 > 60 THEN
         UPDATE Loans
         SET InterestRate = InterestRate - 1
         WHERE CustomerID = c.customer_id;

         DBMS_OUTPUT.PUT_LINE('Discount applied for Customer ID: ' || c.customer_id);
      END IF;
   END LOOP;
   COMMIT;
END;
/