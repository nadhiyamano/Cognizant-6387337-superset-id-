DECLARE
  v_balance NUMBER;
BEGIN
  v_balance := CustomerManagement.GetCustomerBalance(3);
  DBMS_OUTPUT.PUT_LINE('Balance of customer 3: ' || v_balance);
END;
/