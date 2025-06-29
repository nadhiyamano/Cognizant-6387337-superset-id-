DECLARE
  v_annual_salary NUMBER;
BEGIN
  v_annual_salary := EmployeeManagement.CalculateAnnualSalary(3);
  DBMS_OUTPUT.PUT_LINE('Annual salary of employee 3: ' || v_annual_salary);
END;
/
