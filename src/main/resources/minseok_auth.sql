create table auth(
    a_id varchar2(30 char) PRIMARY key,
    a_pw varchar2(20 char) not null,
    a_Sortation varchar2(10 char)not null,  -- 회원관리자 구분
    a_name varchar2(20 char) not null,
    a_phone varchar2(20 char) not null,
    a_address varchar2(50 char) not null,
    a_date DATE not null        --만든날
);

create table my_car(
    mc_number number(5) PRIMARY key,
    mc_id varchar2(50 char )not null,
    mc_model varchar2(50 char )not null,
    mc_brand varchar2(50 char )not null,
    mc_year number(4)not null
);

insert into auth  values('mz1004','mz1004','관리자','mz','01012341234','서울',sysdate);
insert into auth  values('ms1004','ms1004','관리자','민석','01012341234','충청남도',sysdate);
insert into auth  values('yw1004','yw1004','회원','영웅','01012341234','대구',sysdate);
insert into auth  values('jh1004','jh1004','회원','재현','01012341234','인천',sysdate);
insert into auth  values('hg1004','hg1004','회원','한길','01012341234','서울',sysdate);
insert into auth  values('gn1004','gn1004','회원','건우','01012341234','부산',sysdate);

select * from auth;

drop table auth;