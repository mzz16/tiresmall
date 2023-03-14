create table ask_account (
aa_id varchar2(20 char) primary key,
aa_pw varchar2(20 char) not null
);
insert into ask_account values('id', 'pw');
select * from ask_account;
drop table ask_account;



create table ask_nonmember (
an_number number(20) primary key
);
insert into ask_nonmember values('1');
select * from ask_nonmember;
drop table ask_nonmember;



create table ask (
a_number number(5) primary key,
a_owner_fk varchar2(20 char) not null,
a_sortation varchar2(20 char) not null,
a_title varchar2(20 char) not null,
a_text varchar2(2000 char) not null,
a_date date not null,
a_status varchar2(20 char) not null
);
create sequence ask_seq;
alter table ask
add constraint ask_constraint
foreign key (a_owner_fk)
references ask_account (aa_id)
on delete cascade;
insert into ask values(ask_seq.nextval, 'id', '상품', '상품문의입니다', '상품문의내용', sysdate, '답변대기');
insert into ask values(ask_seq.nextval, 'id', '결제', '결제문의입니다', '결제문의내용', sysdate, '답변대기');
insert into ask values(ask_seq.nextval, 'id', '장착', '장착문의입니다', '장착문의내용', sysdate, '답변대기');
insert into ask values(ask_seq.nextval, 'id', '기타', '기타문의입니다', '기타문의내용', sysdate, '답변대기');
select * from ask;
drop table ask;


select	rownum as rownumber,
					a_number,
					a_sortation,
					a_title,
					a_date,
					a_status
			from (
				select *
				from ask, ask_account
				where a_owner_fk = aa_id
				order by a_date asc
			)
			order by rownumber desc
            
            
            select *
        from (
			select	rownum as rownumber,
					a_number,
					a_sortation,
					a_title,
					a_date,
					a_status
			from (
				select *
				from ask, ask_account
				where a_owner_fk = aa_id
				order by a_date asc
			)
        )
			order by rownumber desc



create table ask_reply (
ar_number number(5) primary key,
ar_number_fk number(5) not null,
ar_text varchar2(2000 char) not null,
ar_date date not null,
    constraint ask_reply_constraint
    foreign key (ar_number_fk)
    references ask (a_number)
    on delete cascade
);
create sequence ask_reply_seq;
insert into ask_reply values(ask_reply_seq.nextval, 121, '내용', sysdate);
select * from ask_reply;
drop table ask_reply;