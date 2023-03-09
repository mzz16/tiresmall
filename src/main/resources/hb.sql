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
b_managernumber varchar2(13 char) ,
b_branchname varchar2(20 char) ,
b_branchnumber varchar2(13 char) ,
b_cr varchar2(20 char)  ,
b_email varchar2(30 char),	
b_file varchar2(2000 char)
);

insert into branch values('id3','직영점','성남','중원구','현식','평일낮','한국타이어','대충지도','1','2','3','4','5','6','a.jpg');
insert into branch values('id4','제휴장착점','서울','강남구','민지','일요일','서울타이어','섬세지도','1','2','3','4','5','6','a.jpg');
insert into branch values('id5','제휴장착점','서울','강남구','민지','일요일','서울타이어','섬세지도','1','2','3','4','5','6','a.jpg');
insert into branch values('id6','제휴장착점','서울','강남구','민지','일요일','서울타이어','섬세지도','1','2','3','4','5','6','a.jpg');
insert into branch values('id7','제휴장착점','서울','강남구','민지','일요일','서울타이어','섬세지도','1','2','3','4','5','6','a.jpg');
insert into branch values('id8','제휴장착점','서울','강남구','민지','일요일','서울타이어','섬세지도','1','2','3','4','5','6','a.jpg');
insert into branch values('id9','제휴장착점','서울','강남구','민지','일요일','서울타이어','섬세지도','1','2','3','4','5','6','a.jpg');
insert into branch values('id10','제휴장착점','서울','강남구','민지','일요일','서울타이어','섬세지도','1','2','3','4','5','6','a.jpg');
insert into branch values('id11','제휴장착점','서울','강남구','민지','일요일','서울타이어','섬세지도','1','2','3','4','5','6','a.jpg');
insert into branch values('id12','제휴장착점','서울','강남구','민지','일요일','서울타이어','섬세지도','1','2','3','4','5','6','a.jpg');
insert into branch values('id13','제휴장착점','서울','강남구','민지','일요일','서울타이어','섬세지도','1','2','3','4','5','6','a.jpg');
insert into branch values('id14','제휴장착점','서울','강남구','민지','일요일','서울타이어','섬세지도','1','2','3','4','5','6','a.jpg');
insert into branch values('id15','제휴장착점','서울','강남구','민지','일요일','서울타이어','섬세지도','1','2','3','4','5','6','a.jpg');
insert into branch values('id16','제휴장착점','서울','강남구','민지','일요일','서울타이어','섬세지도','1','2','3','4','5','6','a.jpg');

오재호 가데이터 ----------------------------------
insert into branch values('1','직영점','대전광역시서구','신갈마로 83 (갈마동)','타이어쇼핑몰','평일 : 08:30 ~ 19:00 / 토요일 08:30 ~ 16:00 (일요일 휴무)','한국타이어,넥센타이어,금호타이어,미쉐린타이어,컨티넨탈타이어,피넬리타이어,휠얼라인먼트,경정비,수입차정비 / 본사직영매장','36.3417632, 127.3663178','1','042-545-8008','3','4','5','6','a.jpg');
insert into branch values('2','제휴장착점','대전광역시유성구','죽동 707-2번지','타이어테크','평일 : 08:30 ~ 19:00 / 토요일 08:30 ~ 16:00 (일요일 휴무)','한국타이어, 금호타이어,넥센타이어, 타이어렌탈전문점, 휠얼라이먼트, 합성오일 전문점','36.369228, 127.338054','1','010-4417-2220','3','4','5','6');
insert into branch values('3','제휴장착점','충청남도논산시','시민로 262 논산타이어 (내동)','타이어테크 시청점','평일 : 08:30 ~ 19:00 / 토요일 08:30 ~ 16:00 (일요일 휴무)','한국타이어,넥센타이어,금호타이어,미쉐린타이어,컨티넨탈타이어,피넬리타이어,휠얼라인먼트,경정비,수입차정비 / 본사직영매장','36.1900937, 127.0954606','1','2','3','4','5','6','a.jpg');
insert into branch values('4','제휴장착점','충청남도논산시','연무읍 왕릉로13번길 38 타이어테크 연무점','타이어테크 연무점','평일 : 08:30 ~ 19:00 / 토요일 08:30 ~ 16:00 (일요일 휴무)','한국타이어,넥센타이어,금호타이어,미쉐린타이어,컨티넨탈타이어,피넬리타이어,휠얼라인먼트,경정비,수입차정비 / 본사직영매장','36.1188693, 127.0984388','1','2','3','4','5','6','a.jpg');
insert into branch values('5','제휴장착점','충청남도 논산시','해월로252 타이어테크 반월점 (로얄카)','타이어테크 반월점 (로얄카)','평일 : 08:30 ~ 19:00 / 토요일 08:30 ~ 16:00 (일요일 휴무)','한국,금호,넥센타이어,각종수입타이어,타이어 렌탈,휠얼라이먼트,경정비','36.208517, 127.0937896','1','010-7267-2220','3','4','5','6','a.jpg');



delete from branch where b_id = '1';
delete from branch where b_id = '2';
delete from branch where b_id = '3';
delete from branch where b_id = '4';
delete from branch where b_id = '5';


alter table branch modify b_managernumber varchar2(13char);

delete branch;

drop table branch;


		select count(*)
		from branch
		where b_branchname like '%%'

select * from branch;


		select *
		from
		(select rownum as rn, b_id, b_sortation, b_area, b_addr, b_name , b_time ,
		b_service , b_mapdata, b_manager , b_managernumber , b_branchname,
		b_branchnumber ,b_cr ,b_email,b_file
		from(
		select * from branch where b_branchname like '%%'
		)
		) where rn &gt;= #{start} and rn &lt;= #{end}

		
-------------------------------------------------------------------------
		
		create table Car(
		c_id varchar2(20 char) primary key,
		c_name varchar2(20 char) not null,
		c_year1 varchar2(9 char) not null,
		c_year2 varchar2(9 char) not null,
		c_option varchar2(20 char) not null,
		c_brand varchar2(20 char) not null,
		c_ft varchar2(40 char) not null,
		c_bt varchar2(40 char) not null,
		c_file varchar2(2000 char)
		);
		
		
		
		
insert into Car values('123','X101','2014','2016','에어백','대우','12313154','2534533','a.jpg');
insert into Car values('456','X202','2013','2017','아기유모차','기아','12313154','2534533','b.jpg');
insert into Car values('789','X203','2012','2018','선루프','BMW','12313154','2534533','c.jpg');

		
		
select * from Car;

		
drop table Car;




	select *
		from
		(select rownum as rn,
		c_id,c_name,c_year1,c_year2,c_option,c_brand,c_ft,c_bt,c_file
		from(
		select * from
		Car where
		c_name like '%'||#{carnameInput}||'%'
		)
		) where rn &gt;= #{start} and rn &lt;= #{end}



select rownum as rn,
		c_id,c_name,c_year1,c_year2,c_option,c_brand,c_ft,c_bt,c_file from Car




		create table car_brand(
		cb_name varchar2(20 char)primary key,
		cb_ea varchar2(20 char) not null,
		cb_order varchar2(20 char) not null
		);
		
		
		
		
		
		
		
insert into car_brand values('대우','1','234');
insert into car_brand values('BMW','1','234');
insert into car_brand values('기아','1','234');


select * from car_brand;

drop table car_brand;



