create database emp
use emp
drop table project
create table project(project_id varchar(10) primary key not null,project_name varchar(30) not null)
create table department(dp_id varchar(10) primary key not null,dp_name varchar(20) not null )
drop table employee
create table employee(emp_id varchar(10) primary key not null, emp_name varchar(30) not null, salary varchar(20) not null, doj date not null, dob date not null, age varchar(3) not null,dp_id varchar(10), foreign key(dp_id) references department(dp_id))
select * from employee
describe employee
alter table employee add designation varchar(50) not null after emp_name
select * from employee

/*22-01-2020*/

use emp
select * from employee
select * from department
alter table department modify dp_name varchar(50) not null
insert into department values('LKM','Learning and Knowledge Management')
insert into department values('JavaCap','Java Capability')
insert into department values('.NETcap','Dotnet Capability')

delete from department where dp_name ='Learning and Knowledge Management'
delete from department where dp_id ='.NETcap'
delete from department where dp_id ='JavaCap'
select * from department
insert into department values('1001','LKM')
insert into department values('1002','JavaCap')
insert into department values('1003','>NETcap')

insert into employee values('7001','cynthya','CEO','800000','1997-02-14','1975-05-12','','1001')
insert into employee values('7002','mario','MD','500000','1998-04-16','1976-02-14','','1001')
insert into employee values('7001','cynthya','CEO','800000','1997-02-14','1975-05-12','','1001')
insert into employee values('7001','cynthya','CEO','800000','1997-02-14','1975-05-12','','1001')
insert into employee values('7001','cynthya','CEO','800000','1997-02-14','1975-05-12','','1001')
insert into employee values('7001','cynthya','CEO','800000','1997-02-14','1975-05-12','','1001')
insert into employee values('7001','cynthya','CEO','800000','1997-02-14','1975-05-12','','1001')
insert into employee values('7001','cynthya','CEO','800000','1997-02-14','1975-05-12','','1001')
insert into employee values('7001','cynthya','CEO','800000','1997-02-14','1975-05-12','','1001')
insert into employee values('7001','cynthya','CEO','800000','1997-02-14','1975-05-12','','1001')

use sakila
select * from actor

select *  
from actor
where first_name='Scarlett'

select * 
from
where last_name='Johansson'

select count(distinct last_name) from actor

select distinct last_name from actor

select last_name from actor group by last_name having count(*)=1

select last_name from actor group by last_name having count(*)>1

update department set dp_name ='NETCap' where dp_id='1003'

select * from department
select * from employee

select employee.emp_id,employee.emp_name,department.dp_name 
from department
right join employee
on department.dp_id=employee.dp_id