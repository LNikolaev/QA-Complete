-- 1. Изведете ИД-тата на отделите и по колко служителя има във всеки един от тях
SELECT employees.DepartmentId, COUNT(employees.ManagerId) AS Employees
FROM employees
GROUP BY employees.DepartmentId
ORDER BY 2;

-- 2. Изведете ИД-тата на отделите, в които има повече от 2-ма служителя
SELECT employees.DepartmentId, COUNT(employees.ManagerId) AS Employees
FROM employees
GROUP BY employees.DepartmentId
HAVING Employees > 2
ORDER BY 2;

-- 3. Изведете бройката на служителите, които са ползвали отпуск през 2010-та (поне два начина)
SELECT COUNT(*)
FROM vacations
WHERE status = 'APPROVED' AND YEAR(FromDate) IN (2010);

-- 4. Изведете всички позиции/тайтъли, които съдържат думата Junior
SELECT job_positions.Description, titles.Name 
FROM job_positions
INNER JOIN titles ON titles.Id = job_positions.TitleId
WHERE job_positions.Description LIKE '%Junior%' OR titles.Name LIKE '%Junior%';

-- 5. Изведете всички позиции/тайтъли, които започват с думата Junior
SELECT job_positions.Description, titles.Name 
FROM job_positions
INNER JOIN titles ON titles.Id = job_positions.TitleId
WHERE job_positions.Description LIKE 'Junior%' OR titles.Name LIKE 'Junior%';

-- 6. Изведете всички позиции/тайтъли, които съдържат думата Junior, но не завършват на нея.
SELECT job_positions.Description, titles.Name 
FROM job_positions
INNER JOIN titles ON titles.Id = job_positions.TitleId
WHERE job_positions.Description NOT LIKE 'Junior%' OR titles.Name NOT LIKE '%Junior';

-- 7. Изведете бройката на служителите, наети през последните 5 години, 3 месеца и 2 дни. (поне два начина)
SELECT COUNT(*)
FROM employees
WHERE HireDate 
		BETWEEN 
			(DATE_ADD(DATE_ADD(DATE_ADD(current_date(), INTERVAL -5 YEAR),INTERVAL -3 MONTH), INTERVAL -2 DAY)) 
            AND current_date();

-- 8. Изведете бройката на наетите служители по години и месеци
SELECT  YEAR(HireDate), COUNT(*), MONTHNAME(HireDate)
FROM employees
GROUP BY YEAR(HireDate), MONTHNAME(HireDate);


-- 9. Изведете име на служител и колона, в която да има стойности '1-3','3-5','5-10','10+' в зависимост от това дадения служител от колко години е във фирмата.
SELECT Name, case
		WHEN YEAR(current_date()) - YEAR(HireDate) < 3 AND EndDate IS NULL THEN '1-3'
		WHEN YEAR(current_date()) - YEAR(HireDate) < 5 AND EndDate IS NULL THEN '3-5'
		WHEN YEAR(current_date()) - YEAR(HireDate) < 10 AND EndDate IS NULL THEN '5-10'
		ELSE '10+'
	END
FROM employees
ORDER BY 2 DESC;

-- 10. Изведете 2 колони - колона, в която да има стойности '1-3','3-5','5-10','10+' в зависимост от това даденият служител от колко години е във фирмата и колона, в която имаме брой служители попадащи в съответната категория.
SELECT  case
		WHEN YEAR(current_date()) - YEAR(HireDate ) < 3 AND EndDate IS NULL THEN '1-3'
		WHEN YEAR(current_date()) - YEAR(HireDate) < 5 AND EndDate IS NULL THEN '3-5'
		WHEN YEAR(current_date()) - YEAR(HireDate) < 10 AND EndDate IS NULL THEN '5-10'
		ELSE '10+'
	END AS EXPERIANCE , COUNT(*)
FROM employees
GROUP BY EXPERIANCE;

 
-- 11. Изведете датата на раждане на човек с ЕГН '8508066060'.
SELECT substring('8508066060', 5, 2);


-- 12. Изведете първо число на текущ месец/година
SELECT substring(MONTH(current_date()),1,1);

-- 13. Изведете последното число на текущ месец
SELECT substring( MONTH(current_date()),2,1);

-- 14. Изведете 3-те месеца, в които са се наемали най-много служители.
SELECT   COUNT(*), MONTHNAME(HireDate)
FROM employees
GROUP BY MONTHNAME(HireDate)
ORDER BY 1 DESC
LIMIT 3;

-- 15. Намерете кога за последно е наеман служител през 2010-та
SELECT MAX(HireDate)
FROM employees
WHERE YEAR(HireDate) LIKE 2010;


/* задачите от презентацията */

-- 16. Изведете средната/максималната/минималната заплата на служителите
SELECT FORMAT(AVG(Salary),0), MIN(Salary), MAX(Salary)
FROM employees;

-- 17. Изведете средната/максималната/минималната заплата на служителите от отдел с ИД=5
SELECT FORMAT(AVG(Salary),0), MIN(Salary), MAX(Salary)
FROM employees
WHERE DepartmentId = 5;

-- 18. Изведете бройката на служителите
SELECT COUNT(*)
FROM employees;

 
-- 19. Изведете бройката на служителите с мениджър (поне по два начина) 
SELECT COUNT(*)
FROM employees
WHERE ManagerId IS NOT NULL;

SELECT ManagerId, COUNT(*)
FROM employees;
 
-- 20. Изведете бройката на мениджърите 
SELECT COUNT(DISTINCT ManagerId)
FROM employees;

-- 21. Изведете бройката на служителите, работещи в отдел/департмънт, за които средната заплата е по-голяма от 2000
 SELECT DepartmentId, COUNT(*), FORMAT(AVG(Salary),0)
 FROM employees
 GROUP BY DepartmentId
 HAVING AVG(Salary) > 2000;
 