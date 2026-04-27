# Write your MySQL query statement below
select Ea.unique_id , e.name from Employees e
left join EmployeeUNI Ea on Ea.id = e.id;