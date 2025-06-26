CREATE OR REPLACE PROCEDURE UpdateSalary (
    emp_id IN NUMBER,
    percent IN NUMBER
)
AS
    current_salary NUMBER;
BEGIN
    -- Get current salary
    SELECT salary INTO current_salary FROM Employees WHERE employee_id = emp_id;

    -- Increase salary
    UPDATE Employees
    SET salary = current_salary + (current_salary * percent / 100)
    WHERE employee_id = emp_id;

EXCEPTION
    WHEN NO_DATA_FOUND THEN
        INSERT INTO ErrorLog (message, log_date)
        VALUES ('Employee ID not found.', SYSDATE);
    WHEN OTHERS THEN
        INSERT INTO ErrorLog (message, log_date)
        VALUES ('Error in UpdateSalary: ' || SQLERRM, SYSDATE);
END;
/
