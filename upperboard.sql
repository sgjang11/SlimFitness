drop sequence upper_idx_seq;
create sequence upper_idx_seq increment by 1 start with 1;
drop table lowerboard;
create table lowerboard(
idx number primary key,
kind varchar2(50) not null,
title varchar2(100) not null,
content clob,
writeDay date not null,
fileName1 varchar2(1024),
fileName2 varchar2(1024),
isdel number(1) check(isdel in(0,1))
);