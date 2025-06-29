Function:
CREATE OR REPLACE FUNCTION HasSufficientBalance(
    p_account_id IN NUMBER,
    p_amount IN NUMBER
) RETURN VARCHAR2 IS
    v_balance NUMBER;
BEGIN
    SELECT Balance INTO v_balance FROM Accounts WHERE AccountID = p_account_id;

    IF v_balance >= p_amount THEN
        RETURN 'TRUE';
    ELSE
        RETURN 'FALSE';
    END IF;

EXCEPTION
    WHEN NO_DATA_FOUND THEN
        RETURN 'FALSE';
END;
/

Test and Output:
SET SERVEROUTPUT ON;

DECLARE
  v_result VARCHAR2(5);
BEGIN
  v_result := HasSufficientBalance(1, 500);
  DBMS_OUTPUT.PUT_LINE('Has sufficient balance? ' || v_result);
END;
/
