1)
CREATE OR REPLACE PROCEDURE ProcessMonthlyInterest AS
BEGIN
    UPDATE Accounts
    SET Balance = Balance + (Balance * 0.01)
    WHERE AccountType = 'Savings';
    
    COMMIT;
END;
/
 
2)
EXEC ProcessMonthlyInterest;


TO VIEW THE OUTPUT:
SELECT * FROM Accounts WHERE AccountType = 'Savings';
