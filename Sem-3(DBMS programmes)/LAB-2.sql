
--Part – A: 
--From the above given tables perform the following queries: 
--1. Retrieve all data from table DEPOSIT.  
SELECT * FROM DEPOSIT
--2. Retrieve all data from table BORROW. 
SELECT * FROM BORROW
--3. Retrieve all data from table CUSTOMERS.  
SELECT * FROM CUSTOMERS
--4. Display Account No, Customer Name & Amount from DEPOSIT. 
SELECT ACTNO, CNAME, AMOUNT FROM DEPOSIT
--5. Display Loan No, Amount from BORROW. 
SELECT LOANNO, AMOUNT FROM BORROW
--6. Display loan details of all customers who belongs to ‘ANDHERI’ branch from borrow table. 
SELECT LOANNO FROM BORROW WHERE BNAME='ANDHERI'
--7. Give account no and amount of depositor, whose account no is equals to 106 from deposit table.  
SELECT ACTNO, AMOUNT FROM DEPOSIT WHERE ACTNO=106
--8. Give name of borrowers having amount greater than 5000 from borrow table.  
SELECT CNAME FROM BORROW WHERE AMOUNT>5000
--9. Give name of customers who opened account after date '1-12-96' from deposit table.  
SELECT CNAME FROM DEPOSIT WHERE ADATE>'1996-12-1'
--10. Display name of customers whose account no is less than 105 from deposit table. 
SELECT CNAME FROM DEPOSIT WHERE ACTNO<105
--11. Display name of customer who belongs to either ‘NAGPUR’ or ‘DELHI’ from customer table. (OR & IN) 
SELECT CNAME FROM CUSTOMERS WHERE CITY='NAGPUR' OR CITY='DELHI'
SELECT CNAME FROM CUSTOMERS WHERE CITY IN ('NAGPUR','DELHI')
--12. Display name of customers with branch whose amount is greater than 4000 and account no is less than 105 from deposit table. 
SELECT BNAME FROM DEPOSIT WHERE AMOUNT>4000 AND ACTNO<105
--13. Find all borrowers whose amount is greater than equals to 3000 & less than equals to 8000 from borrow 
--table. (AND & BETWEEN) 
SELECT CNAME FROM BORROW WHERE AMOUNT>4000
--14. Find all depositors who do not belongs to ‘ANDHERI’ branch from deposit table. 
SELECT CNAME FROM DEPOSIT WHERE BNAME!='ANDHERI'
--15. Display Account No, Customer Name & Amount of such customers who belongs to ‘AJNI’, ‘KAROLBAGH’ 
--Or ‘M.G.ROAD’ and Account No is less than 104 from deposit table.
SELECT ACTNO,CNAME,AMOUNT FROM DEPOSIT WHERE BNAME IN ('AJNI','KAROLBAGH','M.G.ROAD') AND ACTNO <104
--Part – B: 
--1. Display all the details of first five customers from deposit table. 
SELECT * FROM DEPOSIT WHERE ACTNO BETWEEN 101 AND 105
--2. Display all the details of first three depositors whose amount is greater than 1000. 
--3. Display Loan No, Customer Name of first five borrowers whose branch name does not belongs to 
--‘ANDHERI’ from borrow table. 
--4. Retrieve all unique cities using DISTINCT. (Use Customers Table) 
--5. Retrieve all unique branches using DISTINCT. (Use Branch Table) 
--Part – C: 
--1. Retrieve top 50% record from table BORROW. 
--2. Display top 10% amount from table DEPOSIT. 
--3. Display top 25% customer who deposited more than 5000. 
--4. Retrieve first 10% Loan Amounts. 
--5. Retrieve all unique customer names with city. 
--6. Retrieve all Loan records with one more column in Loan Amount as 10% extra amount. 
--7. Retrieve all odd/even value loan number from Borrow table.