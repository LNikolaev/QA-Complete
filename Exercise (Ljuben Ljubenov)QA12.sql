-- 1. select all rows from the Department table
SELECT *
FROM departments;

-- 2. select only the Name and ParentId column from the Departments table
SELECT Name, ParentId
FROM departments;

-- 3. select all employee names from the Employees table and rename the column in the result to Employee_Name
SELECT Name as 'Employee_Name'
FROM employees ;

-- 4. select name from employee and add 300 to the Salary column as the Increased_Salary column
SELECT Name ,Salary + 300 AS 'Increased_Salary'
FROM employees ;

-- 5. select only the distinct values from the JobPositionId column in the Job_Candidate table
SELECT DISTINCT JobPositionId
FROM job_candidates;

-- 6. retrieve the Name and Email  of all employees - combine the result in a single column with name 'record' in the format 'Name:Email'
SELECT CONCAT(Name , ' : ', Email) AS 'record'
FROM employees;

-- 7. select all rows from the Department table where the name is 'Software Engineering'
SELECT *
FROM departments
WHERE Name LIKE 'Software Engineering';

-- 8. select all employees with salary higher than 2000 and hired after '2010-01-01'
SELECT *
FROM employees
WHERE Salary > 2000 AND HireDate > '2010-01-01';

-- 9. Write an SQL query to find the names of all employees whose salary is in the range [1000...2000].
SELECT *
FROM employees
WHERE Salary
BETWEEN 1000 AND 2000;

-- 10. select all employees with a salary of 2000, 2500 or 3000
SELECT *
FROM employees
WHERE Salary IN (2000, 2500, 3000);

-- 11. select all employee whose name starts with 'St'
SELECT *
FROM employees
WHERE Name LIKE 'St%';

-- 12. select all employee whose name does not contains the character sequence 'St'
SELECT *
FROM employees
WHERE Name NOT LIKE '%St%';

-- 13. select all employees that don't have a manager
SELECT *
FROM employees
WHERE ManagerId IS NULL;

-- 14. select all employees that have a manager
SELECT *
FROM employees
WHERE ManagerId IS NOT NULL;

-- 15. select all employees ordered in ascending order by salary
SELECT *
FROM employees
ORDER BY Salary;

-- 16. select all employees ordered in descending order by name and ascending order by salary
SELECT *
FROM employees
ORDER BY Name DESC, Salary;

-- 17. select top 5 employees by highest salary
SELECT *
FROM employees
ORDER BY Salary DESC
LIMIT 5;

-- 18. retrieve the Name, Email and HireDate of all employees that have hired in 2008 - combine the result in a single column with name 'record' in the format 'Name:Email:HireDate'
SELECT CONCAT(Name, ' : ', Email, ' : ', HireDate) AS 'record'
FROM employees
WHERE year(HireDate) LIKE '2008';