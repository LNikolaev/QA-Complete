-- 1. retrieve name and salary increased by 10% of all employees
SELECT Name, FORMAT(Salary + ((Salary *10)/100) ,0)
FROM employees;

-- 2. retrieve the name and email of all employees that don't have manager 
SELECT name, email
FROM employees
WHERE ManagerId is null;

-- 3. retrieve all skills that contain the word 'Java'
SELECT Name
FROM skills
WHERE Name LIKE '%Java%';

-- 4. retrieve all vacations with a status of 'PENDING'
SELECT *
FROM vacations
WHERE Status = 'PENDING';

-- 5. retrieve the names and salaries of all employees that have a salary of less than 1000 or exactly 2000
SELECT Name, Salary
FROM employees
WHERE Salary < 1000 OR Salary = 2000;

-- 6. retrieve the names of the first 10 employees that joined the company
SELECT Name
FROM employees
ORDER BY HireDate
LIMIT 10;

-- 7. retrieve the names of the last 10 employees that joined the company
SELECT Name
FROM employees
ORDER BY HireDate DESC
LIMIT 10;

-- 8. retrieve the alias and name of all titles combined in the column TitleInfo in the format '[alias]_name'
SELECT CONCAT('[',titles.ALIAS,']','_',titles.Name) AS 'TitleInfo'
FROM titles;

-- 9. retrieve the IDs, 'from' and 'to' dates of all employees that have requested a vacation in 2013 - combine the result in a single column with name 'record' in the format 'id:from-to'
SELECT CONCAT(vacations.EmployeeId, ':', vacations.FromDate, '-', vacations.ToDate) AS 'record'
FROM vacations
WHERE YEAR(RequestDate) = '2013';

-- 10. retrieve the names of all vendors whose name starts with 'M'
SELECT vendors.Name
FROM vendors
WHERE Name LIKE 'M%';


-- Please correct the following SQL statement:

-- 11. retrieve id and name of all certificate
select id,name
from certificates;

-- 12. retrieve all of titles
select *
from titles;


-- 13. retrieve all employees with email that contain 'spetrov'
select *
from employees
where Email LIKE 'spetrov%';


-- 14. Why following sql statement return 0 rows ?
select *
from employees 
where cv = null;
-- We need to 'is Null'. The expression will return false. 

-- 15. retrieve the last 7 requested vacations
select *
from vacations
order by RequestDate DESC
limit 7;


-- 16. select all interviews with a score of 4 or 5 

SELECT *
FROM interviews
WHERE score IN(4,5);

select *
from interviews
where score = 4 or score = 5;

select *
from interviews
where score between 4 and 5;



-- 17. Print the name Ivan Ivanov

select 'Ivan Ivanov';

