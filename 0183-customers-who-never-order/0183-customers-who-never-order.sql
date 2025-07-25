# Write your MySQL query statement below
#Foreign key (customerId) references customer(id);
select Customers.name as Customers from Customers 
Left join Orders 
on Customers.id = Orders.customerId
where Orders.customerId is null;