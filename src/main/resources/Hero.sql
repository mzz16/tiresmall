alter table notice rename column n_data to n_date;

insert into notice values(notice_seq.nextval, '매장', '고마워 재현아', 'ㅋㅋ', sysdate);

select * from notice;


select * from notice where n_title like '%고%' and n_sortation like '%%';

create table auth(
    a_id varchar2(30char) primary key,
    a_pw varchar2(20char) not null,
    a_name varchar2(15char) not null,
    a_phone varchar2(13char) not null,
    a_address varchar2(100char) not null,
    a_date date not null
)

select * from auth;

insert into auth values('wm', '123', '박영웅', '010-8968-9002', '서울 종로구 종각 솔데스크 802호', sysdate);
insert into auth values('wm2', '123', '박영웅2', '010-8968-9002', '서울 종로구 종각 솔데스크 802호', sysdate);
insert into auth values('wm3', '123', '박영웅3', '010-8968-9002', '서울 종로구 종각 솔데스크 802호', sysdate);

create table notice(
    n_no number(5) primary key,
    n_sortation varchar2(20 char) not null,
    n_title varchar2(100 char) not null,
    n_txt varchar2(2000 char) not null,
    n_date date not null
)

select * from notice;
drop taBLE NOTICE;

delete from faq;
drop table faq;

create table faq(
    f_no number(5) primary key,
    f_sortation varchar2(20 char) not null,
    f_title varchar2(100 char) not null,
    f_txt varchar2(2000 char) not null,
    f_date date not null
)

create sequence faq_seq;

insert into faq values(faq_seq.nextval, '회원', '테스트용 인서트', '테스트용 안쪽 txt 내용물입니다', sysdate);

select * from faq;

drop table qna cascade constraint purge

create table qna(
    q_no number(5) primary key,
    q_title varchar2(100 char) not null,
    q_txt varchar2(2000 char) not null,
    q_date date not null,
    q_id varchar2(30 char) not null,
    q_reply_has number(1) default 0 not null,
    constraint a_q_id
    foreign key(q_id)
    references auth (a_id)
    on delete cascade
);
drop table qna;
create sequence qna_seq;
insert into qna values(qna_seq.nextval, 'qna 1대1 문의 테스트 제목', 'qna 내용 테스트', sysdate, 'wm', default);
insert into qna values(qna_seq.nextval, 'qna 1대1 문의 테스트 제목22', 'qna 내용 테스트11', sysdate, 'wm2',default);
insert into qna values(qna_seq.nextval, 'qna 1대1 문의 테스트 제목33', 'qna 내용 테스트22', sysdate, 'wm2',default);
insert into qna values(qna_seq.nextval, 'qna 1대1 문의 테스트 제목44', 'qna 내용 테스트33', sysdate, 'wm3',default);
insert into qna values(qna_seq.nextval, 'qna 1대1 문의 테스트 제목55', 'qna 내용 테스트44', sysdate, 'wm3',default);

select q_no, q_title, q_txt, q_date, q_id, q_reply_has, a_id, a_name
from qna, auth where q_id = a_id order by q_no
delete qna;
select *from qna;
create table qna_reply(
    q_reply_no number(5) primary key,
    q_reply_txt varchar2(2000char) not null,
    q_reply_date date not null,
    q_reply_board_no number(5) not null,
    constraint reply_q_id
    foreign key(q_reply_board_no)
    references qna (q_no)
    on delete cascade
);
drop table qna_reply cascade constraint purge;
select q.*, a.a_id, a.a_name, qr.q_reply_board_no
from qna q, auth a, qna_reply qr where q.q_id = a.a_id and q.q_no = qr.q_reply_board_no order by q_no

insert into qna_reply values(qna_reply_seq.nextval,'굿',sysdate,62);
create sequence qna_reply_seq;
select * from qna_reply;
delete qna_reply;


			select q.*, a.a_id, a.a_name
			from qna q, auth a where q.q_id = a.a_id and
            a_name = '' and
            a_id = '' and
            q_title like '%'||?||'%'
            order by q_no;
delete qna_reply;
       drop table qna_reply;     
select q.*, a.a_id, a.a_name
			from qna q, auth a 
            where q.q_id = a.a_id and
            a_name = '박영웅2' and
            a_id = 'wm2' and
            q_title like '%%'
            order by q_no;            
    
        
select q_no, q_title, q_txt, q_date, q_id, q_reply_has, a_id, a_name
from qna, auth where q_id = a_id order by q_no        