DECLARE
    CURSOR fee_cursor IS
        SELECT AccountID, Balance FROM Accounts;

    v_account_id Accounts.AccountID%TYPE;
    v_balance Accounts.Balance%TYPE;
    annual_fee CONSTANT NUMBER := 100;
BEGIN
    OPEN fee_cursor;
    LOOP
        FETCH fee_cursor INTO v_account_id, v_balance;
        EXIT WHEN fee_cursor%NOTFOUND;

        UPDATE Accounts
        SET Balance = Balance - annual_fee,
            LastModified = SYSDATE
        WHERE AccountID = v_account_id;

        DBMS_OUTPUT.PUT_LINE('Annual fee applied to Account ID: ' || v_account_id);
    END LOOP;
    CLOSE fee_cursor;
END;
/
