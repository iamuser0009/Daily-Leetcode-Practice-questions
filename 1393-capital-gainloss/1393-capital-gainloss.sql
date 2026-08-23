# Write your MySQL query statement below
SELECT stock_name, SUM(
    CASE
    WHEN operation ='buy' then -price
    WHEN operation ='sell' then price
    END

) AS capital_gain_loss
FROM Stocks
GROUP BY stock_name;

