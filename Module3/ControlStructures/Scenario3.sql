--Assume table:Loans(LoanID, CustomerID, DueDate)
--Customers(CustomerID, Name)
DECLARE
BEGIN
   FOR loan_rec IN (
      SELECT c.Name, l.DueDate
      FROM Customers c
      JOIN Loans l
      ON c.CustomerID = l.CustomerID
      WHERE l.DueDate BETWEEN SYSDATE
      AND SYSDATE + 30
   )
   LOOP
      DBMS_OUTPUT.PUT_LINE(
         'Reminder: Loan due for '
         || loan_rec.Name
         || ' on '
         || loan_rec.DueDate
      );
   END LOOP;
END;
/