# Write your MySQL query statement below
Select class
FROM courses
Group By class
HAVING COUNT(student)>=5;