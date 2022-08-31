drop table freeboard;
create table freeboard(
kind varchar2(50) not null,
idx number default(0) primary key, 
title varchar2(100) not null,
content clob, 
readCount number default(0) not null,
groupID number not null, 
depth number not null, 
groupSeq number not null, 
writeID varchar2(50) not null,
writeName varchar2(50) not null,
writeDay date not null,
isdel number(1) check(isdel in(0,1))
);
create sequence free_idx_seq increment by 1 start with 1;
commit
select count(*) from freeboard;
select max(idx) from freeboard;

