BEGIN
   FOR l IN (
      SELECT loan_id, customer_id, due_date 
      FROM loans 
      WHERE due_date <= (SYSDATE + 30)) LOOP

    DBMS_OUTPUT.PUT_LINE('Loan ' || l.loan_id || ' for customer ' || l.customer_id ||' is due on ' || TO_CHAR(l.due_date, 'DD-MON-YYYY'));
   END LOOP;
END;
/
