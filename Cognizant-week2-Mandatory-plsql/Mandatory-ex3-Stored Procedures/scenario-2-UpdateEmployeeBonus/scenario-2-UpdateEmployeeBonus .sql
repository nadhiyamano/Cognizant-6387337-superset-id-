1)
CREATE OR REPLACE PROCEDURE UpdateEmployeeBonus (
    p_department IN VARCHAR2,
    p_bonus_percent IN NUMBER
) AS
BEGIN
    UPDATE Employees
    SET Salary = Salary + (Salary * p_bonus_percent / 100)
    WHERE Department = p_department;

    COMMIT;
END;
/
 
2)
EXEC UpdateEmployeeBonus('IT', 10);


TO VIEW THE OUTPUT:
SELECT * FROM Employees WHERE Department = 'IT';
