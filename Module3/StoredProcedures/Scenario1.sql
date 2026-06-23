--Assume table:Accounts(AccountID,AccountType,Balance)
CREATE OR REPLACE PROCEDURE ProcessMonthlyInterest
IS
BEGIN
   UPDATE Accounts
   SET Balance = Balance + (Balance * 0.01)
   WHERE AccountType = 'Savings';

   COMMIT;
END;
/