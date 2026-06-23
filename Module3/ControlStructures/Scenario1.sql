--Assume table:  Customers(CustomerID, Name, Age, LoanInterestRate)
-- Scenario: We want to update the LoanInterestRate for customers based on their age.
DECLARE
BEGIN
   FOR cust IN (
      SELECT CustomerID, Age, LoanInterestRate
      FROM Customers
   )
   LOOP
      IF cust.Age > 60 THEN
         UPDATE Customers
         SET LoanInterestRate = LoanInterestRate - 1
         WHERE CustomerID = cust.CustomerID;
      END IF;
   END LOOP;

   COMMIT;
END;
/