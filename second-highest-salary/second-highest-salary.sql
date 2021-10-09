# Write your MySQL query statement below
select distinct  max(Salary) as SecondHighestSalary from Employee 
where Salary  not in (select max(salary) from Employee);