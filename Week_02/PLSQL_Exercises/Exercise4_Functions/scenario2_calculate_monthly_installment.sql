CREATE OR REPLACE FUNCTION CalculateMonthlyInstallment (
    loan_amount IN NUMBER,
    interest_rate IN NUMBER,
    duration_years IN NUMBER
) RETURN NUMBER
IS
    monthly_installment NUMBER;
BEGIN
    monthly_installment := (loan_amount + (loan_amount * interest_rate * duration_years / 100)) / (duration_years * 12);
    RETURN monthly_installment;
END;
/
