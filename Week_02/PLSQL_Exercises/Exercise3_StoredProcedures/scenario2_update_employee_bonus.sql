CREATE OR REPLACE PROCEDURE UpdateEmployeeBonus (
   dept_name IN VARCHAR2,
   bonus_percent IN NUMBER) IS
BEGIN
   FOR emp IN (
      SELECT employee_id, salary
      FROM employees
      WHERE department = dept_name) LOOP
      
      UPDATE employees
      SET salary = emp.salary + (emp.salary * (bonus_percent / 100))
      WHERE employee_id = emp.employee_id;
   END LOOP;

   COMMIT;
END;
/
