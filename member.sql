select id from member where id='sg';
drop table member;
create table member(
id varchar2(10) primary key,
password varchar2(10) not null,
nickname varchar2(10) unique,
email varchar2(50) not null
);

insert into member values('sg','test','test','a@a.a');
commit


