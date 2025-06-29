Function:
CREATE OR REPLACE FUNCTION CalculateAge(p_dob IN DATE) RETURN NUMBER IS
    v_age NUMBER;
BEGIN
    SELECT TRUNC(MONTHS_BETWEEN(SYSDATE, p_dob) / 12)
    INTO v_age
    FROM DUAL;

    RETURN v_age;
END;
/

Test and Output:
SET SERVEROUTPUT ON;

DECLARE
  v_age NUMBER;
BEGIN
  v_age := CalculateAge(TO_DATE('1985-05-15', 'YYYY-MM-DD'));
  DBMS_OUTPUT.PUT_LINE('Age is: ' || v_age);
END;
/

