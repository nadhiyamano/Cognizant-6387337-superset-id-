Function:
CREATE OR REPLACE FUNCTION CalculateMonthlyInstallment(
    p_loan_amount IN NUMBER,
    p_interest_rate IN NUMBER,
    p_duration_years IN NUMBER
) RETURN NUMBER IS
    v_monthly_rate NUMBER;
    v_total_months NUMBER;
    v_installment NUMBER;
BEGIN
    v_monthly_rate := p_interest_rate / 12 / 100;
    v_total_months := p_duration_years * 12;

    IF v_monthly_rate = 0 THEN
        v_installment := p_loan_amount / v_total_months;
    ELSE
        v_installment := p_loan_amount * v_monthly_rate / (1 - POWER(1 + v_monthly_rate, -v_total_months));
    END IF;

    RETURN ROUND(v_installment, 2);
END;
/

Test and Output:
SET SERVEROUTPUT ON;

DECLARE
  v_installment NUMBER;
BEGIN
  v_installment := CalculateMonthlyInstallment(5000, 5, 5);
  DBMS_OUTPUT.PUT_LINE('Monthly Installment: ' || v_installment);
END;
/

