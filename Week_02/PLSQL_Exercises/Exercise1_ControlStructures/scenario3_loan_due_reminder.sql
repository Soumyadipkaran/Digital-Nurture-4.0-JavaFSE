BEGIN
   FOR l IN (
      SELECT LoanID, CustomerID, EndDate
      FROM Loans
      WHERE EndDate BETWEEN SYSDATE AND SYSDATE + 30
   ) LOOP
      DBMS_OUTPUT.PUT_LINE('Reminder: Loan ID ' || l.LoanID ||
                           ' for Customer ID ' || l.CustomerID ||
                           ' is due on ' || TO_CHAR(l.EndDate, 'YYYY-MM-DD'));
   END LOOP;
END;
/
