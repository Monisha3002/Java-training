create table emp(name varchar(20),empid int,role varchar(20),salary int);
desc emp
create table dept(empid int,deptname varchar(20));
desc dept
    
insert into emp values('Monisha',101,'HR',100000);
insert into emp values('Shainthavi',102,'Manager',90000);
insert into emp values('Nikitha',103,'HR',150000);
insert into emp values('Shamritha',104,'TL',80000);

insert into dept values(101,'CSE');
insert into dept values(102,'IT');
insert into dept values(103,'CSE');
insert into dept values(104,'IT');

select * from dept;
select * from emp;

select * from emp where empid=102;
select * from emp where name like '%a';
select * from emp where role in 'TL';
select * from emp where salary between 100000 and 200000;

select e.name,e.empid,e.role,e.salary,d.deptname
    from emp e
join dept d
on e.empid=d.empid;

select max(salary) as maximum_salary from emp;
select min(salary) as minimum_salary from emp;
select sum(salary) as sum_salary from emp;
select avg(salary) as average_salary from emp;
select variance(salary) as variance_salary from emp;
select stddev(salary) as standard_deviation_salary from emp;

select count(*) from dept;
select count(deptname) from dept;
select distinct role from emp;

select e.name,e.empid,e.role,e.salary,d.deptname
    from emp e
join dept d
on e.empid=d.empid
order by empid desc;

select role,max(salary) from emp group by role;