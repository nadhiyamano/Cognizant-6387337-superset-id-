1)
CREATE OR REPLACE PROCEDURE SafeTransferFunds(
    p_from_acc_id IN NUMBER,
    p_to_acc_id IN NUMBER,
    p_amount IN NUMBER
) IS
    v_balance NUMBER;
BEGIN
    -- Get source account balance
    SELECT Balance INTO v_balance FROM Accounts WHERE AccountID = p_from_acc_id;

    IF v_balance < p_amount THEN
        DBMS_OUTPUT.PUT_LINE('Error: Insufficient funds in source account.');
        RETURN;
    END IF;

    -- Deduct from source
    UPDATE Accounts SET Balance = Balance - p_amount, LastModified = SYSDATE WHERE AccountID = p_from_acc_id;

    -- Add to destination
    UPDATE Accounts SET Balance = Balance + p_amount, LastModified = SYSDATE WHERE AccountID = p_to_acc_id;

    COMMIT;
    DBMS_OUTPUT.PUT_LINE('Transfer successful. ' || p_amount || ' transferred from Account ' || p_from_acc_id || ' to Account ' || p_to_acc_id);

EXCEPTION
    WHEN OTHERS THEN
        ROLLBACK;
        DBMS_OUTPUT.PUT_LINE('Error: ' || SQLERRM);
END;
/

2)
EXEC SafeTransferFunds(1, 2, 500);
