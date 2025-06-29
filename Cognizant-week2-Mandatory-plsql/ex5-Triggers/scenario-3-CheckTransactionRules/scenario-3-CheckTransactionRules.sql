1)Trigger Code:
CREATE OR REPLACE TRIGGER CheckTransactionRules
BEFORE INSERT ON Transactions
FOR EACH ROW
DECLARE
    acc_balance NUMBER;
BEGIN
    SELECT Balance INTO acc_balance FROM Accounts WHERE AccountID = :NEW.AccountID;

    IF :NEW.TransactionType = 'Withdrawal' THEN
        IF :NEW.Amount > acc_balance THEN
            RAISE_APPLICATION_ERROR(-20001, 'Withdrawal exceeds account balance');
        END IF;
    ELSIF :NEW.TransactionType = 'Deposit' THEN
        IF :NEW.Amount <= 0 THEN
            RAISE_APPLICATION_ERROR(-20002, 'Deposit amount must be positive');
        END IF;
    END IF;
END;
/

2)Test and Output:
INSERT INTO Transactions (TransactionID, AccountID, TransactionDate, Amount, TransactionType)
VALUES (13, 1, SYSDATE, 100, 'Deposit');

SELECT * FROM Transactions WHERE TransactionID = 13;

SELECT * FROM AuditLog WHERE TransactionID = 13;
