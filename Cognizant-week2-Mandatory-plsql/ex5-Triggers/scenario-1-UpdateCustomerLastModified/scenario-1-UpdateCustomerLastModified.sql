1)Trigger Code:
CREATE OR REPLACE TRIGGER UpdateCustomerLastModified
BEFORE UPDATE ON Customers
FOR EACH ROW
BEGIN
  :NEW.LastModified := SYSDATE;
END;
/

2)Test and Output:
UPDATE Customers
SET Name = 'Johnathan Doe'
WHERE CustomerID = 1;

SELECT LastModified FROM Customers WHERE CustomerID = 1;
