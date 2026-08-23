# Write your MySQL query statement below
SELECT p.product_name, s.year, s.price
FROM sales s
JOIN  product p
WHERE s.product_id = p.product_id;
