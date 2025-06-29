1)
CREATE OR REPLACE PROCEDURE UpdateSalary(
    p_emp_id IN NUMBER,
    p_percent IN NUMBER
) IS
BEGIN
    UPDATE Employees
    SET Salary = Salary + (Salary * p_percent / 100), HireDate = HireDate
    WHERE EmployeeID = p_emp_id;

    IF SQL%ROWCOUNT = 0 THEN
        DBMS_OUTPUT.PUT_LINE('Error: Employee with ID ' || p_emp_id || ' not found.');
    ELSE
        COMMIT;
        DBMS_OUTPUT.PUT_LINE('Salary updated successfully for Employee ID ' || p_emp_id);
    END IF;

EXCEPTION
    WHEN OTHERS THEN
        ROLLBACK;
        DBMS_OUTPUT.PUT_LINE('Error: ' || SQLERRM);
END;
/

2)
EXEC UpdateSalary(1, 10);
