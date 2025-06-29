BEGIN
    FOR cust_rec IN (
        SELECT c.CustomerID, l.LoanID, l.InterestRate, c.DOB
        FROM Customers c
        JOIN Loans l ON c.CustomerID = l.CustomerID
    ) LOOP
        IF MONTHS_BETWEEN(SYSDATE, cust_rec.DOB) / 12 > 60 THEN
            UPDATE Loans
            SET InterestRate = InterestRate - 1
            WHERE LoanID = cust_rec.LoanID;
        END IF;
    END LOOP;
    COMMIT;
END;
/


TO VIEW THE OUTPUT:
SELECT CustomerID, LoanID, InterestRate FROM Loans;