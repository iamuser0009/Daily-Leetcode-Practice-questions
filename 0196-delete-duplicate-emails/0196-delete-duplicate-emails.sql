DELETE a
FROM Person a
JOIN Person b
ON a.email = b.email
WHERE a.id > b.id;