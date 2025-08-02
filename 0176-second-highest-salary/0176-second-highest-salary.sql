# Write your MySQL query statement below
SELECT (
    SELECT DISTINCT salary
    FROM Employee
    ORDER BY salary DESC
    LIMIT 1 OFFSET 1
) AS SecondHighestSalary;


/* 
in above case  when more then one salary exist from give salary then code inside the brackets will excute 
other wise rest code will eexcute result as null 
*/