create table student(name varchar(20),stuid int,regno varchar(20),address varchar(20),phoneno varchar(20));
desc student;
create table marks(mark1 int,mark2 int,mark3 int,mark4 int,mark5 int);
desc marks;
insert into student values('Monisha',101,73772114165,'Tiruchengode',7603892641);
insert into student values('Shainthavi',102,73772114166,'Namakkal',7603856849);
insert into student values('Nikitha',103,73772114167,'Erode',1234592641);
insert into student values('Shamritha',104,73772114168,'Tiruchengode',7125892641);
select * from student where name='Nikitha';
select * from student where name LIKE '%a';
select * from student;
alter table student modify regno varchar(20) primary key;
alter table marks add regno varchar(20);
insert into marks values(95,98,88,96,92,73772114165);
insert into marks values(92,95,85,96,92,73772114166);
insert into marks values(95,98,85,97,92,73772114167);
insert into marks values(95,95,88,90,94,73772114168);
select * from marks;
drop table student;
select s.name,s.stuid,s.regno,s.address,s.phoneno
from student s
left join marks m
on m.regno=s.regno;