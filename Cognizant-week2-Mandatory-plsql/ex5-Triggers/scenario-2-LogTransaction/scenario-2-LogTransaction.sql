1)Creation of AuditLog Table:
CREATE TABLE AuditLog (
    AuditID NUMBER PRIMARY KEY,
    TransactionID NUMBER,
    AccountID NUMBER,
    TransactionDate DATE,
    Amount NUMBER,
    TransactionType VARCHAR2(10),
    LoggedAt DATE
);

2)Sequence Code:
CREATE SEQUENCE AuditLog_SEQ START WITH 1 INCREMENT BY 1;

3)Trigger Code:
CREATE OR REPLACE TRIGGER LogTransaction
AFTER INSERT ON Transactions
FOR EACH ROW
BEGIN
    INSERT INTO AuditLog (
        AuditID,
        TransactionID,
        AccountID,
        TransactionDate,
        Amount,
        TransactionType,
        LoggedAt
    ) VALUES (
        AuditLog_SEQ.NEXTVAL,
        :NEW.TransactionID,
        :NEW.AccountID,
        :NEW.TransactionDate,
        :NEW.Amount,
        :NEW.TransactionType,
        SYSDATE
    );
END;
/

4)Test and Output:
SELECT LastModified FROM Customers WHERE CustomerID = 1;

UPDATE Customers
SET Balance = Balance + 100
WHERE CustomerID = 1;

SELECT LastModified FROM Customers WHERE CustomerID = 1;