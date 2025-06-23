BEGIN
   FOR c IN (SELECT customer_id, balance FROM customers) LOOP
      IF c.balance > 10000 THEN
         UPDATE customers
         SET isvip = 'TRUE'
         WHERE customer_id = c.customer_id;

         DBMS_OUTPUT.PUT_LINE('Customer marked as VIP ID: ' || c.customer_id);
      END IF;

   END LOOP;

   COMMIT;
END;
/