create table branch (
b_id varchar2(20 char) primary key,
b_sortation varchar2(20 char) not null,
b_area varchar2(30 char) not null,
b_addr varchar2(100 char) not null,
b_name varchar2(20 char) not null,
b_time varchar2(50 char) not null,
b_service varchar2(100 char) not null,
b_mapdata varchar2(2000 char) not null,
b_manager varchar2(20 char) ,
b_managernumber number(11) ,
b_branchname varchar2(20 char) ,
b_branchnumber number(11) ,
b_cr varchar2(20 char)  ,
b_email varchar2(30 char)	

);

insert into branch values('id','직영점','성남','중원구','현식','평일낮','한국타이어','대충지도','1','2','3','4','5','6');
insert into branch values('id2','제휴장착점','서울','강남구','민지','일요일','서울타이어','섬세지도','1','2','3','4','5','6');
insert into branch values('id3','직영점','서울','강북구','유리','월요일','강북타이어','알찬지도','1','2','3','4','5','6');



drop table branch;

select * from branch;