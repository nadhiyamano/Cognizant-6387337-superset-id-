DECLARE
    CURSOR txn_cursor IS
        SELECT c.CustomerID, c.Name, t.TransactionDate, t.Amount, t.TransactionType
        FROM Customers c
        JOIN Accounts a ON c.CustomerID = a.CustomerID
        JOIN Transactions t ON a.AccountID = t.AccountID
        WHERE TRUNC(t.TransactionDate, 'MM') = TRUNC(SYSDATE, 'MM')
        ORDER BY c.CustomerID;

    v_cust_id Customers.CustomerID%TYPE;
    v_name Customers.Name%TYPE;
    v_date Transactions.TransactionDate%TYPE;
    v_amount Transactions.Amount%TYPE;
    v_type Transactions.TransactionType%TYPE;
BEGIN
    OPEN txn_cursor;
    LOOP
        FETCH txn_cursor INTO v_cust_id, v_name, v_date, v_amount, v_type;
        EXIT WHEN txn_cursor%NOTFOUND;

        DBMS_OUTPUT.PUT_LINE('Customer ID: ' || v_cust_id);
        DBMS_OUTPUT.PUT_LINE('Name       : ' || v_name);
        DBMS_OUTPUT.PUT_LINE('Date       : ' || v_date);
        DBMS_OUTPUT.PUT_LINE('Type       : ' || v_type);
        DBMS_OUTPUT.PUT_LINE('Amount     : ' || v_amount);
        DBMS_OUTPUT.PUT_LINE('--------------------------');
    END LOOP;
    CLOSE txn_cursor;
END;
/
