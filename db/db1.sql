create  database bank
use bank
drop database bank
create database bank
use bank
create table bank_accounts(accountno varchar(100) not null primary key,
              customer_name varchar(100),
              home_branch varchar(100));
alter table bank_accounts add phoneno int not null
select * from bank_accounts
alter table bank_accounts add branch_code tinyint not null after customer_name,add branchPhno bigint after phoneno
alter table bank_accounts add useless int not null
select * from bank_accounts
alter table bank_accounts drop useless
alter table bank_accounts change column branch_code brcode int not null
alter table bank_accounts modify branchPhno varchar(15) not null
insert into bank_accounts values(1112,'donald trump',4,'chennai',8989897676,4345456543)
select * from bank_accounts
insert into bank_accounts values(1223,'Obama',44,'chennai',8989897643,4345456544)
select * from bank_accounts
insert into bank_accounts values(1243,'George Bush',423,'chennai',8787878787,8989898989)
alter table bank_accounts modify brcode int not null
select * from bank_accounts
insert into bank_accounts values(1342,'Bill Clinton',423,'chennai',8787878786,8989898980)
insert into bank_accounts values(1322,'hillary Clinton',423,'chennai',8787878789,8989898983)
use bank
select * from bank_accounts
update bank_accounts set brcode=444 where customer_name='hillary Clinton'