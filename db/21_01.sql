use bank
show tables
create table cust_details(cust_id varchar(100) primary key not null ,cust_name varchar(100) not null,cust_address varchar(100) not null,cust_contact varchar(100) not null,cust_email varchar(100) not null,cust_age varchar(100) not null)
insert into cust_details values('00000001','ravi','Navalur','9089098789','ravi@gmail.com','22')
insert into cust_details values('00000002','ramesh','Tirupati','9089098786','ramesh@gmail.com','22')
insert into cust_details values('00000003','raghu','Chennai','9089098729','raghu@gmail.com','21')
insert into cust_details values('00000004','mahesh','Navalur','9089498789','mahesh@gmail.com','35')
insert into cust_details values('00000005','bush','America','9089034543','bush@gmail.com','56')
insert into cust_details values('00000006','trump','America','9089012239','trump@gmail.com','65')
insert into cust_details values('00000007','modi','india','9089076789','modi@gmail.com','69')
insert into cust_details values('00000008','jagan','andhra','9088076789','modi@gmail.com','69')
insert into cust_details values('00000009','babu','andhra','9239096789','modi@gmail.com','69')
insert into cust_details values('00000010','sita','andhra','8989096569','sita@gmail.com','69')
select * from cust_details
select distinct cust_name,cust_email from cust_details
select distinct cust_age from cust_details
select * from cust_details order by cust_name desc
select cust_name,cust_address from cust_details where cust_id <= 5 order by cust_name asc
select cust_address ,count(*) from cust_details group by cust_address

select cust_name ,min(cust_id) as "least account number"
from cust_details
group by cust_name;

use bank
select cust_name
from cust_details
where cust_address like 'an%'

select cust_name
from cust_details
where cust_address like '%i'

select cust_name
from cust_details
where cust_address like '%er%'

select cust_name
from cust_details
where cust_address like 'Ameri_a%'

select cust_name
from cust_details
where cust_address not like 'Ameri_a%'

select * 
from cust_details
where cust_name in('ravi','ramesh','raghu')

select * 
from cust_details
where cust_name not in('ravi','ramesh','raghu')

select *
from cust_details
where cust_id between 00000003 and 00000008

alter table cust_details add cust_dob date not null



use bank
update cust_details set cust_dob ='1994-03-23' where cust_name='ravi'
select *
from cust_details

update cust_details set cust_dob ='1994-09-30' where cust_id=00000002
update cust_details set cust_dob ='1995-01-12' where cust_id=00000003
update cust_details set cust_dob ='1991-05-30' where cust_id=00000004
update cust_details set cust_dob ='1992-02-12' where cust_id=00000005
update cust_details set cust_dob ='1998-01-30' where cust_id=00000006
update cust_details set cust_dob ='1995-08-30' where cust_id=00000007
update cust_details set cust_dob ='1954-07-30' where cust_id=00000008
update cust_details set cust_dob ='1964-03-30' where cust_id=00000009
update cust_details set cust_dob ='1974-04-30' where cust_id=00000010

select * from cust_details
use emp 
select * from department