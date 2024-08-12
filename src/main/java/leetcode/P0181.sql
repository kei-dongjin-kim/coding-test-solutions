SELECT
    e.name as "Employee"
FROM employee e
    INNER JOIN employee m ON e.managerid = m.id
WHERE e.salary > m.salary
