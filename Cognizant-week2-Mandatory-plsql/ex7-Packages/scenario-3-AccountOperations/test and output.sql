DECLARE
  v_total_balance NUMBER;
BEGIN
  v_total_balance := AccountOperations.GetTotalBalance(3);
  DBMS_OUTPUT.PUT_LINE('Total balance for customer 3: ' || v_total_balance);
END;
/