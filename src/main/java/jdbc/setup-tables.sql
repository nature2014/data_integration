drop table if exists person;
create table IF NOT EXISTS person(id int not null primary key , name varchar(100), gender tinyint(1), identitycard varchar(18),birthday datetime,flagtime datetime);
insert into person(id,name,gender,identitycard,birthday,flagtime) values(1,'peter',1,'34088119850323341X','1985-03-23',now());
insert into person(id,name,gender,identitycard,birthday,flagtime) values(2,'michael',1,'34088119850323341X','1986-04-23',now());
insert into person(id,name,gender,identitycard,birthday,flagtime) values(3,'jack',1,'34088119850323341X','1982-04-21',now());
