# Write your MySQL query statement below
select c.name as Customers from Customers c
left join Orders o on c.id = o.customerId
where not exists(select 1 from Orders
where o.customerId = c.id);
