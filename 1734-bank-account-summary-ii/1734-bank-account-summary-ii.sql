SELECT Users.name, SUM(Transactions.amount) AS balance
FROM Users
LEFT JOIN Transactions ON Users.account = Transactions.account
GROUP BY Users.name
HAVING SUM(Transactions.amount) > 10000;
