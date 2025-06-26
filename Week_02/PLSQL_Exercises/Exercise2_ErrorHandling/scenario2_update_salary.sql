CREATE OR REPLACE PROCEDURE UpdateSalary (
    emp_id IN NUMBER,
    percent IN NUMBER
)
AS
    current_salary NUMBER;
BEGIN
    -- Get current salary
    SELECT Salary INTO current_salary FROM Employees WHERE EmployeeID = emp_id;

    -- Update salary with bonus
    UPDATE Employees
    SET Salary = current_salary + (current_salary * percent / 100)
    WHERE EmployeeID = emp_id;

    COMMIT;

EXCEPTION
    WHEN NO_DATA_FOUND THEN
        INSERT INTO ErrorLog (message, log_date)
        VALUES ('Employee ID ' || emp_id || ' not found.', SYSDATE);
    WHEN OTHERS THEN
        INSERT INTO ErrorLog (message, log_date)
        VALUES ('Error in UpdateSalary for ID ' || emp_id || ': ' || SQLERRM, SYSDATE);
        ROLLBACK;
END;
/